import AbstractFactoryPattern.test.Employee;
import AbstractFactoryPattern.test.EmployeeFactory;
import FactoryMethodPattern.Programmer;
import FactoryMethodPattern.ProgrammerFactory;
import PrototypePattern.DroneScientist;
import SingletonPattern.Singleton;
import BuilderPattern.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        execute();
    }

    static void execute() {

        //Abstract Factory
        System.out.println("\nExecuting Abstract Factory . . . \n");
        Employee employeeTanveer = EmployeeFactory.create("Programmer", "Android", "Tanveer");
        Employee employeeSuman = EmployeeFactory.create("Programmer", "Stream", "Suman");
        Employee employeeRedwan = EmployeeFactory.create("Manager", "HR", "Redwan");
        Employee employeeNeePhong = EmployeeFactory.create("Manager", "Finance", "Nee Phong");

        employeeTanveer.doTask();
        employeeSuman.doTask();
        employeeRedwan.doTask();
        employeeNeePhong.doTask();

        /////Singleton
        System.out.println("\nExecuting Singleton Pattern . . . \n");
        Singleton s=  Singleton.getInstance();

        //// Factory
        System.out.println("\nExecuting Factory Method . . . \n");
        Programmer aP = ProgrammerFactory.create("Android", "Tanveer");
        Programmer sP = ProgrammerFactory.create("Stream", "Suman");

        aP.writeCode();
        aP.debug();
        aP.dance("Tanveer");

        sP.writeCode();
        sP.debug();
        sP.dance("Suman");
        //Builder
        System.out.println("\nExecuting Builder Pattern . . . \n");
        CarUsingBuilderPatten bCar = new CarUsingBuilderPatten.Builder().withTotalWheels(4).withPassengerMaxCapacity(5)
                .withGasEngine(false).build();
        bCar.run();

        PlaneUsingBuilderPatten bPlane = new PlaneUsingBuilderPatten.Builder().withTotalWheels(18)
                .withPassengerMaxCapacity(200).withGasEngine(true).build();
        bPlane.run();
        //Prototype
        System.out.println("\nExecuting Prototype Pattern . . . \n");
        DroneScientist droneScientist = new DroneScientist(25, "Fabula", DroneScientist.Gender.FEMALE, 5.3f);
        DroneScientist copyFabula = droneScientist.clone(droneScientist);
        System.out.println(droneScientist.hashCode() + " " + copyFabula.hashCode());
        System.out.println(droneScientist.name + " " + copyFabula.name);


    }


}
