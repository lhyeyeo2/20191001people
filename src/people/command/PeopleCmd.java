package people.command;

import javax.servlet.http.*;

public interface PeopleCmd {
	
	public void excute(HttpServletRequest request, HttpServletResponse response);
}
