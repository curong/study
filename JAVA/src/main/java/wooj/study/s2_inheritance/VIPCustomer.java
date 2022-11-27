package wooj.study.s2_inheritance;

public class VIPCustomer extends Customer {

    private int agentId;
    double saleRatio;


    public VIPCustomer() {
        customerGrade = "VIP";
    }

    public VIPCustomer(int customerId, String customerName, int agentId) {
        super(customerId, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
        System.out.println("VIPCustomer (int, String) 생성자 호출");
    }

    public int getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
