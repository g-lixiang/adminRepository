package com.bjpowernode.servlet;

import com.bjpowernode.domain.Student;

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

@WebServlet("/myServlet03.do")
public class MyServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到servlet03");
        Student s = new Student("A0001","zs",23);
        //{"id":"?","name":"?","age":?}
        String str = "{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()+"\",\"age\":"+s.getAge()+"}";
        resp.getWriter().print(str);
        
    }
}
