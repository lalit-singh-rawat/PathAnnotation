
package my;
import javax.ws.rs.Produces; 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
 
@Path("/message")
public class MessageReceiveService 
{
 
    @GET
@Produces(MediaType.TEXT_PLAIN)

    public Response pingMe()
{
     
        String defaultResp = "Hi... How are you?";
//Response.ResponseBuilder rb=Response.status(200);
//Response.ResponseBuilder rb1=rb.entity(defaultResp);
//Response  res=rb1.build();
//return res;
        return Response.status(200).entity(defaultResp).build();
    }
     
    @GET
@Produces(MediaType.TEXT_PLAIN)
    @Path("/birthday")
    public Response printBdayMessage()
{
         
        String bDayMessage = "Happy Birthday";
        return Response.status(200).entity(bDayMessage).build();
    }
}
/*
http://localhost:7002/PathAnnotation/rest/message
In the above example, if you use "/message" URI pattern, pingMe() method will be invoked, and you will get "i... How are you?" as a response.

If you use "http://localhost:7002/PathAnnotation/rest/message/birthday" URI pattern, then printBdayMessage() method will be invoked and you will get "Happy Birthday" as a response.
Dynamic URI with parameter matching:*/
