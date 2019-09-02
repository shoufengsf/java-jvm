package com.shoufeng.outofmemory;

import java.util.ArrayList;

/**
 * 内存溢出
 * -XX:+PrintGCDetails 控制台输出gc详情
 * -Xms20M 初始堆大小
 * -Xmx20M 最大堆内存
 * -Xmn10M 年轻代大小
 * @author shoufeng
 */
public class OutOfMemoryTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        while (true) {
            byte[] bytes = new byte[1024 * 1024];
            list.add(bytes);
        }
    }
}
