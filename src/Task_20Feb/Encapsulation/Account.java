package Task_20Feb.Encapsulation;

public class Account {
    //Private data members
    private long acc_no;
    private String name,email;
    private float amount;

//private getter and setter methods
    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public float getAmount() {
        return amount;
    }



    public String getEmail() {
        return email;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }




}
