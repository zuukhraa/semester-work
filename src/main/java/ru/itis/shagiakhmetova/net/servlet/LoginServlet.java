package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.model.User;
import ru.itis.shagiakhmetova.net.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    DaoImpl dao = new DaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = PasswordHelper.encrypt(request.getParameter("password"));
        String rememberMe = request.getParameter("remember");
        if (!Objects.equals(login, "") && !Objects.equals(password, "")) {
            User user = dao.findByLoginAndPassword(login, password);
            if (user != null) {
                if (user.getPassword().equals(password) && user.getLogin().equals(login)) {
                    HttpSession session = request.getSession();
                    if (rememberMe != null && rememberMe.equals("rememberMe")) {
                        Cookie userCookie = new Cookie("login", user.getLogin());
                        Cookie passwordCookie = new Cookie("password", user.getPassword());
                        Cookie rememberCookie = new Cookie("remember", rememberMe);
                        userCookie.setMaxAge(24 * 60 * 60);
                        passwordCookie.setMaxAge(24 * 60 * 60);
                        rememberCookie.setMaxAge(24 * 60 * 60);
                        response.addCookie(userCookie);
                        response.addCookie(passwordCookie);
                        response.addCookie(rememberCookie);
                    }
                    session.setAttribute("user", user);
                    session.setMaxInactiveInterval(60 * 60 * 24);
                    response.sendRedirect("profile.ftl");
                }
            } else {
                response.sendRedirect("index.jsp");
            }
        }
        else {
            response.sendRedirect("index.jsp");
        }
    }
}


