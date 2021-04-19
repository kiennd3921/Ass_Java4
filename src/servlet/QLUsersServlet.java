package servlet;

import java.io.IOException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utils.HibernateUtils;

import dao.UserDAO;
import entity.User;

@WebServlet({ "/user", "/users/delete", "/users/update", "/users/insert" })
public class QLUsersServlet extends HttpServlet {

	private static final long serialVersionUID = 4457761827027115594L;

	private UserDAO userDAO;

	public QLUsersServlet() {
		super();

		this.userDAO = new UserDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String servletPath = request.getServletPath();
		
		switch (servletPath) {
		case "/users/delete":
			this.delete(request, response);
			break;
		case "/user":
			String id = request.getParameter("id");
			if (id != null) {
				request.setAttribute("action", "/PT15307-UD/users/update");
				User user = userDAO.findById(id);
				request.setAttribute("user", user);
			} else {
				request.setAttribute("action", "/PT15307-UD/users/insert");
				request.setAttribute("user", new User());
			}
			this.getAll(request, response);
			break;
		default:
			break;
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String servletPath = request.getServletPath();
		
		switch (servletPath) {
		case "/users/update":
			this.update(request, response);
			break;
		case "/users/insert":
			this.insert(request, response);
			break;
		default:
			break;
		}
	}
	
	public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("users", userDAO.getAll());
		req.getRequestDispatcher("/view/auth/index.jsp").forward(req, resp);
	}
	
	private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		user.setEmail(req.getParameter("email"));
		user.setFullname(req.getParameter("fullname"));
		user.setId(req.getParameter("id"));
		user.setPassword(req.getParameter("password"));
		user.setAdmin("2".equals(req.getParameter("admin")));
		
		userDAO.insert(user);
		getAll(req, resp);
	}
	
	private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user = new User();
		user.setEmail(req.getParameter("email"));
		user.setFullname(req.getParameter("fullname"));
		user.setId(req.getParameter("id"));
		user.setPassword(req.getParameter("password"));
		user.setAdmin("2".equals(req.getParameter("admin")));
		
		userDAO.update(user);
		getAll(req, resp);
	}
	
	private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		if (userDAO.delete(id)) {
			
			getAll(req, resp);
		}
		System.out.println("delete");
	}

}
