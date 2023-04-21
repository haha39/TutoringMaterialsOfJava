class Ctest2 extends Thread {
    private String id;

    public Ctest2(String str) {
        id = str;
    }

    public void run() { // override
        for (int i = 0; i < 4; i++) {
            try {
                sleep((int) (1000 * Math.random()));
            } catch (InterruptedException e) {
            }
            System.out.println(id + "is running..");
        }
    }
}

public class app15_3 {
    public static void main(String[] args) {
        Ctest dog = new Ctest("doggy");
        Ctest cat = new Ctest("kitty");

        dog.start(); // call start() instead of run
        cat.start();
    }
}