package cn.sky03.creational.factory.abstractfactory.gui.app;

import cn.sky03.creational.factory.abstractfactory.gui.buttons.Button;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.Checkbox;
import cn.sky03.creational.factory.abstractfactory.gui.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
