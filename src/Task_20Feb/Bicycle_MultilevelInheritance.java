package Task_20Feb;

public class Bicycle_MultilevelInheritance {

    void display(){
        System.out.println("Pedals-Bicycle");
    }

}

class Motorbike extends Bicycle_MultilevelInheritance{
    void display(){
        super.display();
        System.out.println("Added feature by Motorbike-Engine");
    }
}

class ElectricBike extends Motorbike{
    @Override
    void display() {
        super.display();
        System.out.println("Added new feature electric bike battery");
    }
}

class Transport{
    public static void main(String[] args) {
        ElectricBike eb= new ElectricBike();
        eb.display();
    }
}

