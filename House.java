import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  // Attributes 
  private ArrayList <String> residents;
  private boolean hasDiningRoom;


  /**
   * creates an instance of a house
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors, hasDiningRoom);
    this.residents = new ArrayList<String>(); 

    System.out.println("You have built a house: 🏠");
  }

/**
 * accesses boolean value of the hasDiningRoom attribute
 * @return boolean value
 */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }


  /**
   * accesses the number of residents in "residents" ArrayList
   * @return size of the "residents" list and/or number of residents in the list
   */
  public int nResidents() {
    return this.residents.size();
  }


  public static void main(String[] args) {
    new House();
  }

}