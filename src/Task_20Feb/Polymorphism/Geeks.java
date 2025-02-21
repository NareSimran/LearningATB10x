package Task_20Feb.Polymorphism;

class Test{

    //Method Overloading
    static int Add(int a,int b){
        return  a+b;
    }

    static double Add(double a,double b){
        return  a+b;
    }
}



public class Geeks{
    public static void main(String[] args) {
        System.out.println(Test.Add(5,8));
        System.out.println(Test.Add(5.5,6.4));
    }

}


