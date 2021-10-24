package ru.itis.shagiakhmetova.net.filter;

import ru.itis.shagiakhmetova.net.service.UserService;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/profile")
public class AuthenticationFilter implements Filter {
    private ServletContext context;
    private UserService userService;

    @Override
    public void init(FilterConfig filterConfig) {
        this.context = filterConfig.getServletContext();
        userService = (UserService) context.getAttribute("userService");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("isAuthenticated")==null) {
            request.getRequestDispatcher(request.getContextPath()+"/login").forward(request,response);
        } else {
            filterChain.doFilter(request,response);
        }
    }

    @Override
    public void destroy() {}
}
