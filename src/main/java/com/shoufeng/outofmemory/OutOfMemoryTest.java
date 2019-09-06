package com.shoufeng.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * 内存溢出
 * -XX:+PrintGCDetails 控制台输出gc详情
 * -Xms20M 初始堆大小
 * -Xmx20M 最大堆内存
 * -Xmn10M 年轻代大小
 * -XX:PermSize10M 永久代大小
 * -XX:MaxPermSize10M 最大永久代大小
 * @author shoufeng
 */
public class OutOfMemoryTest {

    //老生代内存溢出
    public void method1(){
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        while (true) {
            byte[] bytes = new byte[1024 * 1024];
            list.add(bytes);
        }
    }

    //常量池内存溢出（1.7之前） 元空间内存溢出
    public void method2(){
        List<String> list = new ArrayList<String>();
        int i = 0 ;
        while (true){
            list.add(String.valueOf(i).intern());
            i++;
        }
    }

    public static void main(String[] args) {
        OutOfMemoryTest outOfMemoryTest = new OutOfMemoryTest();
        outOfMemoryTest.method1();
        //outOfMemoryTest.method2();

        //java8环境下
        String value1 = "a";
        String value2 = "a";
        //true
        System.out.println(value1 == value2);
        String value3 = new String("a");
        //false
        System.out.println(value1 == value3);
        //true
        System.out.println(value1 == value3.intern());
    }
}
