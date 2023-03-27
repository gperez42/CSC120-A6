/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(int nCoffeOunces, int nSugarPackets, int nCreams, int nCups) {
        // System.out.println("You have built a cafe: ☕");
        
    }
    
    public static void main(String[] args) {
        new Cafe();
    }
    
}
