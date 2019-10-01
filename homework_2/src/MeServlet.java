import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*PrintWriter printWriter = response.getWriter();
        BufferedReader reader = request.getReader();
        printWriter.println("<html><body><pre>" + reader.readLine() + "</pre></body</html>");
        printWriter.close();*/
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if(login.equals("login")&password.equals("password")){
            response.sendRedirect("ok.jsp");
        }
        else response.sendRedirect("login.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();
        pw.println("<h1>ok</h1>");
        pw.println("<html");
        pw.println("<h1>Hello, " + name + "</h1>");
        pw.println("</html");
    }
}
