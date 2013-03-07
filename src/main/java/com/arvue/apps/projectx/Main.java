package com.arvue.apps.projectx;

import java.io.InputStream;
import com.vaadin.ui.*;
import com.vaadin.addon.touchkit.ui.*;
import org.vaadin.teemu.clara.Clara;
public class Main extends CustomComponent {

    private final static String CLARA_XML_FILE = "com.arvue.apps.projectx".replace(".","/") + "/Main.clara.xml";

    public Main() {
        super();

    }
    
    @Override
    public void attach() {
        super.attach();
        InputStream is = getClass().getClassLoader().getResourceAsStream(CLARA_XML_FILE);
        setCompositionRoot(Clara.create(is, new MainController()));
        
    }
    
    // TODO: start coding


}
