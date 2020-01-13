package com.whl.jvm.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

    public static void main(String[] args) {

        long counter = 0;
        List<Object> list = new ArrayList<Object>();
        while (true) {
            list.add(new byte[512 * 1024]);
            System.out.println("目前已经创建了 " + (++counter) + " 个对象");
        }

    }

}
