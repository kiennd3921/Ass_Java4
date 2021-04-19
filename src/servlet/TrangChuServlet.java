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

@WebServlet({ "/trangchu", "/video/delete" })
public class TrangChuServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private VideoDAO videoDao;

	public TrangChuServlet() {
		super();

		this.videoDao = new VideoDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pageStr = request.getParameter("page"), limitStr = request.getParameter("limit");

		int page = pageStr == null ? 1 : Integer.parseInt(pageStr),
				limit = limitStr == null ? 10 : Integer.parseInt(limitStr), offset = 6 * (page - 1);

		List<Video> listVideo = this.videoDao.getAll(offset, 6);

		request.setAttribute("listVideo", listVideo);
		request.setAttribute("page", page);
		request.getRequestDispatcher("/view/user/TrangChu.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String idStr = request.getParameter("id");
//
//		if (idStr == null) {
//			// Bad request
//		}
//
//		int id = Integer.parseInt(idStr);
//
//		Video entity = new Video();
//
//		entity.setId(idStr);
//
//		this.videoDao.delete(entity);
//
//		response.sendRedirect("/PT15307-UD/video");
	}
}
