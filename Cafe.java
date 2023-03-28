/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors) {
        // System.out.println("You have built a cafe: ☕");
        super(name, address, nFloors);
        this.nCoffeeOunces = 200;
        this.nSugarPackets = 1000;
        this.nCreams = 300;
        this.nCups = 500;
    }
 
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams) {
           this.restock(200, 1000, 300, 500);
           // RESTOCKING WITH ORDER OF ORIGINAL AMOUNT THAT CAFE STARTS WITH
        }
        else {
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
        }
      
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces + this.nCoffeeOunces;
        this.nSugarPackets = nSugarPackets + this.nSugarPackets;
        this.nCreams = nCreams + this.nCreams;
        this.nCups = nCups + this.nCups;

    }
    
    public static void main(String[] args) {
        Cafe perezCafe = new Cafe("Perez Cafe", "123 Family St. Magical Place, Somewhere", 2);
        perezCafe.sellCoffee(12, 2, 3);
        System.out.println(perezCafe.nCoffeeOunces);
        System.out.println(perezCafe.nSugarPackets);
        System.out.println(perezCafe.nCreams);
        System.out.println(perezCafe.nCups);
        perezCafe.sellCoffee(200, 1000, 300);
        System.out.println(perezCafe.nCoffeeOunces);
        System.out.println(perezCafe.nSugarPackets);
        System.out.println(perezCafe.nCreams);
        System.out.println(perezCafe.nCups);
        // perezCafe.restock(200, 1000, 300, 500);
        // System.out.println(perezCafe.nCoffeeOunces);
        // System.out.println(perezCafe.nSugarPackets);
        // System.out.println(perezCafe.nCreams);
        // System.out.println(perezCafe.nCups);
    }
    
}
