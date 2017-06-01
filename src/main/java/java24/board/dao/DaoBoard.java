package java24.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java23.mybatis.model.ModelBook;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard{

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

	@Override
	public String getBoardName(String boardcd) {
		String result = "";
        result = session.selectOne("mapper.mapperBoard.getBoardName",boardcd);
        return result;
	}

	@Override
	public ModelBoard getBoardOne(String boardcd) {
		ModelBoard result = null;
		
        result = session.selectOne("mapper.mapperBoard.getBoardOne",boardcd);
        return result;
	}

	@Override
	public List<ModelBoard> getBoardList() {
	    List<ModelBoard> result = null;  
        result = session.selectList("mapper.mapperBoard.getBoardList");
        return result;
	}

	@Override
	public List<ModelBoard> getBoardListResultMap() {
		
		return null;
	}

	@Override
	public Integer insertBoard(ModelBoard board) {
	        int result = -1 ;
	       result = session.insert("mapper.mapperBoard.insertBoard", board);
	        return result;
	}

	@Override
	public Integer updateBoard(ModelBoard searchValue, ModelBoard updateValue) {
	    Map<String, ModelBoard> map = new HashMap<String, ModelBoard>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        
        int result = -1 ;
        result = session.update("mapper.mapperBoard.updateBoard", map);
         return result;
	}

	@Override
	public Integer deleteBoard(ModelBoard board) {
	    int result = -1 ;
        result = session.delete("mapper.mapperBoard.deleteBoard", board);
         return result;
	}

	@Override
	public List<ModelBoard> getBoardSearch(ModelBoard board) {
	    List<ModelBoard> result = null;  
        result = session.selectList("mapper.mapperBoard.getBoardSearch");
        return result;
	}

	@Override
	public List<ModelBoard> getBoardPaging(String boardcd, String boardnm, Boolean UseYN) {
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("boardcd", boardcd);
        map.put("boardnm", boardnm);
        map.put("UseYN", UseYN);
        
        List<ModelBoard> result = null;  
        result = session.selectList("mapper.mapperBoard.getBoardPaging", map);
        return result;
	}

	@Override
	public Integer insertBoardList(List list) {
		
		return null;
	}

	@Override
	public Integer getArticleTotalRecord(String boardcd, String searchWord) {
	    Map<String, Object> map = new HashMap<String, Object>();
	    map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        int result = -1 ; 
        result = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", map);
		return result;
	}

	@Override
	public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) {
		Map<String, Object> map = new HashMap();
		map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
		
		
		List<ModelArticle> result = session.selectList("mapper.mapperBoard.getArticleList", map);  
		
		
		return result;
	}

	@Override
	public ModelArticle getArticle(Integer articleNo) {
		
		return null;
	}

	@Override
	public Integer insertArticle(ModelArticle article) {
	    int result = -1 ;
        result = session.insert("mapper.mapperBoard.insertArticle", article);
         return result;
	}

	@Override
	public Integer updateArticle(ModelArticle searchValue, ModelArticle updateValue) {
	    Map<String, ModelArticle> map = new HashMap<String, ModelArticle>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        
        int result = -1 ;
        result = session.update("mapper.mapperBoard.updateArticle", map);
         return result;
	}

	@Override
	public Integer deleteArticle(ModelArticle article) {
	    int result = -1 ;
        result = session.delete("mapper.mapperBoard.deleteBoard", article);
         return result;
	}

	@Override
	public Integer increaseHit(Integer articleNo) {
		
		return null;
	}

	@Override
	public ModelArticle getNextArticle(ModelArticle searchValue, ModelArticle updateValue) {
		
		return null;
	}

	@Override
	public ModelArticle getPrevArticle(ModelArticle key, ModelArticle values) {
		
		return null;
	}

	@Override
	public ModelAttachfile getAttachFile(int attachFileNo) {
		
		return null;
	}

	@Override
	public ModelAttachfile getAttachFileList(int articleNo) {
		
		return null;
	}

	@Override
	public ModelAttachfile insertAttachFile(ModelAttachfile AttachFile) {
		
		return null;
	}

	@Override
	public ModelAttachfile deleteAttachFile(ModelAttachfile AttachFile) {
		
		return null;
	}

	@Override
	public ModelComments getComment(Integer commentNo) {
		
		return null;
	}

	@Override
	public List<ModelComments> getCommentList(Integer articleNo) {
		
		return null;
	}

	@Override
	public Integer insertComment(ModelComments comments) {
		
		return null;
	}

	@Override
	public Integer updateComment(ModelArticle searchValue, ModelArticle updateValue) {
		
		return null;
	}

	@Override
	public Integer deleteComment(ModelComments comments) {
		
		return null;
	}
    
    
 
    
}
