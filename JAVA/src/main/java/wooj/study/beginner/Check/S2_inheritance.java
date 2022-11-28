package wooj.study.beginner.Check;

import wooj.study.beginner.s2_inheritance.Customer;
import wooj.study.beginner.s2_inheritance.VIPCustomer;

public class S2_inheritance {
    public static void main(String[] args) {
        Customer customer = new Customer(10010, "정재우");
        customer.setBonusPoint(1000);

        VIPCustomer customer2 = new VIPCustomer(10020, "정재우2", 12345);
        customer2.setBonusPoint(10000);

        int price = 10000;

        System.out.println(customer.getCustomerName() + " 님이 지불하는 금액은 " + customer.calcPrice(price) + " 원 입니다.");
        System.out.println(customer2.getCustomerName() + " 님이 지불하는 금액은 " + customer2.calcPrice(price) + " 원 입니다.");


        /* 가상 메소드 */
        Customer vc = new VIPCustomer(10030, "가상 메소드", 3000);
        vc.setBonusPoint(1000);

        System.out.println(vc.getCustomerName() + " 님이 지불하는 금액은 " + vc.calcPrice(price) + " 원 입니다.");

    }
}
