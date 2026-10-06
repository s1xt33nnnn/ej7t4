import java.util.Scanner;

public class ej7t4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dni;
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
        System.out.print("Introduce los numeros de tu dni y te dire a la letra que perteneces: ");
        dni = input.nextInt();
        System.out.println(letras[dni % 23]);
    }
}
