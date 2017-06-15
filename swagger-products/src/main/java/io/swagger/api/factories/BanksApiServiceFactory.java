package io.swagger.api.factories;

import io.swagger.api.BanksApiService;
import io.swagger.api.impl.BanksApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-06-15T00:27:12.056-04:00")
public class BanksApiServiceFactory {

   private final static BanksApiService service = new BanksApiServiceImpl();

   public static BanksApiService getBanksApi()
   {
      return service;
   }
}
