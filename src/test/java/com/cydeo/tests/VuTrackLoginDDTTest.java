package com.cydeo.tests;

import com.cydeo.pages.wytrack.VyTrackDashboardPage;
import com.cydeo.pages.wytrack.VyTrackLoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class VuTrackLoginDDTTest {

    VyTrackLoginPage loginPage = new VyTrackLoginPage();
    VyTrackDashboardPage dashboardPage = new VyTrackDashboardPage();

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("vytrack.url"));
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void loginDDTTest() throws IOException {

        String path = "VytrackSample.xlsx";


        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Data");

        for (int rowNum = 1; rowNum<=sheet.getLastRowNum(); rowNum++){

            String username = sheet.getRow(rowNum).getCell(0).toString();
            String password = sheet.getRow(rowNum).getCell(1).toString();
            String firstname = sheet.getRow(rowNum).getCell(2).toString();
            String lastname = sheet.getRow(rowNum).getCell(3).toString();

            loginPage.login(username, password);

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
            WebElement loaderMask = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));

            String actualFullname = dashboardPage.fullName.getText();
            XSSFCell resultCell = sheet.getRow(rowNum).getCell(4);

            if (actualFullname.contains(firstname) && actualFullname.contains(lastname)){
                System.out.println("passed");
                resultCell.setCellValue("PASS");
            } else {
                System.out.println("failed");
                resultCell.setCellValue("FAIL");
            }

            dashboardPage.logout();
        }

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);

        fileInputStream.close();
        workbook.close();
        outputStream.close();

    }

}
