class Ctest1 implements Runnable {
    private String id;

    public Ctest1(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10000; j++)
                ;
            System.out.println(id + "is running..");
        }
    }
}

public class app15_2 {
    public static void main(String[] args) {
        Ctest1 dog = new Ctest1("doggy");
        Ctest1 cat = new Ctest1("kitty");

        Thread t1 = new Thread(dog);
        Thread t2 = new Thread(cat);

        t1.start(); // call start() instead of run
        t2.start();
    }
}
