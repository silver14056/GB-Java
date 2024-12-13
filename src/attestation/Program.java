package attestation;

import attestation.CORE.Laptop;
import attestation.CORE.Actions;

import java.util.*;
public class Program {
    public static void main(String[] args) {
        Actions action = new Actions();
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(8, 512, "Windows 10", "Black"));
        laptops.add(new Laptop(16, 1024, "Windows 11", "Silver"));
        laptops.add(new Laptop(8, 256, "Ubuntu", "Black"));
        laptops.add(new Laptop(32, 1024, "macOS", "Gray"));
        laptops.add(new Laptop(16, 512, "Windows 10", "White"));

        boolean continueFiltering = true;

        while (continueFiltering) {
            action.filterLaptops(action.switcher(), laptops);

            System.out.println("Do you want to continue? (y/n)");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("n")) {
                continueFiltering = false;
            }
        }

    }

}