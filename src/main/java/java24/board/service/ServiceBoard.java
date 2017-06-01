package java24.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java23.mybatis.model.ModelBook;
import java24.board.dao.DaoBoard;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

import java.util.List;


@Service("serviceboard")
public class ServiceBoard implements IBoard{
    private static Logger log = LoggerFactory.getLogger(ServiceBoard.class);
    

    @Autowired
    @Qualifier("daoboard")
    private DaoBoard dao;


    @Override
    public String getBoardName(String boardcd) {
        String result = "" ;
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            log.error("getBoardName"+e.getMessage());

        }

        return result;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) {
        
        ModelBoard result = null;
        try {
            result = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            log.error("getBoardOne"+e.getMessage());

        }
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        
        List<ModelBoard> result = null;
        try {
            result = dao.getBoardList();
        } catch (Exception e) {
            log.error("SelectAll"+e.getMessage());

        }


        return result;
    }

    @Override
    public List<ModelBoard> getBoardListResultMap() {
        
        return null;
    }

    @Override
    public Integer insertBoard(ModelBoard board) {
        
  int result = -1 ; 
        
        try {
            result = dao.insertBoard(board);
        } catch (Exception e) {
            log.error("insertBoard"+e.getMessage());

        }
        
        return result;
    }

    @Override
    public Integer updateBoard(ModelBoard searchValue, ModelBoard updateValue) {
        
        return null;
    }

    @Override
    public Integer deleteBoard(ModelBoard board) {
        
        return null;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        
        return null;
    }

    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String boardnm, Boolean UseYN) {
        
        return null;
    }

    @Override
    public Integer insertBoardList(List list) {
        
        return null;
    }

    @Override
    public Integer getArticleTotalRecord(String boardcd, String searchWord) {
        int result = -1 ; 
        try {
            result = dao.getArticleTotalRecord(boardcd, searchWord);
        } catch (Exception e) {
            log.error("getArticleTotalRecord"+e.getMessage());

        }
        
        return result;
    }

    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, int start, int end) {
        List<ModelArticle> result = null;
        try {
            result = dao.getArticleList(boardcd, searchWord,  start,  end);
        } catch (Exception e) {
            log.error("getArticleList"+e.getMessage());

        }


        return result;
    }

    @Override
    public ModelArticle getArticle(Integer articleNo) {
        
        return null;
    }

    @Override
    public Integer insertArticle(ModelArticle article) {
        
        return null;
    }

    @Override
    public Integer updateArticle(ModelArticle searchValue,
            ModelArticle updateValue) {
       int result = 0 ;
        return null;
    }

    @Override
    public Integer deleteArticle(ModelArticle article) {
        
        return null;
    }

    @Override
    public Integer increaseHit(Integer articleNo) {
        
        return null;
    }

    @Override
    public ModelArticle getNextArticle(ModelArticle searchValue,
            ModelArticle updateValue) {
        
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
    public Integer updateComment(ModelArticle searchValue,
            ModelArticle updateValue) {
        
        return null;
    }

    @Override
    public Integer deleteComment(ModelComments comments) {
        
        return null;
    }

 
    
    
}
