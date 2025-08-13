import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1232123", 100);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nƏməliyyat seçin: 1-Deposit, 2-Withdraw, 3-Exit, 4-Balance");
            System.out.print("Seçim: ");

            try {

                int choice = scan.nextInt();scan.nextLine();
                switch (choice) {

                    case 1:
                        System.out.println("elave etmek istediyiniz meblegi daxil edin");
                        bankAccount.addBalance(scan.nextDouble());
                        scan.nextLine();
                        break;
                    case 2:
                        System.out.println("cekmek istediyiniz meblegi daxil edin");
                        bankAccount.withdraw(scan.nextDouble());
                        scan.nextLine();
                        break;

                    case 3:
                        return;

                    case 4:
                        System.out.println("balans= "+bankAccount.getBalance());
                        break;
                    default:
                        System.out.println("sehv secim etmisiniz");

                }
            } catch (InputMismatchException e) {
                System.out.println("zehmet olmasa eded daxil edin");scan.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("emeliyyat  tamamlandi");
            }

        }
    }
}