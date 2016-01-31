public class Manager {
    private static Manager manager = new Manager();
    private Manager() {
        System.out.println("constructor");
    }

    public static Manager getInstance() {
        return manager;
    }

    public void function() { 
        System.out.println("funcion is called");
    }
}


public class Test {
    public static void main(String[] argc) {
        Manager.getInstance().function();
    }
}