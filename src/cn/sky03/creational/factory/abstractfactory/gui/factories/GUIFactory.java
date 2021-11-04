package cn.sky03.creational.factory.abstractfactory.gui.factories;

import cn.sky03.creational.factory.abstractfactory.gui.buttons.Button;
import cn.sky03.creational.factory.abstractfactory.gui.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
