import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  /**
   * Constructor for House - builds houses
   * @param name: name of the house
   * @param address: address of the house
   * @param nFloors: number of floors the house has
   * @param hasDiningRoom: whether or not the house has a dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    // System.out.println("You have built a house: 🏠"); // can't put this at the beginning of a constructor
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }
/* Accessor/getter for hasDiningRoom */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
/* Accessor/getter for number of residents */
  public int nResidents() {
    return this.residents.size();
  }

  /* Adds a new resident to the list of residents in the house
   * @param name: name of new resident who is moving in
  */
  public void moveIn(String name) {
    this.residents.add(name);
    System.out.println("A new resident named " + name + " has moved in.");
  }
  /** Removes a resident from the list of residents in the house
   * @param name: name of the resident who is moving out
   * @return String: returns the name of resident that moved out
   */
  public String moveOut(String name) {
    // return the name of the person who moved out

    if (this.residents.contains(name)) {
      this.residents.remove(name);
      System.out.println("The resident named " + name + " has moved out.");
      return name;
    }
    else {
      System.out.println("Sorry, the resident named " + name + "does not live here. ");
      return null;
    }
   
    // this.residents.remove(name);
    // System.out.println("The resident named " + name + " has moved out.");
    // return name;
  }
  /** Checks if an inputted person is a resident of the house
   * @param person: inputted person's name
   * @return boolean: true if the person is a resident or false if they are not
   */
  public boolean isResident(String person) {
    if (this.residents.contains(person)) {
      System.out.println("Yes, this person is a resident of the house.");
      return true;
    }
    else {
      System.out.println("A person named '" + person + "' doesn't seem to live here.");
      return false;
    }
  }
  /** Describes how many residents are currently living in a house and whether or not a house has a dining room
   * @return String: description of the number of residents and possbility of dining hall in house
   */
  public String toString() {
    String description = super.toString();
    description += " There are currently " + this.residents.size() + " residents in this house.";
    description += " This house";
    if (this.hasDiningRoom){
      description += " has";

    } else {
      description += " does not have";
    }
    description += " an active dining room.";
    return description;
  }
/** Tests methods created for House class that creates new houses and moves people in and out
 * @param args: The command line arguments
 */
  public static void main(String[] args) {
    House wilson = new House("Wilson House", "16 Kensington Ave Northampton, MA", 4, true);
    System.out.println(wilson);

    House lawrence = new House("Lawrence House", "<> Green Street Northampton, MA", 4, false);
    System.out.println(lawrence);

    House morris = new House("Morris House", "Green Street", 4, false);
    System.out.println(morris);

    // TESTING
    morris.moveIn("Lisa");
    System.out.println(morris.nResidents());
    System.out.println("There is/are " + morris.nResidents() + " resident(s) in Morris House.");
    
    morris.moveOut("Lisa");
    System.out.println(morris.nResidents());
    System.out.println("There is/are " + morris.nResidents() + " resident(s) in Morris House.");

    morris.isResident("Amber");
    morris.moveOut("Amber");
  }

}