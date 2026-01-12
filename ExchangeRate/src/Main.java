import com.google.gson.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Exchange exchange = new Exchange();
        int opcion = 0;
        double valor = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Sea bienvenido/a al Conversor de Moneda \n" +
                    "1) Dólar >> Peso argentino \n" +
                    "2) Peso argentino =>> Dólar \n" +
                    "3) Dólar >> Real brasileño \n" +
                    "4) Real brasileño =>> Dólar \n" +
                    "5) Dólar >> Peso colombiano \n" +
                    "6) Peso colombiano =>> Dólar \n" +
                    "7) Salir ");

            opcion = sc.nextInt();
            if (opcion == 7) break;
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida");
                continue;
            }
                do {
                    System.out.print("Introduzca el valor a cambiar: ");
                    valor = sc.nextDouble();
                } while (!(valor >= 0));

                switch (opcion) {
                    case 1:
                        System.out.println(exchange.convert("USD", "ARS", valor));
                        break;
                    case 2:
                        System.out.println(exchange.convert("ARS", "USD", valor));
                        break;
                    case 3:
                        System.out.println(exchange.convert("USD", "BRL", valor));
                        break;
                    case 4:
                        System.out.println(exchange.convert("BRL", "USD", valor));
                        break;
                    case 5:
                        System.out.println(exchange.convert("USD", "COP", valor));
                        break;
                    case 6:
                        System.out.println(exchange.convert("COP", "USD", valor));
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }

        }while (opcion != 7);
    }
}
