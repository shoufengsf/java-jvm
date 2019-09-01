package com.shoufeng.oom;

import java.util.ArrayList;

/**
 * 内存溢出
 *
 * @author shoufeng
 */
public class OOMTest {
    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<byte[]>();
        while (true) {
            byte[] bytes = new byte[1024 * 1024];
            list.add(bytes);
        }
    }
}
