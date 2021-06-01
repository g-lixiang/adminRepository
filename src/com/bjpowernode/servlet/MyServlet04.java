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

@WebServlet("/myServlet04.do")
public class MyServlet04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到servlet04");
        Student s = new Student("A0001","zs",23);
        Student s2 = new Student("A0002","ls",24);
        //{"id":"?","name":"?","age":?}
        //{"s1":{"id":"?","name":"?","age":?},"s2":{"id":"?","name":"?","age":?}}
        String str = "{\"s1\":{\"id\":\""+s.getId()+"\",\"name\":\""+s.getName()
                +"\",\"age\":"+s.getAge()+"},\"s2\":{\"id\":\""+s2.getId()
                +"\",\"name\":\""+s2.getName()+"\",\"age\":"+s2.getAge()+"}}";
        resp.getWriter().print(str);
        
    }
}
