//פעולה ראשית הקולטת 50 מחוזורות ומדפיסה את המחרוזות שאורכן זוגי הנחיה היעזר בפעולה lenght

import java.util.Scanner;

public class EvenLengthStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <=10; i++) {
            System.out.print("הכנס מחרוזת מספר " + i + ": ");
            String input = scanner.nextLine();
            
            if (input.length() % 2 == 0) {
                System.out.println("מחרוזת מספר " + i + ": " + input);
            }
        }
        
        scanner.close();
    }
}
