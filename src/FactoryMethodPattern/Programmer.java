package FactoryMethodPattern;

public abstract class Programmer {
    public abstract void writeCode();
    public abstract void debug();
    public void dance(String programmerName) {
        System.out.println(programmerName + " is dancing");
    }
}