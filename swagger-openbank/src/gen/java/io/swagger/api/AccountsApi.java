package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AccountsApiService;
import io.swagger.api.factories.AccountsApiServiceFactory;

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

@Path("/accounts")


@io.swagger.annotations.Api(description = "the accounts API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class AccountsApi  {
   private final AccountsApiService delegate = AccountsApiServiceFactory.getAccountsApi();

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Get all Accounts at all Banks.", notes = "<p>Get all accounts at all banks the User has access to (Authenticated + Anonymous access). Returns the list of accounts at that the user has access to at all banks. For each account the API returns the account ID and the available views.</p><p>If the user is not authenticated via OAuth, the list will contain only the accounts providing public views. If the user is authenticated, the list will contain non-public accounts to which the user has access, in addition to all public accounts.</p><p>Authentication is Optional</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210AllAccountsAllBanks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210AllAccountsAllBanks(securityContext);
    }
    @GET
    @Path("/public")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Public Accounts at all Banks.", notes = "<p>Get public accounts at all banks (Anonymous access). Returns accounts that contain at least one public view (a view where is_public is true) For each account the API returns the ID and the available views.</p><p>Authentication is Optional</p>", response = Void.class, tags={ "2_1_0" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210PublicAccountsAllBanks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210PublicAccountsAllBanks(securityContext);
    }
}
