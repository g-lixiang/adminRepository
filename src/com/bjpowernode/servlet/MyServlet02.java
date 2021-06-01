package com.bjpowernode.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @auther 李祥
 * @date 2021/6/1 14:54
 */
@WebServlet("/myServlet02.do")
public class MyServlet02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到servlet02");
        //{"str1":"aaa","str2":"bbb"}
        String str = "{\"str1\":\"aaa\",\"str2\":\"bbb\"}";
        resp.getWriter().print(str);

    }
}
