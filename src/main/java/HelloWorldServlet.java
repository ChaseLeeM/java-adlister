import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//User goes to http://localhost:8080/hello in the browser and sees "Hello World"

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("Hello World");
        PrintWriter out = res.getWriter();
        out.println("<h1 style='color: blue'>Hello World</h1><h3>Look, a smaller heading</h3>");
    }
}
