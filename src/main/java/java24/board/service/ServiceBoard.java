package java24.board.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.logging.Logger;

import java24.board.dao.DaoBoard;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public class ServiceBoard implements IBoard{

    //private static Logger log = LoggerFactory.getLogger(ServiceBoard.class);

    @Autowired
    @Qualifier("daoboard")
    private DaoBoard dao;


    @Override
    public String getBoardName(String boardcd) {
        String result = "" ;
        //boardcd = "data";
        try {
            result = dao.getBoardName(boardcd);
        } catch (Exception e) {
            //log.error("getMaxBookid"+e.getMessage());

        }

        return result;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) {
        
        return null;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        
        return null;
    }

    @Override
    public List<ModelBoard> getBoardListResultMap() {
        
        return null;
    }

    @Override
    public Integer insertBoard(ModelBoard board) {
        
        return null;
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
    public ModelBoard getBoardSearch(ModelBoard board) {
        
        return null;
    }

    @Override
    public ModelBoard getBoardPaging(ModelBoard searchValue,
            ModelBoard updateValue) {
        
        return null;
    }

    @Override
    public Integer insertBoardList(List list) {
        
        return null;
    }

    @Override
    public Integer getArticleTotalRecord(ModelArticle searchValue,
            ModelArticle updateValue) {
        
        return null;
    }

    @Override
    public ModelArticle getArticleList(ModelArticle searchValue,
            ModelArticle updateValue) {
        
        return null;
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
        
        return null;
    }

    @Override
    public Integer deleteArticle(ModelArticle ModelArticle) {
        
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