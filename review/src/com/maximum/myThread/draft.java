package com.maximum.myThread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;

public class draft {
    private AtomicInteger count = new AtomicInteger(0);

    public void write() {
        System.out.println("我寻了半生的春天，你一笑便是了。");
        count.incrementAndGet();
    }

    public static void main(String[] args) {
        draft d = new draft();
        d.write();
        d.write();
        System.out.println("共调用了 " + d.count.get() + " 次 write()");
    }
}
