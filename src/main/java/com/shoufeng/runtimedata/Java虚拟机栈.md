# Java虚拟机栈

与程序计数器一样Java虚拟机栈也是**线程私有**的，它的**生命周期与线程相同**，虚拟机栈描述的是**Java方法*执行***的**内存模型**：**每个方法**在执行的同时都会创建一个**栈帧**用于存储**局部变量表**、**操作数栈**、**动态链接**、**方法出口信息**等。每个方法从调用直至执行完成的过程，就对应一个栈帧在Java虚拟机栈中入栈到出栈的过程。

**局部变量表**存放了编译器可知的各种基本数据类型（boolean、byte、char、short。。。）、对象引用（reference类型，他不等同于对象本身，可能是一个指向对象起始地址的引用指针）和returnAddress类型（指向了一个字节码指令的地址）。

**异常**：如果线程请求的**栈深度*大于***虚拟机**允许的深度**，将抛出**StackOverflowError**异常。如果虚拟机栈可以动态拓展，如果拓展时**无法申请到足够内存**，就会抛出**OutOfMemoryError**。

**注意**：《深入java虚拟机第二版》5.3.1 returnAddress被用来实现Java程序中的finally字句。

