package com.qa.hwa.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "The Team with that id doesn't exist. Please try again!")
public class TeamNotFoundException extends Exception {

		private static final long serialVersionUID = 1L;
}