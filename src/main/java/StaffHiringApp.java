import java.util.Scanner;

public class StaffHiringApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of current staff members: ");
        int staffNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the current Location: ");
        String location = scanner.nextLine();

        StaffHiring group = new StaffHiring(staffNumber,location);

        group.printStaffHiring();

        scanner.close();
    }
}
