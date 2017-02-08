package io.swagger.api.factories;

import io.swagger.api.AccountApiService;
import io.swagger.api.impl.AccountApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-02-08T06:15:47.501-05:00")
public class AccountApiServiceFactory {

   private final static AccountApiService service = new AccountApiServiceImpl();

   public static AccountApiService getAccountApi()
   {
      return service;
   }
}
