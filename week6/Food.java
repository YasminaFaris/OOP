
public class Food {
    private static final int energy=10;
    private static double price=50;
    
    public static int getEnergy(){
        return energy;
    }
    public static double getPrice(){
        return price;
    }
    public static void setPrice(double price){
        Food.price = price;
    }
}
