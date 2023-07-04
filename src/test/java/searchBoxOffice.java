import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class searchBoxOffice {
    private Object js;

    @Test
    public void ticketBoxOffice () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        driver.navigate().to("https://21cineplex.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//select[@class='custom-select']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='custom-select']")));
        dropdown.sendKeys("JAKARTA");
        List<WebElement> adultElemets =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='R17+']"))).findElements(By.xpath("//img[@alt='R17+']"));
        Assert.assertTrue(adultElemets.size()>0);
        List<WebElement> movieDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='movie-desc']"))).findElements(By.xpath("//div[@class='movie-desc']"));
        for(int i=0; i<movieDesc.size(); i++){
            WebElement adultType = wait.until(ExpectedConditions.visibilityOf(movieDesc.get(i))).findElement(By.xpath("./child::span"));
            if(adultType.getAttribute("innerHTML").contains("R17+")) {
                System.out.println(movieDesc.get(i).findElement(By.xpath("./child::h4")).getText());
            }
            }
        Thread.sleep(3000);
        driver.close();

        //driver.findElement(By.xpath("//select/option[@value='3']")).click();
        //WebElement -> tipe data, filmList -> nama variable untuk menyimpan film ke element filmlist
        //WebElement filmList = driver.findElement(By.xpath("//select/option[@value='3']"));
        //untuk mendapatkan semua element film dalam daftar
        //java.util.List<WebElement> films = filmList.findElements(By.xpath("//*[@alt='SEMUA UMUR']"));
        //for (int i=0; i<3; i++) {
           // WebElement film = films.get(i);
            //WebElement judulFilmElement = film.findElement(By.xpath("//*[@alt='SEMUA UMUR']"));
            //String judulFilm = judulFilmElement.getText();
            //System.out.println("Film " + (i + 1) + ": " + judulFilm);
        //}
        //WebElement filmPertama = films.get(0);
        //WebElement linkFilm = filmPertama.findElement(By.xpath("//*[@alt='SEMUA UMUR']"));
        //linkFilm.click();
        //box_office_element = wait.until(EC.presence_of_all_elements_located(By.xpath("//img[@alt='R17+']")));





        //WebElement element = driver.findElement(By.xpath("//*[@alt='SEMUA UMUR']"));
        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", element);
        //wait.until(By.xpath(""))
        //List<WebElement>search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='SEMUA UMUR']"))).findElements(By.xpath("//*[@alt='SEMUA UMUR']"));
        //Assert.assertTrue(search.size() >0);
        //for (int i=0;i<5;i++){
        //    System.out.println(search.get(i).getAttribute("innerHTML"));
        //}

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='R17+']")));
        //WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@alt='SEMUA UMUR']")).click();
        //boolean checkButtonPresence = TxtBoxContent.isDisplayed();
        //Assert.assertTrue(checkButtonPresence);
        //System.out.println("SEMUA UMUR");

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
