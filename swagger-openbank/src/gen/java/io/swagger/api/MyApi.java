package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.MyApiService;
import io.swagger.api.factories.MyApiServiceFactory;

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

@Path("/my")


@io.swagger.annotations.Api(description = "the my API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class MyApi  {
   private final MyApiService delegate = MyApiServiceFactory.getMyApi();

    @GET
    @Path("/banks/BANK_ID/accounts/ACCOUNT_ID/account")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Account by Id (Core)", notes = "<p>Information returned about the account specified by ACCOUNT_ID:</p><ul>  <li>Number</li>  <li>Owners</li>  <li>Type</li>  <li>Balance</li>  <li>IBAN</li></ul><p>This call returns the owner view and requires access to that view.</p><p>OAuth authentication is required</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetCoreAccountById(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetCoreAccountById(securityContext);
    }
    @GET
    @Path("/banks/BANK_ID/accounts/ACCOUNT_ID/transactions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transactions for Account (Core)", notes = "<p>Returns transactions list (Core info) of the account specified by ACCOUNT_ID.</p><p>Authentication is required.</p><p>Possible custom headers for pagination:</p><ul>  <li>obp_sort_by=CRITERIA ==&gt; default value: \"completed\" field</li>  <li>obp_sort_direction=ASC/DESC ==&gt; default value: DESC</li>  <li>obp_limit=NUMBER ==&gt; default value: 50</li>  <li>obp_offset=NUMBER ==&gt; default value: 0</li>  <li>obp_from_date=DATE =&gt; default value: date of the oldest transaction registered (format below)</li>  <li>obp_to_date=DATE =&gt; default value: date of the newest transaction registered (format below)</li></ul><p><strong>Date format parameter</strong>: \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" (2014-07-01T00:00:00.000Z) ==&gt; time zone is UTC.</p>", response = Void.class, tags={ "2_1_0" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetCoreTransactionsForBankAccount(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetCoreTransactionsForBankAccount(securityContext);
    }
}
