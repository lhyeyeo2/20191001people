

import javax.servlet.http.*;
import java.util.ArrayList;

public class SerchCmd {

	public void excute(HttpServletRequest request, HttpServletResponse response) {
		PeopleDAO dao = new BoardDAO();
		String searchOption= request.getParameter("searchOption");
		String searchWord= request.getParameter("searchWord");
				
		ArrayList<PeopleDAO> list = dao.search(searchOption, searchWord);
		request.setAttribute("readList", list);
				
	}
}
