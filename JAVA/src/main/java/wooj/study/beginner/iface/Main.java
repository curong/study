package wooj.study.beginner.iface;

import wooj.study.beginner.iface.system.AObj;
import wooj.study.beginner.iface.system.Ainterface;
import wooj.study.beginner.iface.system.impl.AinterfaceImpl;

public class Main {
    public static void main(String[] args) {
        
        // 통로
        Ainterface ainterface = new AinterfaceImpl();
        ainterface.funcA();

        System.out.println("======================================");

        // 위임 하여 구현 ( 호출 )
        AObj aObj = new AObj();
        aObj.funcB();
    }
}
