import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.PathParam;


@Path("/club")
@Produces(MediaType.APPLICATION_JSON)
public class ClubResource {

    @GET
    public String helloWorld(){

        return("Hello clubs");

    }



} 