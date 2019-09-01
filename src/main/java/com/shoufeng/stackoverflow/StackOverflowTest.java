package com.shoufeng.stackoverflow;

/**
 * 利用递归造成栈溢出StackOverflowError
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
