import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner respuesta =  new Scanner(System.in);
        Scanner lectura =  new Scanner(System.in);
        Scanner lecturaCantidad = new Scanner(System.in);

        List<Double> moneda = new ArrayList<>();
        int opcion = 0;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true){

            String menu = """
                **** ***************************************************************** ****
                Sea bienvenido al conversor de moneda, realizado por Edgar Parada
                1 - Dolar -> Peso Argentino
                2 - Peso Argentino -> Dolar
                3 - Dolar -> Real Brasileño
                4 - Real Brasileño -> Dolar
                5 - Dolar -> Peso Colombiano
                6 - Peso Colombiano -> Dolar
                7 - Salir
                
                Elija una opcion valida
                *****************************************************************
                """;

            System.out.println(menu);
            opcion = respuesta.nextInt();
            //var monedaCambio = lectura.nextLine();



            if (opcion == 7){
                break;
            }

            try {

                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio1 = lecturaCantidad.nextDouble();
                        var monedaCambio = "USD";

                        String dirreccion = "https://v6.exchangerate-api.com/v6" +
                                "/c494723ff210f3d4fa140d17/latest/"+monedaCambio;

                        System.out.println("Selecciono: " + cantidadCambio1);
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio2 = lecturaCantidad.nextDouble();
                        System.out.println("Selecciono: " + cantidadCambio2);
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio3 = lecturaCantidad.nextDouble();
                        System.out.println("Selecciono: " + cantidadCambio3);
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio4 = lecturaCantidad.nextDouble();
                        System.out.println("Selecciono: " + cantidadCambio4);
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio5 = lecturaCantidad.nextDouble();
                        System.out.println("Selecciono: " + cantidadCambio5);
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir: ");
                        double cantidadCambio6 = lecturaCantidad.nextDouble();
                        System.out.println("Selecciono: " + cantidadCambio6);
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println("Finalizo la eejcucion del programa");
    }
}
