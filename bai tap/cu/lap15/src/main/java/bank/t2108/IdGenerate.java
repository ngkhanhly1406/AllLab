package bank.t2108;

import java.util.concurrent.locks.ReentrantLock;

public class IdGenerate {
    private static Long id = 0l;
    private static ReentrantLock lock = new ReentrantLock();
    public static Long getNewID(){
        Long result;
        lock.lock();//khoa
        //tranh
        try {
            result = ++id; //tang roi gan
        } finally {
            lock.unlock(); //tang roi
            //nhieu
        }
        return result;
    }
    private IdGenerate(){}
}
