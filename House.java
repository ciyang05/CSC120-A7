import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {

  // Attributes 
  private ArrayList <String> residents;
  private boolean hasDiningRoom;


  /**
   * the constructor, which creates an instance of a house
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) { // still passing in boolean, but it won't be used in super
    super(name, address, nFloors); // creates a house using the Building class, must use same parameters as Building constructor
    this.residents = new ArrayList<String>(); // <String> indicates what kind of data will be stored in ArrayList
    this.hasDiningRoom = hasDiningRoom;

    System.out.println("You have built a house: 🏠");
  }

/**
 * accesses boolean value of the hasDiningRoom attribute
 * @return true or false depending on if house has a dining room
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


  /**
   * checks if person is already a resident and updates the "residents" arraylist everytime someone moves in
   * @param name
   */
  public void moveIn(String name) {
    if (!residents.contains(name)) {
      residents.add(name);
    } 

  }


  /**
   * checks if person is a resident and updates the "residents" arraylist everytime someone moves out
   * @param name
   * @return name of person who moved out
   */
  public String moveOut(String name) {
    if (residents.contains(name)) {
      residents.remove(name);
    } return name;

  }


  /**
   * checks if a given person is a resident of the "House"
   * @param person
   * @return true or false depending on if the person is a resident
   */
  public Boolean isResident(String person) {
    if (residents.contains(person)) {
      return true;
    } else {
      return false;
    }
  } 


  /**
   * the main function for "House" class, which calls the constructor to initialize a new house
   * @param args
   */
  public static void main(String[] args) {
   House myHouse = new House("Cutter", "1 Prospect St", 4, true);
   System.out.println(myHouse);
  }

}