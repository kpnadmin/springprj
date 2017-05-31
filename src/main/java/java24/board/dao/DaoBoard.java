package java24.board.dao;

import java.util.HashMap;
import java.util.List;

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
        ModelBoard result =null;
        result = session.selectOne("mapper.mapperBoard.getBoardOne",boardcd);
        return result;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        List<ModelBoard> result = null;
        result = session.selectList("mapper.mapperBook.getBoardList");
        return result;
    }

    @Override
    public List<ModelBoard> getBoardListResultMap() {
        ModelBoard result =null;
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
