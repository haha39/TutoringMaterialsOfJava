class Ctest extends Thread {
    private String id;

    public Ctest(String str) {
        id = str;
    }

    public void run() { // override
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10000; j++)
                ;
            System.out.println(id + " is running..");
        }
    }
}

public class app15_1 {
    public static void main(String[] args) {
        Ctest dog = new Ctest("doggy");
        Ctest cat = new Ctest("kitty");

        dog.start(); // call start() instead of run
        cat.start();
    }
}