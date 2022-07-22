package it.academy.by.hw6.navigation;

import com.codeborne.selenide.Selenide;
import it.academy.by.hw6.page_object.AbstractPage;
import it.academy.by.hw6.page_object.OnlinerHeaderPage;

public class OpenOnlinerPage extends AbstractPage {

    private static final String ONLINER_URL = "https://onliner.by";

    public static OnlinerHeaderPage openOnlinerHeaderPage(){
        Selenide.open(ONLINER_URL);
        return new OnlinerHeaderPage();
    }
}
