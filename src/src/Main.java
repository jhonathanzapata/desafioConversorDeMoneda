import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        while(true) {
            ConsultaMoneda consultaMoneda= new ConsultaMoneda();
            CalcularTipoDeCambio calcularTipoDeCambio= new CalcularTipoDeCambio();
            List<String> listaObtenida= new ArrayList<>();

            System.out.println("********************************************" +
                    "\n" +
                    "\nSea bienvenido al conversor de moneda" +
                    "\n" +
                    "\n1) Dollar ==> Peso Argentino" +
                    "\n2) Peso Argentino ==> Dollar" +
                    "\n3) Dollar ==> Real Brasileño" +
                    "\n4) Real brasileño ==> Dollar" +
                    "\n5) Dollar ==> Peso Colombiano" +
                    "\n6) Peso Colombiano ==> Real brasileño" +
                    "\n7) Salir" +
                    "\nElija una opción valida" +
                    "\n" +
                    "\n********************************************************");

            Scanner lectura = new Scanner(System.in);
            var numeroOpcion = Integer.valueOf(lectura.nextLine());
            if (numeroOpcion != 7) {
                listaObtenida=calcularTipoDeCambio.calcularTipoDeCambio(numeroOpcion);
                double resultadoConversion=consultaMoneda.ResultadoConsulta(listaObtenida).conversion_rate();
                System.out.println("Ingresa el valor que desea convertir");
                var numeroMoneda = Integer.valueOf(lectura.nextLine());

                var resultadoMultiplicado=resultadoConversion*numeroMoneda;
                System.out.println("El valor de "+numeroMoneda+" "+listaObtenida.get(0)+" corresponden al valor final de ===> "+resultadoMultiplicado+" "+listaObtenida.get(1));

            } else {
                System.out.println("Ha salido del programa");
                break;
            }
        }

    }
}