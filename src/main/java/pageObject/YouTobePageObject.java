package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTobePageObject {
    @FindBy(xpath = "//input[@name = 'search']")
    WebElement input;
    @FindBy(xpath = "//button[contains(@class, 'topbar-menu-button-avatar-button')]")
    WebElement searchButton;

    public void sentInInputNoWar(){
        this.searchButton.click();
        this.input.sendKeys("No War");
        this.input.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
