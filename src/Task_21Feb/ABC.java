package Task_21Feb;

//1. Changing the Number of Parameters-Method overloading
class Product{
    public int multiply(int a,int b)
    {
        int prod=a*b;
        return prod;
    }
    public int multiply(int a,int b,int c)
    {
        int prod=a*b*c;
        return prod;
    }

}
public class ABC {
    public static void main(String[] args) {
        Product p=new Product();
        int prod1=p.multiply(1,2);
        int prod2=p.multiply(1,4,5);
        System.out.println("Product is:"+prod1);
        System.out.println("Product is:"+prod2);
    }


}
