
package colina.it2b;



public class loanapp {
   int id;
    String name;
    double mon;
    double credit;
    int exloans;
    

    public loanapp(int id, String name, double mon, double credit, int exloans) {
        this.id = id;
        this.name = name;
        this.mon = mon;
        this.credit = credit;
        this.exloans = exloans;
 
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + String.format("%.1f", mon) + "\t" + String.format("%.f", credit) + "\t" + exloans + "\t";
    }
}

