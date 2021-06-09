package my;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class UserInfoClient
 {
public static final String BASE_URI = "http://localhost:7002/PathAnnotation";
public static final String PATH_NAME = "/message";
public static final String PATH_BDAY= "/message/birthday";
public static void main(String[] args) 
{

ClientConfig config = new DefaultClientConfig();
Client client = Client.create(config);

WebResource resource = client.resource(BASE_URI);
WebResource nameResource = resource.path("rest").path(PATH_NAME);
System.out.println("Client Response \n"+ getClientResponse(nameResource));
System.out.println("Response \n" + getResponse(nameResource) + "\n\n");
WebResource ageResource = resource.path("rest").path(PATH_BDAY);
System.out.println("Client Response \n" + getClientResponse(ageResource));
System.out.println("Response \n" + getResponse(ageResource));
}


private static String getClientResponse(WebResource resource) {
return resource.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class)
.toString();
}

private static String getResponse(WebResource resource) {
return resource.accept(MediaType.TEXT_PLAIN).get(String.class);
}
}