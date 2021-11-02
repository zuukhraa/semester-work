package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dao.PostImpl;
import ru.itis.shagiakhmetova.net.model.Post;
import ru.itis.shagiakhmetova.net.model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/post")
public class PostServlet extends HttpServlet {

    private final PostImpl postImpl = new PostImpl();

    public static String limit(String content) {
        String text = content;
        if (text.length() > 200) { text = text.substring(0, 200); }
        return text;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("post.ftl");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        int user_id = user.getId();
        String login = user.getLogin();
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        limit(content);
        String creation_data = req.getParameter("creation_data");
        Post newPost = new Post(user_id, title, content, creation_data, login);
        postImpl.save(newPost);
        resp.sendRedirect("/profile");
    }
}
