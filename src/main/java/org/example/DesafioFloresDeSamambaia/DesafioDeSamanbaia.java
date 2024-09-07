package org.example.DesafioFloresDeSamambaia;
import java.util.Scanner;

public class DesafioDeSamanbaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        double distanciaCentros = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distanciaCentros + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo do caçador (R1): ");
        int r1 = scanner.nextInt();

        System.out.print("Digite a coordenada X do centro do círculo do caçador (X1): ");
        int x1 = scanner.nextInt();

        System.out.print("Digite a coordenada Y do centro do círculo do caçador (Y1): ");
        int y1 = scanner.nextInt();

        System.out.print("Digite o raio do círculo da flor (R2): ");
        int r2 = scanner.nextInt();

        System.out.print("Digite a coordenada X do centro do círculo da flor (X2): ");
        int x2 = scanner.nextInt();

        System.out.print("Digite a coordenada Y do centro do círculo da flor (Y2): ");
        int y2 = scanner.nextInt();

        String resultado = tentativaDesenhar(r1, x1, y1, r2, x2, y2);
        System.out.println(resultado);

        scanner.close();
    }
}