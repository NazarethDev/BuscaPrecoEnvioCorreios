package br.com.nazareth.ConsumoApiCorreios.consumo;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ConsumoApi {

    private static String token = "eyJhbGciOiJSUzI1NiJ9.eyJpYXQiOjE3NDE4MTc3MzQsImlzcyI6InRva2VuLXNlcnZpY2UiLCJleHAiOjE3NDE5MDQxMzQsImp0aSI6Ijc0MWQxZTYxLTlhZDYtNGU0Yy05ZjY5LTMzYWRmZmI1ZDNmNiIsImFtYmllbnRlIjoiUFJPRFVDQU8iLCJwZmwiOiJQRiIsImlwIjoiMTg3LjM4LjYyLjEwMCwgMTkyLjE2OC4xLjEzMSIsImNhdCI6IklkMCIsImNwZiI6IjU2MDA1NTUyODgwIiwiaWQiOiI1NjAwNTU1Mjg4MCJ9.xv-pgpfx-D-Y1LCzFHWFGeSZebFPqrmXBzFqwRGJLeoLD0Z5czQOHvFpcifFurpnZap4g1rI2glx_upXnB2_tC39qRH8goqw11SfgcwptxlxbnVqj59uu9RNPq5frH4zP3u7EEnFuWHy2au33guPFxjSE7m1WuzkzX4Of2S064yT_2pRVtlJQOuxWzCjol43X42_Q4ea-1p_dv-E1lwe1CkzYY9WgnBp-ysd7qyFegPjSn62a5soTQ7_TjY9neqs8RT-0AieRv-fMc66UqwnrW_ucROXKCPt7vdZ12Lt_s52CN_88O7to8rMzWrWfy6_pAHdwjdARMDE3fMPyQO52A";

    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("Accept", "application/json")
                .header("Authorization", "Bearer " + token)
                .GET()
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String json = response.body();
        return json;
    }
}

