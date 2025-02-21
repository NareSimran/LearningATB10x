package Task_20Feb.Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Account a =new Account();
        a.setAcc_no(899899);
        a.setName("Sim");
        a.setEmail("sim@gmail.com");
        a.setAmount(7888f);

        System.out.println(a.getAcc_no()  + " " +a.getName()  + " " +a.getEmail()  + " " +a.getAmount());

    }
}
