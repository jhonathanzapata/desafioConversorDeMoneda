import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import com.google.gson.Gson;

public class ConsultaMoneda {
    public TipoConversionDesdeJson ResultadoConsulta(List<String> monedas){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d0f05ea0b6f37dec151cb8bf/pair/"+monedas.get(0)+"/"+monedas.get(1));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TipoConversionDesdeJson.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontró la moneda");
        }


    }
}
