package Task_21Feb;

//Changing the Order of the Parameters of Methods-Method overloading
class Student
{
    public void StudentId(String name, int roll_no)
    {
        System.out.println("Name :" + name + " "
                + "Roll-No :" + roll_no);
    }

    // Method 2
    public void StudentId(int roll_no, String name)
    {
        // Again printing name and id of person
        System.out.println("Roll-No :" + roll_no + " "
                + "Name :" + name);
    }
}





public class GFG {
    public static void main(String[] args) {
        Student obj = new Student();

        // Passing name and id
        // Note: Reversing order
        obj.StudentId("Uuu21", 1);
        obj.StudentId(2, "Shree");
    }

}
