package OOPSinJAVA;

public class Account {
    public static void main(String[] args) {

        Balance b = new Balance();
        int bal = b.getX();
        System.out.println(bal);
        b.setX(5555);
        int bal1 = b.getX();
        System.out.println(bal1);
        b.setX(100500);
        int bal2 = b.getX();
        System.out.println(bal2);
    }
}
