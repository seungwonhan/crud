package Service;

import VO.BoardVO;
import dao.BoardDAO;

public class BoardWriteProService {

	public boolean registArticle (BoardVO boardVO) throws Exception{
		
		boolean isWriteSuccess = false;
		BoardDAO boardDAO = new BoardDAO();
		
		int insertCount = boardDAO.insertArticle(boardVO);
		
		if(insertCount > 0) {
			isWriteSuccess = true;
		}else {
			isWriteSuccess = false;
		}
		
		return isWriteSuccess;
		
	}
}
