package JavaMatemática;

import java.util.Scanner;

public class ExercícioCinco {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        double delta = (b * b + a * a);
         System.out.println("O valor da hipotenusa é: " + delta);
    }
    
}
