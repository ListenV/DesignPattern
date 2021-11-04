package cn.sky03.creational.factory.abstractfactory.gui.factories;

import cn.sky03.creational.factory.abstractfactory.gui.buttons.Button;
import cn.sky03.creational.factory.abstractfactory.gui.buttons.WindowsButton;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.Checkbox;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
