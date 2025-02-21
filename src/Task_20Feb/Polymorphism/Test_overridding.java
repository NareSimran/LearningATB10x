package Task_20Feb.Polymorphism;

class Parent{
    void Print(){
        System.out.println("Parent class");
    }
}

class Child1 extends Parent{
    void Print(){
        System.out.println("child 1");
    }
}

class Child2 extends Parent{
    void Print(){
        System.out.println("child 2");
    }
}



public class Test_overridding {
    public static void main(String[] args) {
        Parent a=new Child1();
        a.Print();
        Parent a1=new Child2();
        a1.Print();
    }
}
