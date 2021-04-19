package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.VideoDAO;
import entity.Video;

@WebServlet("/video")
public class QLVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VideoDAO videoDao;

	public QLVideoServlet() {
		super();
		this.videoDao = new VideoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Video> listVideo = this.videoDao.getAll();

		request.setAttribute("listVideo", listVideo);

		request.getRequestDispatcher("/view/auth/Video.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
