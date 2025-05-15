import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertirMoneda {
    public Cambio cambiarMoneda(String base_code, String target_code){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fa0462d95da84463e17b58c2/pair/"+base_code+"/"+target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cambio.class);
        } catch (Exception e) {
            throw new RuntimeException("Error al realiar el tipo de cambio");
        }
    }
}
