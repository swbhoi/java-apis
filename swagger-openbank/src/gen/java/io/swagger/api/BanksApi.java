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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class BanksApi  {
   private final BanksApiService delegate = BanksApiServiceFactory.getBanksApi();

    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/account")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Account by Id (Full)", notes = "<p>Information returned about an account specified by ACCOUNT_ID as moderated by the view (VIEW_ID):</p><ul>  <li>Number</li>  <li>Owners</li>  <li>Type</li>  <li>Balance</li>  <li>IBAN</li>  <li>Available views (sorted by short_name)</li></ul><p>More details about the data moderation by the view <a href=\"#1_2_1-getViewsForBankAccount\">here</a>.</p><p>PSD2 Context: PSD2 requires customers to have access to their account information via third party applications. This call provides balance and other account information via delegated authenticaiton using OAuth.</p><p>OAuth authentication is required if the 'is_public' field in view (VIEW_ID) is not set to <code>true</code>.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210AccountById(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210AccountById(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/other_accounts")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Counterparties of one Account.", notes = "<p>Returns data about all the counterparties (other accounts) that have shared at least one transaction with the ACCOUNT_ID at BANK_ID. Authentication is Optional Authentication is required if the view VIEW_ID is not public.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetCounterpartiesForBankAccount(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetCounterpartiesForBankAccount(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/transaction-request-types")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transaction Request Types for Account", notes = "<p>Returns the Transation Request Types that the account specified by ACCOUNT_ID and view specified by VIEW_ID has access to.</p><p>These are the ways this API Server can create a Transaction via a Transaction Request (as opposed to Transaction Types which include external types too e.g. for Transactions created by core banking etc.)</p><p>A Transaction Request Type internally determines:</p><ul>  <li>the required Transaction Request 'body' i.e. fields that define the 'what' and 'to' of a Transaction Request,</li>  <li>the type of security challenge that may be be raised before the Transaction Request proceeds, and</li>  <li>the threshold of that challenge.</li></ul><p>For instance in a 'SANDBOX_TAN' Transaction Request, for amounts over 1000 currency units, the user must supply a positive integer to complete the Transaction Request and create a Transaction.</p><p>This approach aims to provide only one endpoint for initiating transactions, and one that handles challenges, whilst still allowing flexibility with the payload and internal logic.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetTransactionRequestTypes(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetTransactionRequestTypes(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/transaction-requests")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transaction Requests.", notes = "<p>Returns transaction requests for account specified by ACCOUNT_ID at bank specified by BANK_ID.</p><p>The VIEW_ID specified must be 'owner' and the user must have access to this view.</p><p>Version 2.0.0 now returns charge information.</p><p>Transaction Requests serve to initiate transactions that may or may not proceed. They contain information including:</p><ul>  <li>Transaction Request Id</li>  <li>Type</li>  <li>Status (INITIATED, COMPLETED)</li>  <li>Challenge (in order to confirm the request)</li>  <li>From Bank / Account</li>  <li>Details including Currency, Value, Description and other initiation information specific to each type. (Could potentialy include a list of future transactions.)</li>  <li>Related Transactions</li></ul><p>PSD2 Context: PSD2 requires transparency of charges to the customer. This endpoint provides the charge that would be applied if the Transaction Request proceeds - and a record of that charge there after. The customer can proceed with the Transaction by answering the security challenge.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetTransactionRequests(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetTransactionRequests(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/transactions")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transactions for Account (Full)", notes = "<p>Returns transactions list of the account specified by ACCOUNT_ID and <a href=\"#1_2_1-getViewsForBankAccount\">moderated</a> by the view (VIEW_ID).</p><p>Authentication via OAuth is required if the view is not public.</p><p>Possible custom headers for pagination:</p><ul>  <li>obp_sort_by=CRITERIA ==&gt; default value: \"completed\" field</li>  <li>obp_sort_direction=ASC/DESC ==&gt; default value: DESC</li>  <li>obp_limit=NUMBER ==&gt; default value: 50</li>  <li>obp_offset=NUMBER ==&gt; default value: 0</li>  <li>obp_from_date=DATE =&gt; default value: date of the oldest transaction registered (format below)</li>  <li>obp_to_date=DATE =&gt; default value: date of the newest transaction registered (format below)</li></ul><p><strong>Date format parameter</strong>: \"yyyy-MM-dd'T'HH:mm:ss.SSS'Z'\" (2014-07-01T00:00:00.000Z) ==&gt; time zone is UTC.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetTransactionsForBankAccount(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetTransactionsForBankAccount(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/transactions/TRANSACTION_ID/other_account")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Counterparty of Transaction", notes = "<p>Get other account of a transaction. Returns details of the other party involved in the transaction, moderated by the <a href=\"#1_2_1-getViewsForBankAccount\">view</a> (VIEW_ID).</p><p>Authentication via OAuth is required if the view is not public.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetCounterpartyForTransaction(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetCounterpartyForTransaction(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/ACCOUNT_ID/VIEW_ID/transactions/TRANSACTION_ID/transaction")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transaction by Id.", notes = "<p>Returns one transaction specified by TRANSACTION_ID of the account ACCOUNT_ID and <a href=\"#1_2_1-getViewsForBankAccount\">moderated</a> by the view (VIEW_ID).</p><p>Authentication is Optional Authentication is required if the view is not public.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetTransactionByIdForBankAccount(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetTransactionByIdForBankAccount(securityContext);
    }
    @GET
    @Path("/BANK_ID/accounts/public")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Accounts at Bank (Public)", notes = "<p>Returns a list of the public accounts (Anonymous access) at BANK_ID. For each account the API returns the ID and the available views.</p><p>Authentication via OAuth is not required.</p>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210PublicAccountsAtOneBank(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210PublicAccountsAtOneBank(securityContext);
    }
    @GET
    @Path("/BANK_ID/products")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Bank Products", notes = "<p>Returns information about the financial products offered by a bank specified by BANK_ID including:</p><ul>  <li>Name</li>  <li>Code</li>  <li>Category</li>  <li>Family</li>  <li>Super Family</li>  <li>More info URL</li>  <li>Description</li>  <li>Terms and Conditions</li>  <li>License the data under this endpoint is released under Authentication is Optional</li></ul>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetProducts(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetProducts(securityContext);
    }
    @GET
    @Path("/BANK_ID/products/PRODUCT_CODE")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Bank Product", notes = "<p>Returns information about the financial products offered by a bank specified by BANK_ID and PRODUCT_CODE including:</p><ul>  <li>Name</li>  <li>Code</li>  <li>Category</li>  <li>Family</li>  <li>Super Family</li>  <li>More info URL</li>  <li>Description</li>  <li>Terms and Conditions</li>  <li>License the data under this endpoint is released under Authentication is Optional</li></ul>", response = Void.class, tags={ "2_1_0",  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetProduct(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetProduct(securityContext);
    }
    @GET
    @Path("/BANK_ID/transaction-types")
    
    
    @io.swagger.annotations.ApiOperation(value = "Get Transaction Types offered by the bank", notes = "<p>Get Transaction Types for the bank specified by BANK_ID:</p><p>Lists the possible Transaction Types available at the bank (as opposed to Transaction Request Types which are the possible ways Transactions can be created by this API Server).</p><ul>  <li>id : Unique transaction type id across the API instance. SHOULD be a UUID. MUST be unique.</li>  <li>bank_id : The bank that supports this TransactionType</li>  <li>short_code : A short code (SHOULD have no-spaces) which MUST be unique across the bank. May be stored with Transactions to link here</li>  <li>summary : A succinct summary</li>  <li>description : A longer description</li>  <li>charge : The charge to the customer for each one of these</li></ul><p>Authentication is Optional</p>", response = Void.class, tags={ "2_1_0" })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Error", response = Void.class) })

    public Response 210GetTransactionTypes(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.210GetTransactionTypes(securityContext);
    }
}
