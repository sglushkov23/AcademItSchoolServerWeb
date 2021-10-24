package ru.academits.java.glushkov.hello_world_servlet;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("Hello from HelloWorldServlet".getBytes(StandardCharsets.UTF_8));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}
