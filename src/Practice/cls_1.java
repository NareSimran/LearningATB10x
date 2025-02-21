package Practice;

public class cls_1 {
    public static void main(String[] args) {
  Son s=new Son();
  s.t1();
    }
}

    class Father {
        Father() {
            System.out.println("DC Father");

        }

        int land = 200;

        void home() {
            System.out.println("Father Home");
        }
    }


    class Son extends  Father{
            Son(){
                super();
            }



    void t1(){
        System.out.println( super.land);
        super.home();
    }
}

