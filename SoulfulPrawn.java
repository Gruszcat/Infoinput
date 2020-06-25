import java.util.*; 
public class SoulfulPrawn {
 
  public static void main(String[] args) {
   
    Scanner user_input = new Scanner(System.in);
  
    System.out.println("SoulfulPrawn\n\n");

    System.out.println("What is your full first name?:");
    String something1 = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your middle name?");
    String something2 = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your last name?");
    String something3 = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your birth month?");
    String something4 = user_input.nextLine();
    System.out.println("\n");

    System.out.println("What is your birth year?");
    String something5 = user_input.nextLine();
    System.out.println("\n\n");
 
    System.out.println("Full Name: " + something1 + " " + something2 + " " + something3);

    System.out.println("Born: " + something4 + " " + something5);
  }
}
