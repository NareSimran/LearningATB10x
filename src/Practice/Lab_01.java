package Practice;

public class Lab_01 {
    public static void main(String[] args) {
  A aa=new A();
  aa.display();
    }
}


class A extends Blr {

    @Override
    void start() {
        System.out.println("Pls start");
    }

    void display() {
        start();
        System.out.println("hello");
        stop();

    }
}


    abstract class Blr {
        abstract void start();

        void stop() {
            System.out.println("Pls stop");
        }

    }
