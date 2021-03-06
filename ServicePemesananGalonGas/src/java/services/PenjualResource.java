/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Helper.PesananHelper;
import Helper.UserHelper;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Pesananfix;

/**
 * REST Web Service
 *
 * @author asus
 */
@Path("penjual")
public class PenjualResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PenjualResource
     */
    public PenjualResource() {
    }

    /**
     * Retrieves representation of an instance of services.PenjualResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        UserHelper u = new UserHelper();
        Gson gson = new Gson();
        return Response.status(Response.Status.OK)
                .entity(gson.toJson(u.bacaSemuaUser()))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods",
                        "GET,POST,HEAD,OPTIONS,PUT")
                .header("Access-Control-Allow-Headers",
                        "Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers")
                .header("Access-Exposed-Headers",
                        "Access-Control-Allow-Origin,Access-Control-Allow-Credentials")
                .header("Access-Support-Credentials",
                        "true")
                .header("Access-Control-Max-Age", "20")
                .header("Access-Preflight-Maxage", "20")
                .build();
    }

/**
 * PUT method for updating or creating an instance of PenjualResource
 *
 * @param content representation for the resource
 */
@PUT
        @Consumes(MediaType.APPLICATION_JSON)
        public void putJson(String content) {
    }

    @GET
    @Path("login")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@QueryParam("username") String username, @QueryParam("password") String password) {
        return new Gson().toJson(new UserHelper().login(username, password));
    }
    
    @POST
@Path("update")
 @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
public Response update(String data){
    Gson gson=new Gson();
    Pesananfix pesan= gson.fromJson(data,Pesananfix.class);
    PesananHelper helper =new PesananHelper();
    helper.update(pesan.getIdPemesanan(), 
            pesan.getStatus());
    return Response.status(200).entity(pesan).build();    
    }
}

