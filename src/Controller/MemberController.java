package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.ActionForward;
import action.Action;
import action.BoardListAction;
import action.boardWritePro;


@WebServlet("/board/*")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String pathInfo = request.getPathInfo(); // 2단계 정보를 호출할수 있습니다.
		System.out.println("action : " + pathInfo);
		ActionForward forward = null; // 뷰 페이지로 포워딩 하기 위한것
		Action action = null; // POJO
		
		init();
		
		if(pathInfo == null || pathInfo.equals("/boardList.do")) {			
			action = new BoardListAction();
			
			try {
				forward = action.execute(request, response);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else if(pathInfo.equals("/boardWriteForm.do")) {
			forward = new ActionForward();
			forward.setPath("/brd/board_write.jsp");
			
		}else if(pathInfo.equals("/boardWritePro.do")) {
			action = new boardWritePro();
			
			try {
				forward = action.execute(request, response);				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}


	
	

}
