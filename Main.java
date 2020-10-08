import java.util.Scanner;
/**
 * This program will populate a 10 element array with integers and then output the largest value in that array
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner
    Scanner input = new Scanner(System.in);

    // create an array with 10 spots
    int[] integers = new int[10];

    // ask the user to enter in 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    // create a for loop and put in integers
    for(int i = 0; i < 10; i++){
      integers[i] = input.nextInt();
    } 

    int highestNum = integers[0];
    
    // create a for loop to determine the largest number
    for(int i = 0; i < integers.length; i++){
      if(highestNum < integers[i])
        highestNum = integers[i];
    
      
    } System.out.println("The largest number is " + highestNum);

    
  }
}
