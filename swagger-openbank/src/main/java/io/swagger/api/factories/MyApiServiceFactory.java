package io.swagger.api.factories;

import io.swagger.api.MyApiService;
import io.swagger.api.impl.MyApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class MyApiServiceFactory {

   private final static MyApiService service = new MyApiServiceImpl();

   public static MyApiService getMyApi()
   {
      return service;
   }
}
