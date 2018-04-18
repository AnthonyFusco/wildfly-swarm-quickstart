package com.st.demo.servlet;

import com.st.demo.ejb.ClientRepositoryBean;
import com.st.demo.ejb.HelloEJB;

import javax.ejb.EJB;
import javax.inject.Inject;
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

    @Inject
    private HelloEJB helloEJB;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(repository.getClients().toString());
//        resp.getWriter().write(helloEJB.getValue());
    }
}