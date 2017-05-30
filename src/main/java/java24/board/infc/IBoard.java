package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java23.mybatis.model.ModelBook;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
    
    
    String getBoardName(String boardcd);
    // resultType 메서드명 (parameter type 컬럼명);
    //
    ModelBoard  getBoardOne(String boardcd);
    //
    List<ModelBoard> getBoardList();
   //
    List<ModelBoard> getBoardListResultMap();
    //
    HashMap getBoardCustomMap();
    //
    Integer insertBoard(ModelBoard board);
    //
    Integer updateBoard(ModelBoard searchValue, ModelBoard updateValue);
    //
    Integer deleteBoard(ModelBoard board);
    //
    ModelBoard getBoardSearch(ModelBoard board);
    //
    ModelBoard getBoardPaging(ModelBoard searchValue, ModelBoard updateValue);
    //
    Integer insertBoardList(java.util.List  list);
    //
    Integer getArticleTotalRecord(ModelArticle searchValue, ModelArticle updateValue);
    //
    ModelArticle getArticleList(ModelArticle searchValue, ModelArticle updateValue);
    //
    ModelArticle getArticle(Integer articleNo);
    //
    Integer insertArticle(ModelArticle article);
    //
    Integer updateArticle(ModelArticle searchValue, ModelArticle updateValue);
    //
    Integer deleteArticle(ModelArticle ModelArticle);
    //
    Integer increaseHit(Integer articleNo);
    // int update(ModelBook wherebook, ModelBook setbook)  ;
    ModelArticle getNextArticle(ModelArticle searchValue, ModelArticle updateValue);
    //
    //
    //

    //

    //

    //

    //

    //

    //

    //
    //
    //
    Integer getAttachFileList();
    //
    Integer deleteAttachFile(ModelAttachfile attachfile);
    //
    ModelComments getComment(Integer commentNo);
    //
    List<ModelComments> getCommentList(Integer articleNo);
    //
    Integer insertComment(ModelComments comments);
    //
    Integer updateComment(ModelArticle searchValue, ModelArticle updateValue);
    //
    Integer deleteComment(ModelComments comments);
    
}
