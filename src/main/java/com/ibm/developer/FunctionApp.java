package com.ibm.developer;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class FunctionApp {

	public static JsonObject main(JsonObject args) {
		JsonObject response = new JsonObject();
		JsonPrimitive nameArg = args.getAsJsonPrimitive("name");
		
		String result;
		if (nameArg == null) {
			result = "Hello! Welcome to new version of test...";
		} else {
			result = "Hello there " + nameArg.getAsString();
		}
		response.addProperty("body", result);

		return response;
	}
}
