package com.whl.jvm.gc;

/**
 * 运行参数
 * -XX:NewSize=5242880           初始新生代大小5M
 * -XX:MaxNewSize=5242880      最大新生代大小
 * -XX:InitialHeapSize=10485760    初始堆内存  10M
 * -XX:MaxHeapSize=10485760      最大堆内存  10M
 * -XX:SurvivorRatio=8             E:S:S = 8:1:1
 * -XX:PretenureSizeThreshold=10485760       大对象阈值10M
 * -XX:+UseParNewGC            新生代使用ParNew收集器
 * -XX:+UseConcMarkSweepGC      老年代使用CMS收集器
 * <p>
 * -XX:+PrintGCDetils：打印详细的gc日志
 * -XX:+PrintGCTimeStamps：这个参数可以打印出来每次GC发生的时间
 * -Xloggc:gc.log：这个参数可以设置将gc日志写入一个磁盘文件
 * <p>
 * 按照这种参数    最终新生代5M   Eden区域4M  两个Survivor区域0.5M  老年代5M
 */
public class YgcDemo {

    public static void main(String[] args) {

        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }

}
