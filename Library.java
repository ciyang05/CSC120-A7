import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building implements LibraryRequirements {

// Attributes
private Hashtable<String, Boolean> collection;

/**
 * @param name
 * @param address
 * @param nFloors
 */
public Library(String name, String address, int nFloors ) {
  super(name, address, nFloors);
  System.out.println("You have built a library: 📖");
  this.collection = new Hashtable<String, Boolean>();
}

    /**
     * @param args
     */
    public static void main(String[] args) {
      Library myLibrary = new Library("Kiara's library", "123 St", 3);
      System.out.println(myLibrary);
      // myLibrary.addTitle("Harry Potter");
      // myLibrary.checkOut("Harry Potter");
      // myLibrary.isAvailable("Harry Potter");
      // myLibrary.printCollection();
      //myLibrary.containsTitle("Harry Potter");
    }
    
    @Override
    public void addTitle(String title) {
      collection.put(title, true);
      System.out.println(title + " " + "has been added to the library collection");
    }
    /**
     * adds specific title to the collection hashtable 
     * @return title of the book added to the collection
     */
    @Override
    public String removeTitle(String title) {
      collection.remove(title);
      return title;
    }
    
    @Override
    public void checkOut(String title) {
    if (collection.containsKey(title)){
      collection.replace(title, false);
    } else {
      System.out.println("Book not available");
    }
    }

    @Override
    public void returnBook(String title) {
    if (collection.containsKey(title)) {
      collection.replace(title, true);
    } else {
      System.out.println("Book not available");
    }
    }
    /**
     * checks if title is contained within the collection
     * @return true or false depending on if the collection contains the title
     */
    @Override
    public boolean containsTitle(String title) {
      if (collection.containsKey(title)) {
        return true;  
      } else {
        return false;
      }
    }
     /**
     * Checks if title is available in collection 
     * @return true or false depending on whether the title is available in the collection
     */
    @Override
    public boolean isAvailable(String title) {
      if (collection.containsKey(title)){
        return collection.get(title) ;
      } else {
        return false;
      }
    }

    @Override
    public boolean printCollection() {
     System.out.println(collection.toString());
     return true;
    }
  
  }