package ru.itis.shagiakhmetova.net.servlet;

import ru.itis.shagiakhmetova.net.dao.LecturerImpl;
import ru.itis.shagiakhmetova.net.model.Lecturer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/lecturers")
public class LecturersServlet extends HttpServlet {

    LecturerImpl lecturerImpl = new LecturerImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("lecturers.ftl");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Lecturer> lecturers = lecturerImpl.getAll();
        request.setAttribute("lecturers", lecturers);
        request.getRequestDispatcher("lecturers.ftl").forward(request, response);
    }
}


