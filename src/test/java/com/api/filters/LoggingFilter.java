package com.api.filters;

import io.restassured.filter.Filter;

import java.util.logging.LogRecord;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {
	private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

	public boolean isLoggable(LogRecord record) {
		// TODO Auto-generated method stub
		return false;
	}

	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logRequest(requestSpec);
		Response response = ctx.next(requestSpec, responseSpec);
		logResponse(response);
		return response;
	}

	private void logRequest(FilterableRequestSpecification requestSpec) {
		logger.info("BaseURI: " + requestSpec.getBaseUri());
		logger.info("Headers: " + requestSpec.getHeaders());
		logger.info("Request Payload:" + requestSpec.getBody());
	}

	private void logResponse(Response response) {
		logger.info("Response Status code: " + response.getStatusCode());
		logger.info("Response Body: " + response.getBody().asString());
	}

}
