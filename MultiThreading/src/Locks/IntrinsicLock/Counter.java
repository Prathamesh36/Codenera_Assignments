package Locks.IntrinsicLock;

//1. Intrinsic Lock / Monitor Lock
//This is the default lock associated with every object in Java.
//
//Used with synchronized blocks or methods.
//
//When a thread enters a synchronized block/method, it acquires the lock of the object.
//
//Other threads trying to access the same synchronized block wait until the lock is released.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    Lock lock = new ReentrantLock();

    public void criticalSection() {
        StampedLock lock = new StampedLock();

// optimistic read
        long stamp = lock.tryOptimisticRead();
        int value = sharedVar;
// validate if there was no write during the read
        if (!lock.validate(stamp)) {
            // fallback to read lock
            stamp = lock.readLock();
            try {
                value = sharedVar;
            } finally {
                lock.unlockRead(stamp);
            }
        }


    }
}
//Here, the synchronized keyword ensures that only one thread can execute increment() at a time.