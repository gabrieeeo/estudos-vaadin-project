package com.example;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

/* The @Route annotation turns this class into a view, mapping it to the root URL ("/") of the application. */
@Route("")
@PageTitle(value = "Hello, Vaadin!!!!")
public class MainView extends VerticalLayout{
    public MainView() {
        add(new H1("Hello, Vaadin!"));
        add(new H2("Isso é satisfatório."));
    }
}
