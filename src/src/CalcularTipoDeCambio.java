import java.util.ArrayList;
import java.util.List;

public class CalcularTipoDeCambio {
    public List<String> calcularTipoDeCambio(int numeroElegidoUsuario) {
        List<String> monedas = new ArrayList<>();

        if (numeroElegidoUsuario == 1) {
            monedas.add("USD");
            monedas.add("ARS");
        } else if (numeroElegidoUsuario == 2) {
            monedas.add("ARS");
            monedas.add("USD");
        } else if (numeroElegidoUsuario == 3) {
            monedas.add("USD");
            monedas.add("BRL");
        } else if (numeroElegidoUsuario == 4) {
            monedas.add("BRL");
            monedas.add("USD");
        } else if (numeroElegidoUsuario == 5) {
            monedas.add("USD");
            monedas.add("COP");
        } else if (numeroElegidoUsuario == 6) {
            monedas.add("COP");
            monedas.add("USD");
        }
        return monedas;
    }
}
