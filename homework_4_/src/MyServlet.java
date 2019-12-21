import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i <5 ; i++) {
            list.add(random.nextInt(100));
        }
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("{"Array" :"  + list.toString()+ "}");
    }
}
