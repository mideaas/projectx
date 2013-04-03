package com.arvue.apps.projectx;

import java.io.InputStream;
import com.vaadin.ui.*;
import com.vaadin.addon.touchkit.ui.*;

import org.vaadin.teemu.clara.Clara;
public class Main extends CustomComponent {

    private final static String CLARA_XML_FILE = "com/arvue/apps/projectx/Main.clara.xml";

    public Main() {
        super();

    }
    
    @Override
    public void attach() {
        super.attach();
        InputStream is = getClass().getClassLoader().getResourceAsStream(CLARA_XML_FILE);
        MainController controller = new MainController();
        Component root = Clara.create(is, controller);
        setCompositionRoot(root);
        controller.setRootComponent(root);
    }
    
}
