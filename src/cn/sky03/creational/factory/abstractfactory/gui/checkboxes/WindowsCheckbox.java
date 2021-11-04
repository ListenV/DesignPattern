package cn.sky03.creational.factory.abstractfactory.gui.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
