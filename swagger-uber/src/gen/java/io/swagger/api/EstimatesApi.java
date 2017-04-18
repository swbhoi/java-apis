package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EstimatesApiService;
import io.swagger.api.factories.EstimatesApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;
import io.swagger.model.PriceEstimate;
import io.swagger.model.Product;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/estimates")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the estimates API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:31:22.416-04:00")
public class EstimatesApi  {
   private final EstimatesApiService delegate = EstimatesApiServiceFactory.getEstimatesApi();

    @GET
    @Path("/price")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Price Estimates", notes = "The Price Estimates endpoint returns an estimated price range\nfor each product offered at a given location. The price estimate is\nprovided as a formatted string with the full price range and the localized\ncurrency symbol.<br><br>The response also includes low and high estimates,\nand the [ISO 4217](http://en.wikipedia.org/wiki/ISO_4217) currency code for\nsituations requiring currency conversion. When surge is active for a particular\nproduct, its surge_multiplier will be greater than 1, but the price estimate\nalready factors in this multiplier.", response = PriceEstimate.class, responseContainer = "List", tags={ "Estimates",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of price estimates by product", response = PriceEstimate.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = PriceEstimate.class, responseContainer = "List") })

    public Response estimatesPriceGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude,@ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude,@ApiParam(value = "Latitude component of end location.",required=true) @QueryParam("end_latitude") Double endLatitude,@ApiParam(value = "Longitude component of end location.",required=true) @QueryParam("end_longitude") Double endLongitude,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.estimatesPriceGet(startLatitude,startLongitude,endLatitude,endLongitude,securityContext);
    }
    @GET
    @Path("/time")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Time Estimates", notes = "The Time Estimates endpoint returns ETAs for all products offered at a given location, with the responses expressed as integers in seconds. We recommend that this endpoint be called every minute to provide the most accurate, up-to-date ETAs.", response = Product.class, responseContainer = "List", tags={ "Estimates" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array of products", response = Product.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Product.class, responseContainer = "List") })

    public Response estimatesTimeGet(@ApiParam(value = "Latitude component of start location.",required=true) @QueryParam("start_latitude") Double startLatitude,@ApiParam(value = "Longitude component of start location.",required=true) @QueryParam("start_longitude") Double startLongitude,@ApiParam(value = "Unique customer identifier to be used for experience customization.") @QueryParam("customer_uuid") String customerUuid,@ApiParam(value = "Unique identifier representing a specific product for a given latitude & longitude.") @QueryParam("product_id") String productId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.estimatesTimeGet(startLatitude,startLongitude,customerUuid,productId,securityContext);
    }
}
