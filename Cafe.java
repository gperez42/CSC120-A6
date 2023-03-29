/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor - builds cafes
     * @param name: name of the cafe
     * @param address: address of the cafe
     * @param nFloors: number of floors the cafe has
     */
    public Cafe(String name, String address, int nFloors) {
        // System.out.println("You have built a cafe: ☕");
        super(name, address, nFloors);
        this.nCoffeeOunces = 200;
        this.nSugarPackets = 1000;
        this.nCreams = 300;
        this.nCups = 500;
    }
    /**
     * Sells a coffee to a customer and decreases the stock of the cafe depending on how much of each ingredient the customer requests, then restocks ingredients as needed
     * @param size: size of the coffee the customer wants
     * @param nSugarPackets: number of sugar packets going in the customer's coffee
     * @param nCreams: number of creams going in the customer's coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        // if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams) {
        //    this.restock(200, 1000, 300, 500);
        //    // RESTOCKING WITH ORDER OF ORIGINAL AMOUNT THAT CAFE STARTS WITH
        // }
        // else {
        //     this.nCoffeeOunces = this.nCoffeeOunces - size;
        //     this.nSugarPackets = this.nSugarPackets - nSugarPackets;
        //     this.nCreams = this.nCreams - nCreams;
        //     this.nCups = this.nCups - 1;
        // }
        if (size > this.nCoffeeOunces || nSugarPackets > this.nSugarPackets || nCreams > this.nCreams){
            this.restock(0, 0, 0, 50);

        }
        else if (size > this.nCoffeeOunces) {
            this.restock(200, 0, 0, 0);
        }
        else if (nSugarPackets > this.nSugarPackets) {
            this.restock(0, 1000, 0, 0);
        }
        else if (nCreams > this.nCreams) {
            this.restock(0, 0, 300, 0);

        } // RESTOCKING EACH INGREDIENT INDIVIDUALLY AS IT RUNS OUT TO SAVE MONEY FOR
        // THE CAFE, BUT ALWAYS RESTOCKING CUPS BY 1/10 OF ORIGINAL ORDER AMOUNT AS TO
        // NOT RUN OUT WHILE FULFILLING ALL COFFEE ORDERS
       
        else {
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
            this.nCups = this.nCups - 1;
            }
      
    }
    /**
     * Restocks the cafe's ingredients
     * @param nCoffeeOunces: number of coffee ounces being restocked
     * @param nSugarPackets: number of sugar packets being restocked
     * @param nCreams: number of creams being restocked
     * @param nCups: number of cups being restocked
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces + this.nCoffeeOunces;
        this.nSugarPackets = nSugarPackets + this.nSugarPackets;
        this.nCreams = nCreams + this.nCreams;
        this.nCups = nCups + this.nCups;

    }
    /**
     * Tests for methods by building a cafe, selling coffee, printing stock of ingredients, and restocking manually
     * @param args: Command line arguments
     */
    public static void main(String[] args) {
        Cafe perezCafe = new Cafe("Perez Cafe", "123 Family St. Magical Place, Somewhere", 2);
        perezCafe.sellCoffee(12, 2, 3);
        System.out.println(perezCafe.nCoffeeOunces);
        System.out.println(perezCafe.nSugarPackets);
        System.out.println(perezCafe.nCreams);
        System.out.println(perezCafe.nCups);
        // perezCafe.sellCoffee(200, 1000, 300);
        // System.out.println(perezCafe.nCoffeeOunces);
        // System.out.println(perezCafe.nSugarPackets);
        // System.out.println(perezCafe.nCreams);
        // System.out.println(perezCafe.nCups);
        perezCafe.sellCoffee(200, 1000, 300);
        perezCafe.restock(200, 1000, 300, 500);
        System.out.println(perezCafe.nCoffeeOunces);
        System.out.println(perezCafe.nSugarPackets);
        System.out.println(perezCafe.nCreams);
        System.out.println(perezCafe.nCups);
    }
    
}
