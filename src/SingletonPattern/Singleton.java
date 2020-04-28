package SingletonPattern;

public class Singleton {
    private static Singleton instance;
    //no parameter should be passed on singleton constructor
    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Fabliha is dancing non sync  " );
            synchronized (Singleton.class) {
                if (instance == null) {
                    System.out.println("Fabliha is dancing sync  ");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    private Singleton() {


    }

    //Method synchronization
    private synchronized void func1() {
        //do()
    }


    // block synchronization
    private void func2() {
        synchronized (this) {
            //do()
        }
    }
}
