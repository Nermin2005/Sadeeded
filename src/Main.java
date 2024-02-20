import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();
        boolean sadedir = true;
        for (int i = 2; i < eded; i++) {
            if (eded % i == 0) {
                sadedir = false;
            }
        }
        if (eded==1) {
            System.out.println("Sade eded deyil");
            return;
        }
        if(eded<1) {
            System.out.println("Duzgun reqem deyil");
        }
        if (sadedir == true) {
            System.out.println("Sadedir "+eded);
        }
        else {
            System.out.println("Sade deyil");
        }
    }
}