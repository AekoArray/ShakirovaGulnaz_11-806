import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        PrintWriter pw = resp.getWriter();
        pw.println("<h1>ok</h1>");

    }
}
