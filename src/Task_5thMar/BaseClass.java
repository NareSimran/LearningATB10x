package Task_5thMar;

import Practice.SubClass;

public class BaseClass {

    protected String message = "This is a protected variable!";


    protected void displayMessage() {
        System.out.println(message);
    }
}

class h3{
    public static void main(String[] args) {
        // Creating an instance of SubClass
        SubClass subObj = new SubClass();

        // Calling the showMessage method, which accesses protected members of BaseClass
        subObj.showMessage();
    }
}
