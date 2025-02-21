package Task_20Feb;

public class Vehicle {


    protected String color="Blue";
    public void honk(){
        System.out.println("HOOOO");
    }
}
//Single Inheritance
class Car extends  Vehicle
{
    private String modelName="Baleno";

    public static void main(String[] args) {

        Car c=new Car();
        c.honk();
        System.out.println(c.color +" "+ c.modelName);
    }
}

