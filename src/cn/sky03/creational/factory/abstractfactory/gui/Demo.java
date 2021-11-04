package cn.sky03.creational.factory.abstractfactory.gui;

import cn.sky03.creational.factory.abstractfactory.gui.app.Application;
import cn.sky03.creational.factory.abstractfactory.gui.factories.GUIFactory;
import cn.sky03.creational.factory.abstractfactory.gui.factories.MacOSFactory;
import cn.sky03.creational.factory.abstractfactory.gui.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
