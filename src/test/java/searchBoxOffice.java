import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class searchBoxOffice {
    private Object js;

    @Test
    public void ticketBoxOffice () throws InterruptedException {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "/Users/reinhart/Documents/chromedriver/chromedriver");
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.navigate().to("https://21cineplex.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//select[@class='custom-select']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='custom-select']")));
        dropdown.sendKeys("MEDAN");
        driver.findElement(By.xpath("//select/option[@value='25']")).click();
        //box_office_element = wait.until(EC.presence_of_all_elements_located(By.xpath("//img[@alt='R17+']")));

        WebElement element = driver.findElement(By.xpath("//*[@alt='R17+']"));
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", element);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='R17+']")));
        WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@alt='R17+']"));
        boolean checkButtonPresence = TxtBoxContent.isDisplayed();
        Assert.assertTrue(checkButtonPresence);
        System.out.println("R17+");
        //System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
        //String text =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='R17+']"))).getText();
        //Assert.assertEquals("R17+", driver.findElement(By.xpath("//*[@alt='R17+']")).getText());
        //assertEquals("specific text", driver.findElement(By.xpath("xpath)).getText());
        //Assert.assertTrue(TxtBoxContent.getAttribute("value").contains(("R17+")));
        //driver.close();

//        Actions action = new Actions(driver);
//        action.moveToElement(dropdown).click().perform();
//        boolean optionalFound= false;
//        for (int i = 0; i < 40; i++){
//            action.sendKeys(Keys.ARROW_DOWN).perform();
//            WebElement selectedOption=dropdown.findElement(By.xpath("//select/option[@value='25']"));
//            if (selectedOption.getText().equals("MEDAN")){
//                optionalFound = true;
//                break;
//            }
//        }
//        if (!optionalFound){
//            throw new RuntimeException("Option not found in dropdown");
//        }
//        WebElement option = driver.findElement(By.xpath("//select/option[contains(@text, 'MEDAN')]"));
//        option.click();


        //List<WebElement> optionList = driver.findElements(By.xpath("//select/option[@value='90']"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", optionList.get(1) );
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //WebElement boxes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select/option[@value='25']"))).findElement(By.xpath("//select/option[@value='90']"));
        //List<WebElement> checkBoxes = boxes.findElements()

        //WebElement menuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select/option[@value='25']"))).findElement(By.xpath("//select/option[@value='90']"));
        //Actions action = new Actions(driver);
        //action.moveToElement(menuItem);
        //action.perform();
        //menuItem.click();

        //WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select/option[@value='25']")));driver.findElement(By.xpath("//select/option[@value='25']"));
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        //Thread.sleep(500);

    }
}
