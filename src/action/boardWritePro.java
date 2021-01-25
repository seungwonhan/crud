package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.BoardWriteProService;
import VO.ActionForward;
import VO.BoardVO;

public class boardWritePro implements Action {
	
	

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = null;
		BoardVO boardVO = null;
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		boardVO = new BoardVO();
		boardVO.setTitle(title);
		boardVO.setWriter(writer);
		boardVO.setContent(content);
		
		BoardWriteProService boardWriterProService = new BoardWriteProService(); 
		boolean isWriteSuccess = boardWriterProService.registArticle(boardVO);		
		
		return forward;
		
	}
}
