package io.swagger.api.factories;

import io.swagger.api.EstimatesApiService;
import io.swagger.api.impl.EstimatesApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-04-18T04:31:22.416-04:00")
public class EstimatesApiServiceFactory {

   private final static EstimatesApiService service = new EstimatesApiServiceImpl();

   public static EstimatesApiService getEstimatesApi()
   {
      return service;
   }
}
