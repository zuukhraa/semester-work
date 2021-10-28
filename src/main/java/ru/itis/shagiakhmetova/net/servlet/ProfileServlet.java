package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.service.UserService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    UserService userService = new UserService();

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String login = request.getParameter("login");
            UserDto user = userService.findByLogin(login);
            request.setAttribute("login", true);
            request.getRequestDispatcher("profile.ftl").forward(request, response);
        }
    }