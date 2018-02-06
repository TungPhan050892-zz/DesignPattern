package com.tungphan.designpatternsample.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by TungPhan on 1/3/18.
 */

public abstract class ObjectPool<T> {
    private long expirationTime;
    private Hashtable<T, Long> locked;
    private Hashtable<T, Long> unlocked;

    protected abstract T create();

    public abstract boolean validate(T t);

    public abstract void expire(T t);

    public synchronized T checkOut() {
        final long now = System.currentTimeMillis();
        T t;
        if (unlocked.size() > 0) {
            Enumeration<T> e = unlocked.keys();
            while (e.hasMoreElements()) {
                t = e.nextElement();
                if ((now - unlocked.get(t)) > expirationTime) {
                    unlocked.remove(t);
                    expire(t);
                    t = null;
                } else {
                    if (validate(t)) {
                        unlocked.remove(t);
                        locked.put(t, now);
                        return (t);
                    } else {
                        unlocked.remove(t);
                        expire(t);
                        t = null;
                    }
                }
            }
        }
        t = create();
        locked.put(t, now);
        return t;
    }

    public synchronized void checkIn(T t) {
        locked.remove(t);
        unlocked.put(t, System.currentTimeMillis());
    }
}
