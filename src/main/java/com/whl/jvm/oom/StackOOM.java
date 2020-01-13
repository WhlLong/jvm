package com.whl.jvm.oom;

public class StackOOM {

    public static long counter = 0;

    public static void main(String[] args) {
        work();
    }

    private static void work() {
        System.out.println("第 " + (++counter) + " 次调用方法");
        work();
    }

}
