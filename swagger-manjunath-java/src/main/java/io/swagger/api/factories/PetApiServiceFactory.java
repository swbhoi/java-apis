package io.swagger.api.factories;

import io.swagger.api.PetApiService;
import io.swagger.api.impl.PetApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-20T00:49:05.561-04:00")
public class PetApiServiceFactory {

   private final static PetApiService service = new PetApiServiceImpl();

   public static PetApiService getPetApi()
   {
      return service;
   }
}
