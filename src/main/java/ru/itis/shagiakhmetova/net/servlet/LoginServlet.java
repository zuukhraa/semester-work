package ru.itis.shagiakhmetova.net.servlet;
import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private DaoImpl daoImpl;

    public void init() {
        daoImpl = new DaoImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User(login, password);
        user.setLogin(login);
        user.setPassword(password);
        if (daoImpl.validate(user) && login != null && password != null) {
            HttpSession session = request.getSession();
            session.setAttribute("isAuthenticated", true);
            session.setMaxInactiveInterval(60 * 60);
            Cookie cookie = new Cookie("login", login);
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
            response.sendRedirect("profile.html");
        } else {
            response.sendRedirect("404.html");
        }
    }
}
