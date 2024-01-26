import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculatrice Simple");
        System.out.print("Saisissez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Saisissez l'opérateur (+, -, *, /) : ");
        char operator = scanner.next().charAt(0);

        System.out.print("Saisissez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Division par zéro impossible.");
                    return;
                }
                break;
            default:
                System.out.println("Opérateur invalide.");
                return;
        }

        System.out.println("Résultat : " + result);

        // Fermer le scanner (bien que ce ne soit pas strictement nécessaire)
        scanner.close();
    }
}
