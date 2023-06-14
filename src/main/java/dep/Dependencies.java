package dep;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class Dependencies {

    public static void main(String[] args) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://jsonplaceholder.typicode.com/todos/1");
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = builder.get();
        String value = response.readEntity(String.class);
        System.out.println("Value: " + value);
    }

}
