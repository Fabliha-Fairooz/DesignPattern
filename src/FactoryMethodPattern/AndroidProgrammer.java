package FactoryMethodPattern;

class AndroidProgrammer extends Programmer {
    private String name;

    public AndroidProgrammer(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println(name + " is writing code");
    }

    @Override
    public void debug() {
        System.out.println(name + " is debugging code");
    }
}