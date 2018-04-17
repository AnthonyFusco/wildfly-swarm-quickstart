package com.st.demo.servlet;

import com.st.demo.ejb.ClientRepositoryBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/clients")
public class ClientServlet extends HttpServlet {

    @EJB
    private ClientRepositoryBean repository;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(repository.getClients().toString());
    }
}