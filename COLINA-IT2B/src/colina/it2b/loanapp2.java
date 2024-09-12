
package colina.it2b;

public class loanapp2 {
     private final int id;
    private final String name;
    private final double mon;
    private final double credit;
    private final int exloans;
    

    public loanapp2(int id, String name, double mon, double credit, int exloans) {
        this.id = id;
        this.name = name;
        this.mon = mon;
        this.credit = credit;
        this.exloans = exloans;
    }

    private String determineLoanApproval() {
        if (mon >= 30000) {
            return "Approved";
        } else {
            return "Denied";
        }
    }
}
