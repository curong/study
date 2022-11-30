package wooj.study.beginner.iface.system;

import wooj.study.beginner.iface.system.impl.AinterfaceImpl;

public class AObj {

    Ainterface ainterface = new AinterfaceImpl();

    // 위임한다
    public void funcB() {
        ainterface.funcA();
        ainterface.funcA();
    }


}
