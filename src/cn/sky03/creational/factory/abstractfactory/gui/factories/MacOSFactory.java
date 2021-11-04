package cn.sky03.creational.factory.abstractfactory.gui.factories;

import cn.sky03.creational.factory.abstractfactory.gui.buttons.Button;
import cn.sky03.creational.factory.abstractfactory.gui.buttons.MacOSButton;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.Checkbox;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
