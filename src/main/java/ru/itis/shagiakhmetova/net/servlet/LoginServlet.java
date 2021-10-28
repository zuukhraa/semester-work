package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String hashPassword = PasswordHelper.encrypt(request.getParameter("password"));
        UserDto user = userService.findByLoginAndPassword(login, hashPassword);
            if (user.getHashPassword().equals(hashPassword) && user.getLogin().equals(login)) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                session.setMaxInactiveInterval(60 * 60 * 24);
                Cookie userCookie = new Cookie("login", user.getLogin());
                userCookie.setMaxAge(24 * 60 * 60);
                response.addCookie(userCookie);
                response.sendRedirect("profile.ftl");
                }
            }
        }

