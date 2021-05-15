package testsold;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * 
 *
 * @author misha
 */

public class testweb {
    
    public static WebDriver driver;
    @Before
    public void setup(){
        driver = new ChromeDriver();
    }
    @Test
    public void test1() throws Exception{
        
        driver.navigate().to("http://localhost:8080/map");
        
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("1");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("2");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("2");
        driver.findElement(By.name("mapy")).sendKeys("2");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("3");
        driver.findElement(By.name("mapy")).sendKeys("3");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("4");
        driver.findElement(By.name("mapy")).sendKeys("4");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapdelete"+Integer.toString(4)+"+"+Integer.toString(4))).click();
        driver.navigate().to("http://localhost:8080/map");
        final List<WebElement> elements=driver.findElements(By.name("mapdelete"+Integer.toString(4)+"+"+Integer.toString(4)));
        (new WebDriverWait(driver,30)).until((ExpectedCondition<Boolean>)(WebDriver d)->d.getPageSource().contains("3")
                                                    && (elements.isEmpty()));
        driver.findElement(By.name("mapdeleteall")).click();
        driver.navigate().to("http://localhost:8080/map");
        final List<WebElement> elements2=driver.findElements(By.name("mapdelete"+Integer.toString(1)+"+"+Integer.toString(1)));
        (new WebDriverWait(driver,30)).until((ExpectedCondition<Boolean>)(WebDriver d)->d.getPageSource().contains("mapdeleteall")
                                                    && (elements2.isEmpty()));
        
    }
    @Test
    public void test2() throws Exception{
        
        driver.navigate().to("http://localhost:8080/map");
        driver.findElement(By.name("mapx")).sendKeys("-1");
        driver.findElement(By.name("mapy")).sendKeys("-1");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("3");
        driver.findElement(By.name("mapy")).sendKeys("3");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("toPath")).click();
        driver.findElement(By.name("pathx1")).sendKeys("1");
        driver.findElement(By.name("pathy1")).sendKeys("1");
        driver.findElement(By.name("pathx2")).sendKeys("1");
        driver.findElement(By.name("pathy2")).sendKeys("1");
        driver.findElement(By.name("pathsend")).click();
        driver.findElement(By.name("pathx1")).clear();
        driver.findElement(By.name("pathy1")).clear(); 
        driver.findElement(By.name("pathx2")).clear();
        driver.findElement(By.name("pathy2")).clear();
        driver.findElement(By.name("pathx1")).sendKeys("1");
        driver.findElement(By.name("pathy1")).sendKeys("1");
        driver.findElement(By.name("pathx2")).sendKeys("2");
        driver.findElement(By.name("pathy2")).sendKeys("2");
        driver.findElement(By.name("pathsend")).click();
        driver.findElement(By.name("pathx1")).clear();
        driver.findElement(By.name("pathy1")).clear(); 
        driver.findElement(By.name("pathx2")).clear();
        driver.findElement(By.name("pathy2")).clear();
        driver.findElement(By.name("pathx1")).sendKeys("-10");
        driver.findElement(By.name("pathy1")).sendKeys("1");
        driver.findElement(By.name("pathx2")).sendKeys("2");
        driver.findElement(By.name("pathy2")).sendKeys("2");
        driver.findElement(By.name("pathsend")).click();
        driver.findElement(By.name("pathx1")).clear();
        driver.findElement(By.name("pathy1")).clear(); 
        driver.findElement(By.name("pathx2")).clear();
        driver.findElement(By.name("pathy2")).clear();
        final List<WebElement> elements=driver.findElements(By.name("pathdelete"+Integer.toString(1)+"+"+Integer.toString(1)+"+"+Integer.toString(1)+"+"+Integer.toString(1)));
        driver.findElement(By.name("pathdelete"+Integer.toString(-10)+"+"+Integer.toString(1)+"+"+Integer.toString(2)+"+"+Integer.toString(2))).click();
        (new WebDriverWait(driver,30)).until((ExpectedCondition<Boolean>)(WebDriver d)->d.getPageSource().contains("1,1")  
                                                && d.getPageSource().contains("Удалите все пути для изменения карты")
                                                && (!elements.isEmpty()));
    }
    @Test
    public void test3() throws Exception{
        
        driver.navigate().to("http://localhost:8080/map");
        driver.navigate().to("http://localhost:8080/map");
        driver.findElement(By.name("mapx")).sendKeys("-1");
        driver.findElement(By.name("mapy")).sendKeys("-1");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("3");
        driver.findElement(By.name("mapy")).sendKeys("3");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).clear();
        driver.findElement(By.name("mapy")).clear();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("1");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("2");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("3");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("4");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("5");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("mapx")).sendKeys("1");
        driver.findElement(By.name("mapy")).sendKeys("6");
        driver.findElement(By.name("send")).click();
        driver.findElement(By.name("toPath")).click();
        for(int i=0;i<100;i++){
        driver.findElement(By.name("pathx1")).sendKeys("1");
        driver.findElement(By.name("pathy1")).sendKeys("1");
        driver.findElement(By.name("pathx2")).sendKeys("1");
        driver.findElement(By.name("pathy2")).sendKeys("6");
        driver.findElement(By.name("pathsend")).click();
        driver.findElement(By.name("pathx1")).clear();
        driver.findElement(By.name("pathy1")).clear(); 
        driver.findElement(By.name("pathx2")).clear();
        driver.findElement(By.name("pathy2")).clear();
        }
        
        
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
}
