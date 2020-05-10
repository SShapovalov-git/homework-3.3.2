public class main {
    public static void main(String[] args) {
        float bill = 100.10f;
        int payroll = 1500;
        float balance;
        boolean action = true;
        if (payroll >= 1000) {
            balance = bill + payroll + (payroll / 100);
        } else {
            balance = bill + payroll;
        }


        System.out.println(balance);
    }
}