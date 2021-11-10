package cn.sky03.creational.builder.simpleBuilder.components;

public class Engine {
    private final String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
