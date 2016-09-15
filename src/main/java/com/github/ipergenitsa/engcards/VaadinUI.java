package com.github.ipergenitsa.engcards;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
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
        Panel panel = new Panel("This is a Panel");
        Layout panelContent = new VerticalLayout();
        panelContent.addComponent(new Label("Hello!"));
        panelContent.addComponent(new Button("Click me", e-> Notification.show("Hello Spring+Vaadin user!", Notification.Type.TRAY_NOTIFICATION)));
        panel.setContent(panelContent);

        setContent(panel);
    }
}
