package Task_20Feb;
interface Parent {
    void mother();
}

interface Parent1{
    void father();
}
class Family implements  Parent,Parent1{

    @Override
    public void mother() {
        System.out.println("Mother Feature");
    }

    @Override
    public void father() {
        System.out.println("Father Feature");
    }
}





public class BigFamily {
    public static void main(String[] args) {
        Family f=new Family();
        f.mother();
        f.father();
    }
}
