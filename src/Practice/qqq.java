package Practice;

public class qqq {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("IPHONE", 2009);
        System.out.println(iphone.model_name);
        System.out.println(iphone.year);

    }
}


    class Mobile {
        String model_name;
        int year;



        Mobile(String model_name, int year) {
            this.model_name = model_name;
            this.year = year;
        }
    }





