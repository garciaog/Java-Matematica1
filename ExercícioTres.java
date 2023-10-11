package JavaMatemática;

public class ExercícioTres {
    public static void main(String[] args) throws Exception{

        double a = 2;
        double b = -5;
        double c = 3;
        
        double delta = b * b - 4 * (a * b);

        if (delta < 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raíz real:" + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("A equação possui duas raízes reais: " + x1 + " e " + x2);

            }
            
        }

}
