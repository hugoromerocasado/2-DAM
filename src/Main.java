import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        int num2 = 0;
        int cont;
        int cont2=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al nuevo programa");
        System.out.println("Escribe el número inicial (0 para salir)");
        num = sc.nextInt();

        while (num != 0) {
            System.out.println("Escribe el número final");
            num2 = sc.nextInt();
            System.out.println("Buscando números primos...");

            for (int i = num; i <= num2; i++) {
                cont = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        cont++;
                    }
                }

                if (cont == 2) {
                    System.out.println(i);
                    cont2++;
                }
            }
            System.out.println("Programa terminado, hay "+cont2+" primos entre "+num+" y "+num2);
            System.out.println("Escribe el número inicial (0 para salir)");
            num = sc.nextInt();
        }

        System.out.println("Programa terminado");
    }
}
