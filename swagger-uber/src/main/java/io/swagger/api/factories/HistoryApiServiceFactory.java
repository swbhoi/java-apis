package io.swagger.api.factories;

import io.swagger.api.HistoryApiService;
import io.swagger.api.impl.HistoryApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:31:22.416-04:00")
public class HistoryApiServiceFactory {

   private final static HistoryApiService service = new HistoryApiServiceImpl();

   public static HistoryApiService getHistoryApi()
   {
      return service;
   }
}
