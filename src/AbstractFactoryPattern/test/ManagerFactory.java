package AbstractFactoryPattern.test;

public class ManagerFactory {
    public static Employee create(String type, String name) {
        Manager manager = null;
        if ("HR".equals(type)) {
            manager = new HrManager(name);
        } else if ("Finance".equals(type)) {
            manager = new FinanceManager(name);
        }
        return manager;
    }
}
