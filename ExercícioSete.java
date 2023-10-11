package JavaMatemática;

import java.util.Scanner;

public class ExercícioSete {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double r = scanner.nextDouble();
        double volume = 4 * 3.14 * r * r * r /3;

            System.out.println("O volume da esfera é:" + volume);

    
    }

}
