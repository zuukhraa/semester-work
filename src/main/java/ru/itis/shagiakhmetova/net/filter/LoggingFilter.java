package ru.itis.shagiakhmetova.net.filter;


import ru.itis.shagiakhmetova.net.logs.Request;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class LoggingFilter implements Filter {
    public void init(FilterConfig config) {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        Request.log(request);
        chain.doFilter(request, resp);
    }

    public void destroy() {
    }
}
