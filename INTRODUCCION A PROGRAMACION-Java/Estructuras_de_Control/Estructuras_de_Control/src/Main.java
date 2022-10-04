import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        /*ESTRUCTURA CONDICIONAL IF-ELSE-IF-ELSE*/
        int numeroIf = 2;
        if (numeroIf > 0) {
            System.out.println("El numero ingresado es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El numero ingresado es negativo.");
        } else {
            System.out.println("El numero ingresado es 0.");
        }
        /*BUCLE WHILE*/
        int numeroWhile = 4;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        /*BUCLE DO WHILE*/
        int numerodoWhile = 4;
        do {
            System.out.println(numerodoWhile);
            numeroWhile++;
        } while (numerodoWhile < 3);

        /*BUCLE FOR*/
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        /*ESTRUCTURA CONDICIONAL SWITCH*/
        String estacion = "DOMINGO";
        switch (estacion) {
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:System.out.println("No es una estacion");
        }
    }
}