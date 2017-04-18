package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MeApiService;
import io.swagger.api.factories.MeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.Profile;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/me")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the me API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:31:22.416-04:00")
public class MeApi  {
   private final MeApiService delegate = MeApiServiceFactory.getMeApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = Profile.class, tags={ "User" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Profile information for a user", response = Profile.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Profile.class) })

    public Response meGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.meGet(securityContext);
    }
}
