package Task_16Feb_Abstraction;

public class Print_Book extends Book{

    @Override
    void getDetails(String name, String author, int price) {
        System.out.println(name+","+author+","+price);
    }

}
