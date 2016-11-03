package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AccountApiService;
import io.swagger.api.factories.AccountApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Account;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/account")


@io.swagger.annotations.Api(description = "the account API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-11-03T08:21:39.447-04:00")
public class AccountApi  {
   private final AccountApiService delegate = AccountApiServiceFactory.getAccountApi();

    @GET
    @Path("/{accountNumber}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Account Details", notes = "Account Detail's", response = Account.class, tags={ "AccountDetails" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Search Success", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 302, message = "Acc not found", response = Account.class) })

    public Response accountAccountNumberGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.accountAccountNumberGet(securityContext);
    }
}
