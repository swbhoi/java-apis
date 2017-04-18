package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Error;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public abstract class AccountsApiService {
  
      public abstract Response 210AllAccountsAllBanks(SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response 210PublicAccountsAllBanks(SecurityContext securityContext)
      throws NotFoundException;
  
}
