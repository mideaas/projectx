package com.arvue.apps.projectx;

import com.vaadin.addon.touchkit.ui.NavigationManager;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@SuppressWarnings("serial")
public class App extends UI {
	
	@Override
	protected void init(VaadinRequest request) {
		Main view = new Main();
        view.setSizeFull();
        setContent(new NavigationManager(view));
        
	}
}
