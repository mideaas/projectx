package com.arvue.apps.projectx;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.Component;

@SuppressWarnings("serial")
public class App extends UI {
    @Override    protected void init(VaadinRequest request) {
        Component c = new Main();
        c.setSizeFull();
        setContent(new NavigationManager(c));
    }

    public static class MideaasController {
        public void componentCreated(NavigationView view) {}
        
        // jeje2123
    }

}
