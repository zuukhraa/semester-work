package ru.itis.shagiakhmetova.net.servlet;
import ru.itis.shagiakhmetova.net.dao.login.LoginDao;
import ru.itis.shagiakhmetova.net.helper.PasswordHelper;
import ru.itis.shagiakhmetova.net.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    private LoginDao loginDao;

    public void init() {
        loginDao = new LoginDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        try {
            if (loginDao.validate(user)) {
                response.sendRedirect("loginsuccess.jsp");
            } else {
                HttpSession session = request.getSession();
                response.sendRedirect("404.html");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

