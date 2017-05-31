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
     * Board의 boardcd(data,free,qna)<- 스트링타입,primary key<br>
     *  boardcd로 boardnm(게시판) 조회
     */
    String getBoardName(String boardcd);
    
    /**
     * 
     * boardcd로 boardcd(게시판타입),boardnm(게시판),UseYN(사용여부) 조회
     */
    ModelBoard  getBoardOne(String boardcd);
    
    /**
     * Board테이블의 모든 컬럼을<br>
     * boardnm기준 정렬 값 반환 
     */
    List<ModelBoard> getBoardList();
    
    /**
     *  Board테이블 모든컬럼 값 반환 
     */
    List<ModelBoard> getBoardListResultMap();
    
    /**
     * 
     * Board테이블에 값을 insert용
     */
    
    Integer insertBoard(ModelBoard board);
    
    /**
     * Board테이블에 update <br>
     * 키이름: searchValue,updateValue
     * 값: 따로 지정값
     */
    Integer updateBoard(ModelBoard searchValue, ModelBoard updateValue);
    
    /**
     * Board테이블에서 delete<br>
     * if 조건 3개<br>
     * 1. boardcd 값이 NULL이 아니고 '' 공백이 아닐때 boardcd로 조회문 추가<br>
     * 2. boardnm 값이 위와같을 때 boardnm로 조회문 추가<br>
     * 3. UseYN 값이 NULL이 아닐때 UseYN 조회 추가<br>
     * 3개 조건식이 다 아니면 1=1 조건으로 전부 삭제<br>
     */
    Integer deleteBoard(ModelBoard board);

    /**
     * Board테이블에서 boardcd,boardnm,UseYN 값 반환 <br>
     * if 조건 2개<br>
     * 1. boardcd가 NULL이 아니고 ''이 아닐 때 boardcd like '%#boardcd%' 추가<br>
     * 2. boardnm이 위와같을 때 boardnm LIKE '%#{boardnm}%' 추가<br>
     * 둘다 아닐시 1=1 조건으로 반환
     */    
    
    ModelBoard getBoardSearch(ModelBoard board);
    /**
     * Board테이블에서 boardcd,boardnm,UseYN 값 반환 <br>
     * 매개변수로 hashmap이 사용되며 hash맵에 4개의 변수 사용 <br>
     * boardcd,searchWord(게시판이름),start(시작페이지),end(끝페이지) <br>
     * if 조건 2개<br>
     * 1. boardcd가 NULL이 아니고 ''이 아닐때 boardcd= #{boardcd} 쿼리 추가<br>
     * 2. boardnm이 위와 같을때 boardnm like searchWord 쿼리 추가<br>
     * 둘다 아닐시 1=1 조건 검색, boardcd,boardnm,UseYN 그룹묶음,boardcd 내림차순정렬<br>
     * 마지막으로 start,end 범위 조회
     */    
    
    ModelBoard getBoardPaging(ModelBoard searchValue, ModelBoard updateValue);
    
    /**
     * Board테이블에 추가할 item.(boardcd,boardnm,UseYN)을 리스트에 추가<br>
     * 추가된 리스트를 불러온뒤 항목수 만큼 값을 Board테이블에 추가.
     */
    Integer insertBoardList(java.util.List  list);
    
    /**
     * 
     * 
     */
    Integer getArticleTotalRecord(ModelArticle searchValue, ModelArticle updateValue);
    
    /**
     * 
     * 
     */
    ModelArticle getArticleList(ModelArticle searchValue, ModelArticle updateValue);
    
    /**
     * 
     * 
     */
    ModelArticle getArticle(Integer articleNo);
    
    /**
     * 
     * 
     */
    Integer insertArticle(ModelArticle article);
    
    /**
     * 
     * 
     */
    Integer updateArticle(ModelArticle searchValue, ModelArticle updateValue);
    
    /**
     * 
     * 
     */
    Integer deleteArticle(ModelArticle ModelArticle);
    
    /**
     * 
     * 
     */
    Integer increaseHit(Integer articleNo);
    
    /**
     * 
     * 
     */
    ModelArticle getNextArticle(ModelArticle searchValue, ModelArticle updateValue);
    
    /**
     * 
     * 
     */
    ModelArticle getPrevArticle(ModelArticle key,ModelArticle values);
    
    /**
     * 
     * 
     */
    ModelAttachfile getAttachFile(int attachFileNo);
    
    /**
     * 
     * 
     */
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
