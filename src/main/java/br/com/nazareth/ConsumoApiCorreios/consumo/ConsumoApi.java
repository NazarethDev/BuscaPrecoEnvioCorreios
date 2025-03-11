package br.com.nazareth.ConsumoApiCorreios.consumo;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    private static String token = "eyJhbGciOiJSUzI1NiJ9.eyJpYXQiOjE3NDE2NDk2NTMsImlzcyI6InRva2VuLXNlcnZpY2UiLCJleHAiOjE3NDE3MzYwNTMsImp0aSI6ImM1MzdhOTZmLTg3OTMtNDNiZC1hOTZiLTY1Y2I2MmMxMTMyMyIsImFtYmllbnRlIjoiUFJPRFVDQU8iLCJwZmwiOiJQRiIsImlwIjoiMTg3LjM4LjYyLjEwMCwgMTkyLjE2OC4xLjEzMCIsImNhdCI6IklkMCIsImNwZiI6IjU2MDA1NTUyODgwIiwiaWQiOiI1NjAwNTU1Mjg4MCJ9.YUWAzWnNH3wzEBFmNBz6fDXhww0viqlZCDnioZIXfHg5JLGlgyWuhCB_oemk2n0i4KA8sip-nj3mlXFTEYa-Oh-Jfx6IsE9NRRyRYy-5E0vgFAqmey12EKWdjlB_Zy6iarYZ3-nFuwPIj4MeBabXFywrzpck7qCEOWoClWgGMvUtk2y5NKQeGE_bPQBp18GQnPU9uiVKESEpb081J1vGfI8jClpa9NGvGUtgTP59IYLvDqeeiyCrW2hh7q5Mv3te-Lvd3NgheVam62f0aBeJM4A4A6gv9QZc9K5__5I-J-0wR-YZO4eHi4HvF3tfYLhP21WLj3W0gbXGYMXX2rh9Sw";

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

