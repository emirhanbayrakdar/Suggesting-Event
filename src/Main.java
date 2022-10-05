import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hava bugün kaç derece?");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Bugün kayak yapabilirsiniz.");
            return;
        } else if (heat > 5 && heat < 15) {
            System.out.println("Bugün sinemaya gidebilirsiniz.");
        }
        if (heat > 10 && heat < 25) {
            System.out.println("Bugün piknik yapabilirsiniz.");
        } else {
            System.out.println("Bugün yüzmeye gidebilirsiniz.");
        }

    }
}