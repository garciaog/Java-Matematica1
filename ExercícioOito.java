package JavaMatemática;

import java.util.Scanner;

public class ExercícioOito {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da área: ");
        double a = scanner.nextDouble();
        double volume = a*a*a;
        double area = a*a *6;
            System.out.println("O volume do cubo é:" + volume);
            System.out.println("A área do cubo é:" + area);
    
    scanner.close();
    }

}
