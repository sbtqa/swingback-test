package varivoda.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Main page")
public class MainPage extends Page {

    @FindBy(xpath = ".//input[@id='lst-ib']")
    @ElementTitle("input")
    public WebElement input;

    
}
