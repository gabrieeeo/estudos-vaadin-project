package com.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("") // The @Route annotation turns this class into a view, mapping it to the root URL ("/") of the application.
@PageTitle(value = "Hello, Vaadin!!!!") //The @PageTitle annotation, is for sets page title of web page
public class MainView extends VerticalLayout{ // MainView extends VerticalLayout (it's layout component) for children vertically
    public MainView() {
        add(new H1("Hello, Vaadin!")); //H1 and H2 is a componente that corresponds to the HTML (a top-level heading)
        add(new H2("Isso é satisfatório."));
        add(new H3("It's cool"));
        add(new Button("Say Hello", event -> add(new Span("Hello, it's Vaadin broooo"))));
    }
}
