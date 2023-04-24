import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/demiangodon/selenium_drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("ScrollToElement.java");


/*        driver.get("http://formy-project.herokuapp.com/dropdown");

        WebElement downDownMenu = driver.findElement(By.id("dropdownMenuButton"));
        downDownMenu.click();

        WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
*/
/*        driver.get("http://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.sendKeys("05/05/2023");
        dateField.sendKeys(Keys.RETURN);
*/
/*        driver.get("http://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
*/
/*        WebElement input = driver.findElement(By.cssSelector("input[data-test='email-input']"));
        input.sendKeys("Hello world");
*/
/*        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name =  driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Demian Godon");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2023");
*/
        //driver.quit();
    }
}
