package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ProductsApiService;
import io.swagger.api.factories.ProductsApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Product;
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

@Path("/products")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the products API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:31:22.416-04:00")
public class ProductsApi  {
   private final ProductsApiService delegate = ProductsApiServiceFactory.getProductsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products\noffered at a given location. The response includes the display name\nand other details about each product, and lists the products in the\nproper display order.", response = Product.class, responseContainer = "List", tags={ "Products" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products", response = Product.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Product.class, responseContainer = "List") })

    public Response productsGet(@ApiParam(value = "Latitude component of location.",required=true) @QueryParam("latitude") Double latitude,@ApiParam(value = "Longitude component of location.",required=true) @QueryParam("longitude") Double longitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.productsGet(latitude,longitude,securityContext);
    }
}
