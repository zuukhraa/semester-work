package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dao.DaoImpl;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/change")
public class ChangeServlet extends HttpServlet {

    DaoImpl dao = new DaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("change.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (login != ("") && password != ("")) {
            {
                dao.changeLogin(user.getId(), login);
                dao.changePassword(user.getId(), PasswordHelper.encrypt(password));
                User newUser = dao.findByLoginAndPassword(user.getLogin(), user.getPassword());
                session.setAttribute("user", newUser);
            }
            response.sendRedirect("/login");
        }
        else {
            response.sendRedirect("/change");
        }
    }
}
