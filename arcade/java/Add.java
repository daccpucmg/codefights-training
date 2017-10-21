/**
 * @author Luiz Gustavo Bragança dos Santos
 * @version 1.0
 */

public class Add
{
  /**
   * Method add() - add two numbers
   * @param  param1 - first number
   * @param  param2 - second number
   * @return sum
   */
  public static int add(int param1, int param2)
  {
    // adding
    int sum = param1 + param2;

    return sum;
  }// end add()

  /**
   * Method main
   * @param args
   */
  public static void main(String[] args)
  {
    // calling the method
    int sum = add(5, 3);

    // showing the sum
    System.out.println(sum);
  }// end main()
}// end class Add