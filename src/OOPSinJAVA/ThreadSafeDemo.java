package OOPSinJAVA;

public class ThreadSafeDemo {
    public static void main(String[] args) throws InterruptedException {

        TSafe tSafe = new TSafe();
        SharedObject obj = new SharedObject();
        obj.setVal1(1);
        Thread t1 = new Thread(() -> {
            tSafe.synchronizedMethod(obj);
        });
        Thread t2 = new Thread(() -> {
            tSafe.synchronizedMethod(obj);
        });
        Thread t3 = new Thread(() -> {
            tSafe.synchronizedMethod(obj);
        });
        Thread t4 = new Thread(() -> {
            tSafe.synchronizedMethod(obj);
        });
        Thread t5 = new Thread(() -> {
            tSafe.synchronizedMethod(obj);
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println(obj.getVal1());
    }

    private static class TSafe {
        public synchronized void synchronizedMethod(SharedObject obj) {
            System.out.println(Thread.currentThread().getName() + " Enters");
            int objVal = obj.getVal1();
            objVal++;
            obj.setVal1(objVal);
            System.out.println(Thread.currentThread().getName() + " Exits");
        }
    }

    private static class SharedObject {
        int val1;
        public int getVal1() {
            return val1;
        }
        public void setVal1(int val1) {
            this.val1 = val1;
        }
    }
}
