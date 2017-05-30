package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java23.mybatis.model.ModelBook;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
    
    /**
     * 
     * @param Board의 boardcd(data,free,qna)<- 스트링타입,primary key<br>
              boardcd에 속하는 boardnm(게시판) 조회
     * @return
     */
    String getBoardName(String boardcd);
    
    
    ModelBoard  getBoardOne(String boardcd);
    
    
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
    //
    
    ModelArticle getNextArticle(ModelArticle searchValue, ModelArticle updateValue);
    //
    
    ModelArticle getPrevArticle(ModelArticle key,ModelArticle values);
    //
    
    ModelAttachfile getAttachFile(int attachFileNo);
    //
    
    ModelAttachfile getAttachFileList(int articleNo);
    //
    
    ModelAttachfile insertAttachFile(ModelAttachfile AttachFile);
    //
    
    
    ModelAttachfile deleteAttachFile(ModelAttachfile AttachFile );
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
