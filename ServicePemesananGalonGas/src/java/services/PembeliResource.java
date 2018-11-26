/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Helper.PesananHelper;
import com.google.gson.Gson;
import java.util.Date;
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
import pojos.Pesanan;

/**
 * REST Web Service
 *
 * @author asus
 */
@Path("pembeli")
public class PembeliResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PenjualResource
     */
    public PembeliResource() {
    }

    /**
     * Retrieves representation of an instance of services.PenjualResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of PenjualResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        
    }
@POST
@Path("addNewPesanan")
 @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
public Response AddNewPasien(String data){
    Gson gson=new Gson();
    Pesanan pesan= gson.fromJson(data,Pesanan.class);
    PesananHelper helper =new PesananHelper();
    helper.addNewPesanan(pesan.getIdPemesanan(), 
            pesan.getNoKtp(),
            pesan.getNama(),
            pesan.getAlamat(),
            pesan.getNamaBarang(),
            pesan.getJumlahBarang(),
            pesan.getWaktuAntar(),
            pesan.getStatus());
    return Response.status(200).entity(pesan).build();    
    }
}
    

