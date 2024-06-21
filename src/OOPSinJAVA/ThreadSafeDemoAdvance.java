package OOPSinJAVA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeDemoAdvance {
    public static void main(String[] args) throws InterruptedException {
        TSafe tSafe = new TSafe();
        SharedObject obj = new SharedObject();
        obj.setVal1(1);
        SharedObject obj2 = new SharedObject();
        obj2.setVal1(1);
        ExecutorService executor = Executors.newFixedThreadPool(10000);
//        System.out.println(System.currentTimeMillis());
//        simpleLoop(tSafe, obj);
        System.out.println(System.currentTimeMillis());
        multithreadedLoop(tSafe, obj2, executor);
        System.out.println(System.currentTimeMillis());
    }

    public static void simpleLoop(TSafe t, SharedObject object) {
        for (int i=0; i<10000000; i++) {
            t.synchronizedMethod(object);
        }
        System.out.println(object.getVal1());
    }

    public static void multithreadedLoop(TSafe t, SharedObject object, ExecutorService executor) throws InterruptedException {
        for (int i=0; i<10000000; i++) {
            Thread thread = new Thread(() -> {
                t.synchronizedMethod(object);
            });
//            thread.start();
//            thread.join();
            executor.submit(thread);
        }
        executor.shutdown();
        System.out.println(object.getVal1());
    }

    private static class TSafe {
        public synchronized void synchronizedMethod(SharedObject obj) {
//            System.out.println(Thread.currentThread().getName() + " Enters");
            int objVal = obj.getVal1();
            objVal++;
            obj.setVal1(objVal);
//            System.out.println(Thread.currentThread().getName() + " Exits");
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
