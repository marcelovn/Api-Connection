import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        


        HttpRequest request = HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create("https://imdb-api.com/en/API/Top250Movies/k_xkj29bbo"))
                        .build();

        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());

    
    }
}
