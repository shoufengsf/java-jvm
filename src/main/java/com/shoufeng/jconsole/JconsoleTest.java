package com.shoufeng.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于给jconsole监控gc的样例
 *
 * -Xmx10M -Xmn5M -verbose:gc -XX:+PrintGCDetails
 *
 * @author shoufeng
 */
public class JconsoleTest {

    private byte[] bytes = new byte[1024];

    public static void main(String[] args) throws InterruptedException {
        List<JconsoleTest> jconsoleTestList = new ArrayList<JconsoleTest>();
        while (true){
            new JconsoleTest();
        }
//        for (int i = 0; i < 10000; i++) {
//            Thread.sleep(100L);
//            new JconsoleTest();
//        }
    }
}
