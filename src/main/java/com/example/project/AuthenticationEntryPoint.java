/*
 * @author Ashwani K
 */
package com.example.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * The Class AuthenticationEntryPoint.
 */
@Component
public class AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

	/**
	 * Commence.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param authEx   the auth ex
	 * @throws IOException      Signals that an I/O exception has occurred.
	 * @throws ServletException the servlet exception
	 */
	@Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authEx)
      throws IOException, ServletException {

    }
	
	/**
	 * After properties set.
	 *
	 * @throws Exception the exception
	 */
	@Override
    public void afterPropertiesSet() throws Exception {

    }

}
