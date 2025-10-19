public class bai16 {
     private String id;
    private String name;
    private int balance;

    public bai16(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public bai16(String id, String name) {
        this(id, name, 0);
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }
 
    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        balance += amount;
    }

    public void debit(int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            balance -= amount;
        }
    }

    public void transferTo(bai16 anotherAccount, int amount) {
        if (amount > balance) {
            System.out.println("Amount exceeded balance");
        } else {
            this.balance -= amount;
            anotherAccount.credit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
