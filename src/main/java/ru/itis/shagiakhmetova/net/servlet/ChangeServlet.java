package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dto.UserDto;
import ru.itis.shagiakhmetova.net.model.User;
import ru.itis.shagiakhmetova.net.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/change")
public class ChangeServlet extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("change.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        HttpSession session = request.getSession();
        UserDto user = (UserDto) session.getAttribute("login");
    }
}
