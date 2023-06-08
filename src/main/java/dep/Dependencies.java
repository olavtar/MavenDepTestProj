package dep;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class Dependencies {
    private String test;

    Client client = ClientBuilder.newClient();
    WebTarget target = client.target("http://example.com/base/uri");
    Response response = target.request().get();
    String value = response.readEntity(String.class);
}
