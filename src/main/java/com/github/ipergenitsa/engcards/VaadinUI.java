package com.github.ipergenitsa.engcards;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Calendar;
import com.vaadin.ui.ColorPicker;
import com.vaadin.ui.Label;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {
    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout mainLayout = new VerticalLayout();
        Panel panel = new Panel();
        VerticalLayout panelContent = new VerticalLayout();
        VerticalLayout panelMarginLayout = new VerticalLayout();
        Panel marginPanel = new Panel();
        Label label = new Label("Hello!");
        panelMarginLayout.addComponent(label);
        panelMarginLayout.addComponent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!", Notification.Type.TRAY_NOTIFICATION)));
        panelMarginLayout.addComponent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!", Notification.Type.WARNING_MESSAGE)));
        panelMarginLayout.addComponent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!", Notification.Type.HUMANIZED_MESSAGE)));
        panelMarginLayout.addComponent(new ColorPicker());
        panelContent.addComponent(panelMarginLayout);
        marginPanel.setContent(panelMarginLayout);
        marginPanel.setWidth(80, Unit.PERCENTAGE);
        panelContent.addComponent(marginPanel);
        panelContent.setComponentAlignment(marginPanel, Alignment.MIDDLE_CENTER);
        panelContent.setWidth(100, Unit.PERCENTAGE);
        panel.setContent(panelContent);
        panel.setWidth(70, Unit.PERCENTAGE);
        mainLayout.addComponent(panel);
        mainLayout.setSizeFull();
        mainLayout.setComponentAlignment(panel, Alignment.TOP_CENTER);
        setContent(mainLayout);
    }
}
