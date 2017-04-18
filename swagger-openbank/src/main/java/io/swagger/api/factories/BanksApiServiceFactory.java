package io.swagger.api.factories;

import io.swagger.api.BanksApiService;
import io.swagger.api.impl.BanksApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class BanksApiServiceFactory {

   private final static BanksApiService service = new BanksApiServiceImpl();

   public static BanksApiService getBanksApi()
   {
      return service;
   }
}
