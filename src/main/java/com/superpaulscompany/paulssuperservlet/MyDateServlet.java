package com.superpaulscompany.paulssuperservlet;

import com.superpaulscompany.paulssuperservlet.model.MyDate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;


public class MyDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        MyDate paris = new MyDate("Paris", LocalDateTime.now(ZoneId.of("Europe/Paris")));
        MyDate darwin = new MyDate("Darwin", LocalDateTime.now(ZoneId.of("Australia/Darwin")));
        MyDate jakarta = new MyDate("Jakarta", LocalDateTime.now(ZoneId.of("Asia/Jakarta")));

        ArrayList<MyDate> localDateTimeArrayList = new ArrayList<>();
        Collections.addAll(localDateTimeArrayList, paris, darwin, jakarta);

        localDateTimeArrayList
                .forEach(x -> printWriter.println("<html>" + "<h1 style=\"color: darkred;text-align: center\">"
                        + x + "</h1>" + "</html>"));

        resp.setIntHeader("Refresh", 1);
    }
}