package AbstractFactoryPattern.test;

public class ProgrammerFactory extends EmployeeFactory {
    public static Employee create(String type, String name) {
        if ("Android".equals(type)) {
            Programmer programmer = new AndroidProgrammer(name);
            return programmer;
        } else if ("Stream".equals(type)) {
            Programmer programmer = new StreamProgrammer(name);
            return programmer;
        }
        return null;
    }
}
