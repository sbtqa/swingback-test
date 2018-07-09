package varivoda.web;

import org.openqa.selenium.By;
import ru.sbtqa.tag.pagefactory.Page;
import ru.sbtqa.tag.pagefactory.PageFactory;
import ru.sbtqa.tag.pagefactory.annotations.ActionTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.exceptions.PageInitializationException;

@PageEntry(title = "Search page")
public class SearchPage extends Page {

    public SearchPage() throws PageInitializationException {
        PageFactory.initElements(PageFactory.getDriver(), this);
    }
    
    @ActionTitle("click first link")
    public void clickFirstLink() {
        PageFactory.getDriver().findElement(By.xpath("//div[@id='search']//a")).click();
    }
}
