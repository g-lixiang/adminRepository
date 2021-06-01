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

@WebServlet(value = {"/student/save.do","/student/update.do","/student/delete.do","/student/select.do"})
public class MyServlet05 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入到学生模块相关操作");
        //取得url-pattern
        String path = req.getServletPath();
        if ("/student/save.do".equals(path)) {
            save(req, resp);
        } else if ("/student/update.do".equals(path)) {
            update(req, resp);
        } else if ("/student/delete.do".equals(path)) {
            delete(req, resp);
        } else if ("/student/select.do".equals(path)) {
            select(req, resp);
        }
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行修改操作");
    }

    private void save(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行添加操作");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行删除操作");
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("执行查询操作");
    }
}
