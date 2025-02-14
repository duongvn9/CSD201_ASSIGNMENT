package bookmanagement;
import java.util.Scanner;

/**
 *
 * @author duongvnhe191516
 * @version 1.0
 */
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static HandleChoice c = new HandleChoice();
     
    public static void main(String[] args) {
        menuOfMain();
        
    }
    
    public static void menuOfMain(){
        Menu.menuMain();
        int choice = c.handleChoice(3);
        switch (choice) {
            case 1:
                Menu.menuBook();
                int bookChoice;
                do{
                    bookChoice = c.handleChoice(15);
                } while(c.userBookChoice(bookChoice));
                menuOfMain();
                break;
            case 2:
                Menu.menuReader();
                int readerChoice;
                do{
                    readerChoice = c.handleChoice(6);
                } while(c.userReaderChoice(readerChoice));
                menuOfMain();
                break;
            case 3:
                Menu.menuLending();
                int lendingChoice;
                do{
                    lendingChoice = c.handleChoice(4);
                } while(c.userLendingChoice(lendingChoice));
                menuOfMain();
                break;

            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Wrong more than 3 times!");
        }
    }

    //Write a program to check if a number is prime or not python
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}





