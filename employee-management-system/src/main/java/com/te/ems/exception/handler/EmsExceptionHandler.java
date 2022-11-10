package com.te.ems.exception.handler;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.google.common.collect.Maps;
import com.te.ems.exception.ProjectDetailsNotUpdatedException;
import com.te.ems.exception.RegistrationNotSuccessfullException;

@RestControllerAdvice
public class EmsExceptionHandler {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(RegistrationNotSuccessfullException.class)
	public Map<String, String> handler(RegistrationNotSuccessfullException ex) {
		Map<String, String> map = Maps.newHashMap();
		map.put("error", ex.getMessage());
		return map;
	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ProjectDetailsNotUpdatedException.class)
	public Map<String, String> handler(ProjectDetailsNotUpdatedException ex) {
		Map<String, String> map = Maps.newHashMap();
		map.put("error", ex.getMessage());
		return map;
	}
}
