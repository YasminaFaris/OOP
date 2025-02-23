public class Fraction {
    public int topN;
    public int btmN;
    
    public String toFraction(){
        return topN+"/"+btmN;
    }
    public double toFloat(){
        return (double) topN / btmN;
    }
    public void addFraction(Fraction f){
        if (this.btmN == f.btmN){
            this.topN = this.topN + f.topN;
        }else {
            this.topN = (this.topN * f.btmN)+(f.topN * this.btmN);
            this.btmN = this.btmN * f.btmN;
        }
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before " + f1.toFraction());
        System.out.println("before " + f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after " + f1.toFraction());
        System.out.println("after " + f1.toFloat());
    }
}