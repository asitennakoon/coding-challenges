package designpatterns.java;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        // Lazy initialization i.e. instance is only initialized when requested. Eager initialization is when the
        // instance is already initialized from the beginning.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}