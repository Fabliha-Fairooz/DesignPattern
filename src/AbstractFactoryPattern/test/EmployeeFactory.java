package AbstractFactoryPattern.test;

public abstract class EmployeeFactory {
    public static Employee create(String employeeType, String positionType, String name) {
        Employee employee = null;
        if ("Manager".equals(employeeType)) {
            employee = ManagerFactory.create(positionType, name);
        } else if ("Programmer".equals(employeeType)) {
            employee = ProgrammerFactory.create(positionType, name);
        }
        return employee;
    }
}
