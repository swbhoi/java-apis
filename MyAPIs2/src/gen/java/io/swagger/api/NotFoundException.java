package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2017-01-03T01:52:51.008-05:00")
public class NotFoundException extends ApiException {
	private int code;
	public NotFoundException (int code, String msg) {
		super(code, msg);
		this.code = code;
	}
}
