package org.vaadin.mideaas;

import org.vaadin.teemu.clara.Clara;
import com.vaadin.ui.CustomComponent;

@SuppressWarnings("serial")
public abstract class MideaasComponent extends CustomComponent {
  private boolean loaded = false;
	
	public MideaasComponent() {
		super();
		loadXml();
	}
	
	private void loadXml() {
		if (!loaded) {
			String cls = this.getClass().getName();
			String path = cls.replace('.', '/');
			String model = path + ".clara.xml";
			setCompositionRoot(Clara.create(getClass().getClassLoader()
					.getResourceAsStream(model), this));
			loaded = true;
		}
	}
}
