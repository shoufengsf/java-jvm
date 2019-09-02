package com.shoufeng.stackoverflow;

/**
 * 利用递归造成栈溢出StackOverflowError
 * -Xss128K 设置栈大小
 * @author shoufeng
 */
public class StackOverflowTest {
    public void methond1(){
        methond1();
    }

    public static void main(String[] args) {
        new StackOverflowTest().methond1();
    }
}
