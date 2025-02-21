package Task_21Feb;

// Changing Data Types of the Arguments-Method overloading
class Product1{
    public int multiply(int a,int b)
    {
        int prod=a*b;
        return prod;
    }
    public double multiply(double a,double b)
    {
        double prod=a*b;
        return prod;
    }

}






public class Hello {
    public static void main(String[] args) {
        Product1 p1=new Product1();
        double s=p1.multiply(5.5,5.9);
        int s1=p1.multiply(5,9);

        System.out.println("Product is:"+s);
        System.out.println("Product is:"+s1);

    }

}
