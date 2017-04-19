package varivoda.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

@PageEntry(title = "Main page")
public class MainPage extends Page {

    @FindBy(xpath = ".//input[@id='lst-ib']")
    @ElementTitle("input")
    public WebElement input;
    
    @FindBy(xpath = ".//*[@id='_fZl']")
    @ElementTitle("submit")
    public WebElement submit;
    
    public MainPage() throws PageInitializationException {
        PageFactory.initElements(PageFactory.getDriver(), this);
    }
    
}
