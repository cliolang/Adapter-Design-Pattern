/*
 * portiaportia(1)
 * Class that implements the warrior interface
 */
public class Knight implements Warrior {

  /*
   * Method that prints out that Knight is attacking
   */
  @Override
  public void attack() {
    System.out.println("Attacking: I'm bringing you down!!!!!!!!!!!!!");
  }
  
  /*
   * Method that prints out that Knight is defending
   */
  @Override
  public void defend() {
    System.out.println("Defending: We must protect the castle!!!!!!!!!!!");
  }

}
