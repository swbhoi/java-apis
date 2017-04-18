package io.swagger.api.factories;

import io.swagger.api.CardsApiService;
import io.swagger.api.impl.CardsApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:23:47.652-04:00")
public class CardsApiServiceFactory {

   private final static CardsApiService service = new CardsApiServiceImpl();

   public static CardsApiService getCardsApi()
   {
      return service;
   }
}
