package AbstractFactoryPattern.test;

public class StreamProgrammer extends Programmer {
    private String name;

    public StreamProgrammer(String name) {
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

    @Override
    public void doTask() {
        writeCode();
        debug();
    }
}

