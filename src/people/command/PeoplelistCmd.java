package people.command;

import java.util.ArrayList;

import javax.servlet.http.*;

public class PeopleListCmd implements PeopleCmd{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		PeopleDAO dao = new PeopleDAO();
		ArrayList<BoardDTO> list;
		
		int pageCnt=0;
		String curPage = request.getParameter("curPage");
		
		if (curPage == null) curPage = "1";
		
		list = dao.peopleList(curpage);
	}
}
