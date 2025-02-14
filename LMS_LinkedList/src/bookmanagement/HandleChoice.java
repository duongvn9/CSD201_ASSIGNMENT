
package bookmanagement;

import java.util.Scanner;
/**
 *
 * @author duongvnhe191516
 * @version 1.0
 */
public class HandleChoice {

    public static Scanner sc = new Scanner(System.in);
    public static Functions f = new Functions();
    
    public int handleChoice(int limit) {
        int count = 0;
        while (true) {
            if (count == 4) {
                return -1;
            }
            System.out.print("(" + (count + 1) + ") Your choice: ");
            String choice = sc.nextLine();

            try {
                int num = Integer.parseInt(choice);
                if (num < 0 || num > limit) {
                    count++;
                    System.out.println("Invalid choice!");
                } else {
                    return num;
                }
            } catch (NumberFormatException e) {
                count++;
                System.out.println("Invalid choice!");
            }
        }
    }

    public double handleInputDouble() {
        int count = 0;
        while (true) {
            if (count == 3) {
                return -1;
            }
            System.out.print("(" + count + ") Enter: ");
            String choice = sc.nextLine();

            try {
                double num = Double.parseDouble(choice);
                return num;

            } catch (NumberFormatException e) {
                count++;
                System.out.println("Invalid!");
            }
        }
    }

    public int handleInputInt() {
        int count = 0;
        while (true) {
            if (count == 3) {
                return -1;
            }
            System.out.print("(" + count + ") Insert: ");
            String choice = sc.nextLine();

            try {
                int num = Integer.parseInt(choice);
                return num;

            } catch (NumberFormatException e) {
                count++;
                System.out.println("Invalid!");
            }
        }
    }

    public boolean userBookChoice(int choice) {
        boolean status = true;
        switch (choice) {
            case 1:
                f.loadBookDataFromFile();
                break;
            case 2:
                f.inputBookAddLast();
                break;
            case 3:
                f.displayBookData();
                break;
            case 4:
                f.saveBookListToFile();
                break;
            case 5:
                f.searchBybCode();
                break;
            case 6:
                f.deleteBybCode();
                break;
            case 7:
                f.sortBybCode();
                break;
            case 8:
                f.inputBookAddFirst();
                break;
            case 9:
                f.addBookAfter();
                break;
            case 10:
                f.deleteBookPos();
                break;
            case 11:
                f.f1();
                break;
            case 12:
                f.f2();
                break;
            case 13:
                f.f3();
                break;
            case 14:
                f.f4();
                break;
            case 15:
                f.f5();
                break;
            case 0:
                status = false;
                break;
            default:
                System.out.println("Wrong more than 3 times!");
                status = false;
        }
        return status;
    }

    public boolean userReaderChoice(int choice) {
        boolean status = true;
        switch (choice) {
            case 1:
                f.loadReaderDataFromFile();
                break;
            case 2:
                f.inputReaderAddLast();
                break;
            case 3:
                f.displayReaderData();
                break;
            case 4:
                f.saveReaderListToFile();
                break;
            case 5:
                f.searchByrCode();
                break;
            case 6:
                f.deleteByrCode();
                break;
            case 0:
                status = false;
                break;
            default:
                System.out.println("Wrong more than 3 times!");
                status = false;
        }
        return status;
    }

    public boolean userLendingChoice(int choice) {
        boolean status = true;
        switch (choice) {
            case 1:
                f.inputLendingData();
                break;
            case 2:
                f.displayLendingData();
                break;
            case 3:
                f.sortLendingBybCode();
                break;
            case 4:
                f.sortLendingByrCode();
                break;
            case 0:
                status = false;
                break;
            default:
                System.out.println("Wrong more than 3 times!");
                status = false;
        }
        return status;
    }
}
