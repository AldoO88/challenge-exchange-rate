import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double cantidad = 0.0;
        double cantidadConvertida = 0.0;
        String menu = """
                ****************************************************************
                Conversor de Moneda
                
                Elige una opcion:
                
                1. Dolar =>> Peso Mexicano
                2. Peso Mexicano =>> Dolar
                3. Dolar =>> Euros
                4. Euros =>> Dolar
                5. Euros =>> Peso Mexicano
                6. Peso Mexicano ==> Euros
                9. Salir
                
                ***********************************************************
                """;
        ConvertirMoneda convertir = new ConvertirMoneda();
        Cambio cambio ;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Escribe la cantidad en Dolares que quieres convertir a Pesos Mexicanos");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("USD", "MXN");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" USD" + " ==>> " +"$" +  cantidadConvertida + " MXN");
                    break;
                case 2:
                    System.out.println("Escribe la cantidad en Pesos Mexicanos que quieres convertir a Dolares");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("MXN", "USD");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" MXN" + " ==>> " +"$" +  cantidadConvertida + " USD");
                    break;
                case 3:
                    System.out.println("Escribe la cantidad en Dolares que quieres convertir a Euros");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("USD", "EUR");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" USD" + " ==>> " +"$" +  cantidadConvertida + " EUR");
                    break;
                case 4:
                    System.out.println("Escribe la cantidad en Euros que quieres convertir a Dolares");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("EUR", "USD");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" EUR" + " ==>> " +"$" +  cantidadConvertida + " USD");
                    break;
                case 5:
                    System.out.println("Escribe la cantidad en Euros que quieres convertir a Pesos Mexicanos");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("EUR", "MXN");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" EUR" + " ==>> " +"$" +  cantidadConvertida + " MXN");
                    break;
                case 6:
                    System.out.println("Escribe la cantidad en Pesos Mexicanos que quieres convertir a Euros");
                    cantidad = teclado.nextDouble();
                    cambio = convertir.cambiarMoneda("EUR", "MXN");
                    cantidadConvertida = cambio.conversion_rate() * cantidad;
                    System.out.println("$" + cantidad +" EUR" + " ==>> " +"$" +  cantidadConvertida + " MXN");
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;


            }
        }

    }
}
