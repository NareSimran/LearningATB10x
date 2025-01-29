package functions;

public class Lab_001 {
    public static void main(String[] args) {
Color();
String name =School_name();
        System.out.println(name);
        check_with_name("Simran");
        int result=sum_of_two_numbers(2,4);
        System.out.println("Sum is :"+result);






    }
// 1.no argument and no return type
     static void Color(){
        System.out.println("Hi,I am no argument and no return type function");
    }

    //2.no argument with return type
    static String School_name(){

        return "hello I am no argument with return type function";
    }
    //3. With Parameters and Without Return Type
    static void check_with_name(String name) {

        System.out.println("Hi, Your name is " + name);
    }

    //4. 4. With Parameters and With Return Type
     static int sum_of_two_numbers(int a, int b){
         return a+b;
        }
}
