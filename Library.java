import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

    /**
     * Constructor for Library - builds libraries
     * @param name: name of the library
     * @param address: adress of the library
     * @param nFloors: number of floors that the library has
     */
    public Library(String name, String address, int nFloors) {
      // System.out.println("You have built a library: 📖"); // can't put this at the beginning of a constructor
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
    /**
     * Adds a title to the library's collection
     * @param title: title of the book we are adding to the collection
     */
    public void addTitle(String title) {
      if (this.collection.contains(title)) {
        throw new RuntimeException("This collection already contains this title.");
      }
      else {
        this.collection.put(title, true);
      }
    }
    /**
     * Removes a title that exists in the collection from the collection, and if not able to, it throws an exception
     * @param title: title of book we want to remove
     * @return String: title of the book we tried to remove
     */
    public String removeTitle(String title){
      // return the title that we removed
      if (this.collection.get(title)) {
        this.collection.remove(title);
      }
      else {
        throw new RuntimeException("This title cannot be removed because it is not in the collection.");
      }
      return title;
    } 
    /**
     * Checks out a title from the collection if it exists, and if not able to it throws an exception
     * @param title: title of the book we want to check out
     */
    public void checkOut(String title) {
      if (this.collection.get(title)) {
        this.collection.replace(title, false);
      }
      else {
        throw new RuntimeException("This title is not in the collection, so it cannot be checked out.");
      }
    
    }
    /**
     * Returns book if it is checked out/unavailable at the moment, and if it has already been returned, it throws an exception
     * @param title: title of the book we want to return to the collection
     */
    public void returnBook(String title) {
      if (this.collection.get(title)) {
        throw new RuntimeException("This book cannot be returned right now because it has already been returned.");
     }
      else {
        this.collection.replace(title, true);
      }
    }
    /**
     * Checks if the library contains a specific title at all, available or unavailable
     * @param title: title of the book we are checking for in the collection
     * @return boolean: true (if available or unavailable) or false (if it doesn't exist at all)
     */
    public boolean containsTitle(String title) {
    // returns true if the title appears as a key in the Library's collection, false otherwise
      if (this.collection.contains(title)) {
        return true;
      }
      else {
        return false;
      }
    }
    /**
     * Checks if a title is available in the library
     * @param title: title of the book we are checking the availability of
     * @return boolean: true (if available) or false (if unavailable)
     */
    public boolean isAvailable(String title){
      // returns true if the title is currently available, false otherwise
    //   if (this.collection.get(title) == true) {
    //     return true;
    //   }
    //   else {
    //     return false;
    //   }
    // }
      return this.collection.get(title);
    }
  
    /**
     * Prints out the entire collection of the library, which includes each title's name along with it's availability
     */
    public void printCollection(){
      // prints out the entire collection in an easy-to-read way (including checkout status)
      // System.out.println(this.collection); // unformatted way of printing all titles

      for (String title : this.collection.keySet()) {
        String availability = " ";
    

        if (this.isAvailable(title)) {
          availability = " (Available)";
         
        }
        else {
          availability = " (Unavailable)";
        }
        System.out.println(title + availability);
        }
      }
    
  /**
   * Tests methods by building a sample library called neilson library, adding titles, removing and checking some out, checking availability, and finally printing the whole collection
   * @param args: Command line arguments
   */
    public static void main(String[] args) {
      Library neilson = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);
      neilson.addTitle("A Bad Case of Stripes by David Shannon");
      neilson.addTitle("Chicka Chicka Boom Boom by Bill Martin Jr and John Archambault");
      neilson.addTitle("If You Give a Mouse a Cookie by Laura Numeroff");
      neilson.addTitle("Pinkalicious by Victoria Kann & Elizabeth Kann");
      neilson.removeTitle("Pinkalicious by Victoria Kann & Elizabeth Kann");
      neilson.checkOut("If You Give a Mouse a Cookie by Laura Numeroff");
      System.out.println(neilson.isAvailable("If You Give a Mouse a Cookie by Laura Numeroff"));
      neilson.printCollection();
    }
  
  }
