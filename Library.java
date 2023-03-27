import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building{

  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      // System.out.println("You have built a library: 📖"); // can't put this at the beginning of a constructor
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

    public void addTitle(String title) {
      this.collection.put(title, true);
    }

    public String removeTitle(String title){
      // return the title that we removed
      this.collection.remove(title);
      return title;
    } 

    public void checkOut(String title) {
      this.collection.replace(title, false);
    }

    public void returnBook(String title) {
      this.collection.replace(title, true);
    }

    public boolean containsTitle(String title) {
    // returns true if the title appears as a key in the Libary's collection, false otherwise
      if (this.collection.contains(title)) {
        return true;
      }
      else {
        return false;
      }
    }

    public boolean isAvailable(String title){
      // returns true if the title is currently available, false otherwise
      if (this.collection.get(title) == true) {
        return true;
      }
      else {
        return false;
      }
    }

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
