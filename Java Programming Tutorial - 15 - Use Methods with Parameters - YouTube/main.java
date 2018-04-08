import java.util.Scanner;
public class main {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
         tuna tunaObject = new tuna();

         System.out.println("Enter your name");
         String name = input.nextLine();

         tunaObject.simpleMessage(name);

    }
}
