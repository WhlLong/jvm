package com.whl.jvm.gc;

/**
 * jvm参数
 * -XX:NewSize=10485760          初始新生代大小10M
 * -XX:MaxNewSize=10485760    最大新生代大小10M
 * -XX:InitialHeapSize=20971520  初始堆内存大小20M
 * -XX:MaxHeapSize=20971520  最大堆内存大小20M
 * -XX:SurvivorRatio=8          E:S:S = 8:1:1
 * -XX:MaxTenuringThreshold=15      最大晋升年龄
 * -XX:PretenureSizeThreshold=3145728  大对象阈值为3MB
 * -XX:+UseParNewGC
 * -XX:+UseConcMarkSweepGC
 * -XX:+PrintGCDetails
 * -XX:+PrintGCTimeStamps
 * -Xloggc:fullgc.log
 */
public class FullGcDemo {

    public static void main(String[] args) {
        byte[] array1 = new byte[4 * 1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
        byte[] array3 = new byte[2 * 1024 * 1024];
        byte[] array4 = new byte[2 * 1024 * 1024];
        byte[] array5 = new byte[128 * 1024];

        byte[] array6 = new byte[2 * 1024 * 1024];
    }

}
