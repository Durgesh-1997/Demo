package OOPSinJAVA;

public class DataHiding {
    public static void main(String[] args) {

        Balance b = new Balance();
        int bal = b.getX();
        System.out.println(bal);

    }
}


class Balance{


    private int x = 10000;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }





}