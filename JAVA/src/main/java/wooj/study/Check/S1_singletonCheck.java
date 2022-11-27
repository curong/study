package wooj.study.Check;

import wooj.study.s1_singleton.Company;

public class S1_singletonCheck {
    public static void main(String[] args) {

        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println( "C1 == C2 ? => " + c1.equals(c2) );
    }
}