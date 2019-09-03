package com.shoufeng.objectdead;

/**
 * 循环引用样例
 * @author shoufeng
 */
public class CircularReferenceTest {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classA.classB = classB;
        classB.classA = classA;
    }
}

class ClassA{
    ClassB classB;
}

class ClassB{
    ClassA classA;
}
