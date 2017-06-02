package java24.board.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.model.ModelBook;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Administrator on 2017-05-31.
 */
public class ServiceBoardTest {
    private  static IBoard service = null;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:java24/board/ApplicationContext.xml");
            service = context.getBean("serviceboard", IBoard.class);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
//
    @Test
    public void getBoardName() throws Exception {
        String result = service.getBoardName("data");
        assertEquals(result, "자료실");
    }

    @Test
    public void getBoardOne() throws Exception {
        String boardcd = "data";
        ModelBoard result = service.getBoardOne(boardcd);
        
        assertEquals(result.getBoardnm(), "자료실");
    }

    @Test
    public void getBoardList() throws Exception {
        ModelBoard board = new ModelBoard();
        
        List<ModelBoard> result = service.getBoardList();
        assertSame(result.size(), 3);
    }

    @Test
    public void getBoardListResultMap() throws Exception {

    }

    @Test
    public void insertBoard() throws Exception {
        ModelBoard board = new ModelBoard();
      
        /*
         * `boardcd` VARCHAR(20) NOT NULL,
    `boardnm` VARCHAR(40) NOT NULL,
    `UseYN` TINYINT(1) NOT NULL DEFAULT '1',
    `InsertUID` VARCHAR(40) NULL DEFAULT NULL,
    `InsertDT` DATETIME NULL DEFAULT NULL,
    `UpdateUID` VARCHAR(40) NULL DEFAULT NULL,
    `UpdateDT` DATETIME NULL DEFAULT NULL,
         * 
        */
        board.setBoardcd("faq");
        board.setBoardnm("자주묻는질문");
        board.setInsertDT(Date.valueOf("2017-01-01"));
        board.setInsertUID("");
        board.setUpdateDT(Date.valueOf("2017-01-02"));
        board.setUpdateUID("");
        board.setUseYN(true);
        int result = service.insertBoard(board);
        assertSame(result, 1);
    }

    @Test
    public void updateBoard() throws Exception {

    }

    @Test
    public void deleteBoard() throws Exception {

    }

    @Test
    public void getBoardSearch() throws Exception {

    }

    @Test
    public void getBoardPaging() throws Exception {

    }

    @Test
    public void insertBoardList() throws Exception {

    }

    @Test
    public void getArticleTotalRecord() throws Exception {

        String boardcd = "free";
        String searchWord = "article";
        int result = service.getArticleTotalRecord(boardcd, searchWord);
        
        assertEquals(result, 14);
        
    }

    @Test
    public void getArticleList() throws Exception {
        ModelArticle article = new ModelArticle();
        
        String boardcd = "free";
        String searchWord = "article";
        int start = 1;
        int end = 5;
        
    
        
        List<ModelArticle> result = service.getArticleList(boardcd,searchWord,start,end);
        
        assertEquals(result.size(), 5);
        
    }

    @Test
    public void getArticle() throws Exception {

        int articleno = 3;
        ModelArticle result = service.getArticle(articleno);
        
        assertEquals(result.getContent(), "article test 03");
        
        
    }

    @Test
    public void insertArticle() throws Exception {

    }

    @Test
    public void updateArticle() throws Exception {

    }

    @Test
    public void deleteArticle() throws Exception {

    }

    @Test
    public void increaseHit() throws Exception {

    }

    @Test
    public void getNextArticle() throws Exception {
        ModelArticle result = new ModelArticle();
        String boardcd = "free";
        int articleno = 1;
        String searchWord = "article test 01";
        result = service.getNextArticle(boardcd,articleno, searchWord);
        
        assertEquals(result.getTitle(), "article test 02");
    }

    @Test
    public void getPrevArticle() throws Exception {

    }

    @Test
    public void getAttachFile() throws Exception {
        int attachfileno = 3;
        ModelAttachfile result = service.getAttachFile(attachfileno);
        
        assertSame(result.getAttachfileno(), attachfileno);
    }

    @Test
    public void getAttachFileList() throws Exception {

    }

    @Test
    public void insertAttachFile() throws Exception {

    }

    @Test
    public void deleteAttachFile() throws Exception {

    }

    @Test
    public void getComment() throws Exception {
        ModelComments result = new ModelComments();
        int commento = 1;
        result = service.getComment(commento);
        
        assertEquals(result.getMemo(), "comment test");
    }

    @Test
    public void getCommentList() throws Exception {
       
        int articleno = 1;
        List<ModelComments> result= service.getCommentList(articleno);
        assertSame(result.size(), 2);
    }

    @Test
    public void insertComment() throws Exception {
        
        
        ModelComments comments = new ModelComments();
        comments.setArticleno(2);
        comments.setEmail("asad@aa.co.kr");
        comments.setMemo("comment test");
        //
        Calendar cal = Calendar.getInstance();
     // (2) 출력 형태를 지정하기 위해 Formatter를 얻는다.
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy:MM:dd-hh:mm:ss");
     // (3) 출력형태에 맞는 문자열을 얻는다.
         String datetime1 = sdf1.format(cal.getTime());
      
         comments.setRegdate(Date.valueOf(datetime1));
         comments.setInsertUID(null);
         comments.setInsertDT(null);
         comments.setUpdateUID(null);
         comments.setUpdateDT(null);
      
        int result = service.insertComment(comments);
        assertSame(result, 1);
    }

    @Test
    public void updateComment() throws Exception {

    }

    @Test
    public void deleteComment() throws Exception {

    }

}