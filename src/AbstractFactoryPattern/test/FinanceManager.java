package AbstractFactoryPattern.test;

public class FinanceManager extends Manager {
    private String name;

    public FinanceManager(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public void report() {
        System.out.println(name + " is reporting");
    }

    @Override
    public void doTask() {
        work();
        report();
    }
}
