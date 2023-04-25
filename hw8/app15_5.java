class Ctest3 extends Thread {
    private String id;

    public Ctest3(String str) {
        id = str;
    }

    public void run() { // override
        for (int i = 0; i < 4; i++) {
            try {
                sleep((int) (1000));
            } catch (InterruptedException e) {
            }
            System.out.println(id + " is running..Priority is " + this.getPriority());
        }
    }
}

public class app15_5 {
    public static void main(String[] args) {
        Ctest3 dog = new Ctest3("doggy");
        Ctest3 cat = new Ctest3("kitty");
        Ctest3 rabbit = new Ctest3("rabbit");
        Ctest3 sheep = new Ctest3("sheep");
        Ctest3 horse = new Ctest3("horse");

        cat.setPriority(Thread.MAX_PRIORITY);
        dog.setPriority(Thread.MIN_PRIORITY);
        rabbit.setPriority(7);
        horse.setPriority(3);

        dog.start();
        cat.start();
        rabbit.start();
        sheep.start();
        horse.start();
    }
}
