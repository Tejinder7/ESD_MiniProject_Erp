package com.example.miniprojecterp.Controller;

import com.example.miniprojecterp.Services.LoginService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URISyntaxException;

@Path("details")
public class LoginController {
    @GET
    @Path("login/{user_name}/{user_password}")
    //@Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_HTML)
    public Response loginUser(@PathParam("user_name") String name, @PathParam("user_password") String pass){
        String message;
        LoginService service = new LoginService();
        boolean result = service.login(name, pass);
        System.out.println(result);
        if(result){
            message= "Success";
            return Response.ok().entity(message).build();
        }
        else{
            message= "Failure";
            return Response.ok().entity(message).build();
        }
    }

}
