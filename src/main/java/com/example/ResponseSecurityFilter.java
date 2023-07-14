package com.example;

import java.io.IOException;
import java.util.*;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Servlet Filter implementation class ResponseSecurityFilter
 */
@WebFilter("/ResponseSecurityFilter")
public class ResponseSecurityFilter implements Filter {

    private ServletContext context;

    public void init(FilterConfig fConfig) throws ServletException {
        this.context = fConfig.getServletContext();
        this.context.log("ResponseSecurityFilter initialized");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        BufferResponseWrapper wrapper = new BufferResponseWrapper(httpServletResponse);

        // pass the request along the filter chain
        chain.doFilter(request, wrapper);

        if(wrapper.getStatus()< 400) {

            wrapper.addHeader("X-Frame-Options","SAMEORIGIN");
            response.getOutputStream().write(wrapper.getWrapperBytes());

        }

    }

    public void destroy() {
        //we can close resources here
    }

}
