package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.model.User;
import ru.itis.shagiakhmetova.net.service.UserServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    UserServiceImpl userService = new UserServiceImpl();
    DaoImpl dao = new DaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Servlet at: ").append(request.getContextPath());
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/register.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String faculty_name = request.getParameter("faculty_name");
        if (dao.findByLogin(login) == null) {
            User newUser = new User(firstName, lastName, login, password, phone, faculty_name);
            dao.save(newUser);
            response.sendRedirect("/login");
        } else {
            response.sendRedirect("404.html");
        }
    }
}


