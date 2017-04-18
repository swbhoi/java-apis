package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CardsApiService;
import io.swagger.api.factories.CardsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/cards")


@io.swagger.annotations.Api(description = "the cards API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class CardsApi  {
   private final CardsApiService delegate = CardsApiServiceFactory.getCardsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Get cards for the current user", notes = "<p>Returns data about all the physical cards a user has been issued. These could be debit cards, credit cards, etc.</p>", response = Void.class, tags={ "2_1_0" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetCards(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetCards(securityContext);
    }
}
