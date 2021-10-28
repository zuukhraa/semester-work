package ru.itis.shagiakhmetova.net.servlet;
import ru.itis.shagiakhmetova.net.model.User;
import ru.itis.shagiakhmetova.net.service.UserServ;
import ru.itis.shagiakhmetova.net.service.UserService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private final UserServ userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("register.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String faculty_name = request.getParameter("faculty_name");
        User newUser = new User(firstName, lastName, login, password, phone, faculty_name);
        userService.save(newUser);
        HttpSession session = request.getSession();
        session.setAttribute("login", login);
        session.setMaxInactiveInterval(60 * 60 * 24);
        Cookie userCookie = new Cookie("login", login);
        userCookie.setMaxAge(60 * 60 * 24);
        response.addCookie(userCookie);
        response.sendRedirect("/login");
    }
}
