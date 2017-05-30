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
    
    
    List<ModelBoard> getBoardListResultMap();
    
    
    HashMap getBoardCustomMap();
    
    
    Integer insertBoard(ModelBoard board);
    
    
    Integer updateBoard(ModelBoard searchValue, ModelBoard updateValue);
    
    
    Integer deleteBoard(ModelBoard board);
    
    
    ModelBoard getBoardSearch(ModelBoard board);
    
    
    ModelBoard getBoardPaging(ModelBoard searchValue, ModelBoard updateValue);
    
    
    Integer insertBoardList(java.util.List  list);
    
    
    Integer getArticleTotalRecord(ModelArticle searchValue, ModelArticle updateValue);
    
    
    ModelArticle getArticleList(ModelArticle searchValue, ModelArticle updateValue);
    
    
    ModelArticle getArticle(Integer articleNo);
    
    
    Integer insertArticle(ModelArticle article);
    
   
    Integer updateArticle(ModelArticle searchValue, ModelArticle updateValue);
    
    
    Integer deleteArticle(ModelArticle ModelArticle);
    
    
    Integer increaseHit(Integer articleNo);
    
    
    ModelArticle getNextArticle(ModelArticle searchValue, ModelArticle updateValue);
    
    
    ModelArticle getPrevArticle(ModelArticle key,ModelArticle values);
    
    
    ModelAttachfile getAttachFile(int attachFileNo);
    
    
    ModelAttachfile getAttachFileList(int articleNo);
    
    /**
     * 
     * @param AttachFile의 filename(어태치파일) <- String <br>  UseYN(aa@aa.co.kr) <- int <br> articleno(1)  <- int <br>  UseYN(1) <- int  <br>
              commentno에 속하는 컬럼 삭제
     * @return Integer
     */
    
    ModelAttachfile insertAttachFile(ModelAttachfile AttachFile);
    
    
    /**
     * 
     * @param comments의 attachfileno(1,2,3,4,5,6,7)<- int,primary key<br> filename(어태치파일) <- String <br>  UseYN(aa@aa.co.kr) <- int <br> articleno(1)  <- int <br>  UseYN(1) <- int  <br>
              commentno에 속하는 컬럼 삭제
     * @return Integer
     */
    ModelAttachfile deleteAttachFile(ModelAttachfile AttachFile );
    
    
    
    /**
     * @param comments의 commentno(1)<- int <br> articleno(1) <- int <br>  email(aa@aa.co.kr) <- String <br> memo("comment test") <- String <br>  regdate("2017-05-29 15:27:21") <- Date <br> InsertUID("1") <- String <br> InsertDT("") <- Date <br> UpdateUID("") <- String <br> UpdateDT("") <- Date <br>
              commentno에 속하는 컬럼 조회
     * @return ModelAttachfile
     */
    ModelComments getComment(Integer commentNo);
   
   
    /**
     * @param comments의 commentno(1)<- int <br> articleno(1) <- int <br>  email(aa@aa.co.kr)  <- String <br> memo("comment test")  <br>  regdate("2017-05-29 15:27:21") <- Date  <br> InsertUID("1") <- String  <br> InsertDT("") <- Date  <br> UpdateUID("") <- String <br> UpdateDT("") <- Date <br>
              commentno에 속하는 컬럼 조회
     * @return List
     */
    List<ModelComments> getCommentList(Integer articleNo);
    /**
     * 
     * @param comments의 articleNo(1)<- int <br> articleno(1) < <br>  email(aa@aa.co.kr)  <br> memo("")  <br>  regdate("")  <br> InsertUID("")  <br> InsertDT("")  <br> UpdateUID("")  <br> UpdateDT("")  <br>
              commentno에 속하는 컬럼 insert
     * @return Integer
     */
    Integer insertComment(ModelComments comments);
  
    /**
     * @param searchValue의 commentno(1) <- int,primary key <br>  updateValue
     *                 에 속하는 컬럼 update
     * @return Integer
     */
    Integer updateComment(ModelArticle searchValue, ModelArticle updateValue);
   
    /**
     * 
     * @param comments의 commentno(1)<- int,primary key<br> articleno(1) <- int < <br>  email(aa@aa.co.kr)  <br> articleno(1)  <- String <br>  UseYN(1) <- int <br>
              commentno에 속하는 컬럼 삭제
     * @return Integer
     */
    Integer deleteComment(ModelComments comments);
   
}
