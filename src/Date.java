import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

@WebServlet("/date")
public class Date extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("wchodze");

        java.util.Date today = Calendar.getInstance().getTime();

        System.out.println(today);

        req.setAttribute("dateToday", today);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/date.jsp");
        requestDispatcher.forward(req, resp);

    }
}
