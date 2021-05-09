/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 *
 * @author misha
 */
public class Pagemap {
    public WebDriver driver;
    public Pagemap(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; 
    }
    @FindBy(xpath = "/html/body/form/div[1]/div/input")
    private WebElement inputx;
    @FindBy(xpath = "/html/body/form/div[2]/div/input")
    private WebElement inputy;
    @FindBy(xpath = "/html/body/form/div[3]/div/input")
    private WebElement input;
    //@FindBy(xpath = "/html/body/div[2]/table/tbody/tr[1]/td[2]")
    //private WebElement x1;
    
    public void inputx(String x){
        inputx.sendKeys(x);
    }
    public void inputy(String y){
        inputy.sendKeys(y);
    }
    public void input(){
        input.click();
    }
    //public String getx1(){
    //    return x1.getText();
    //}
}
