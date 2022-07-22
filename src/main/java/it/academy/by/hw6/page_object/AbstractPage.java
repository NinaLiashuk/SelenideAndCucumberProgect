package it.academy.by.hw6.page_object;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public abstract class AbstractPage {

    public AbstractPage(){
        Configuration.startMaximized = true;
        Configuration.pageLoadTimeout = 200000;
        open();
    }
}
