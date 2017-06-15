package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.BanksApiService;
import io.swagger.api.factories.BanksApiServiceFactory;

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

@Path("/banks")


@io.swagger.annotations.Api(description = "the banks API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-06-15T00:27:12.056-04:00")
public class BanksApi  {
   private final BanksApiService delegate = BanksApiServiceFactory.getBanksApi();

    @GET
    @Path("/BANK_ID/products")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Bank Products", notes = "<p>Returns information about the financial products offered by a bank specified by BANK_ID including:</p><ul>  <li>Name</li>  <li>Code</li>  <li>Category</li>  <li>Family</li>  <li>Super Family</li>  <li>More info URL</li>  <li>Description</li>  <li>Terms and Conditions</li>  <li>License the data under this endpoint is released under Authentication is Optional</li></ul>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response getProducts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getProducts(securityContext);
    }
    @GET
    @Path("/BANK_ID/products/PRODUCT_CODE")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Bank Product", notes = "<p>Returns information about the financial products offered by a bank specified by BANK_ID and PRODUCT_CODE including:</p><ul>  <li>Name</li>  <li>Code</li>  <li>Category</li>  <li>Family</li>  <li>Super Family</li>  <li>More info URL</li>  <li>Description</li>  <li>Terms and Conditions</li>  <li>License the data under this endpoint is released under Authentication is Optional</li></ul>", response = Void.class, tags={ "2_1_0" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetProduct(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetProduct(securityContext);
    }
}
