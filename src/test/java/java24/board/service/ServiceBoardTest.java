package java24.board.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java23.mybatis.model.ModelBook;
import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelBoard;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
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
        
        ModelBoard searchValue = new ModelBoard();
        
        searchValue.setBoardcd("faq");
        searchValue.setBoardnm(null);
        searchValue.setUseYN(true);
        
        ModelBoard updateValue= new ModelBoard();
        updateValue.setBoardnm("자료실");
        updateValue.setUseYN(true);
        updateValue.setUpdateUID("son");
        updateValue.setUpdateDT(Date.valueOf("2017-06-02"));
        
        int result = service.updateBoard(searchValue, updateValue);
        
        if(result>=0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }

    @Test
    public void deleteBoard() throws Exception {
        
        ModelBoard board = new ModelBoard();
        
        board.setBoardcd("faq");
        board.setBoardnm(null);
        board.setUseYN(null);
        
        int result = service.deleteBoard(board);
        
        if(result>=0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }

    @Test
    public void getBoardSearch() throws Exception {
        List<ModelBoard> result = null;
        ModelBoard board = new ModelBoard();
        
        board.setBoardcd("faq");
        board.setBoardnm(null);
        
        result = service.getBoardSearch(board);
        
        if(result!=null){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }

    @Test
    public void getBoardPaging() throws Exception {
        String boardcd = "free";
        String searchWord = "article";
        int start = 1;
        int end = 5;
        
    
        
        List<ModelArticle> result = service.getArticleList(boardcd,searchWord,start,end);
        
        assertEquals(result.size(), 5);
    }

    @Test
    public void insertBoardList() throws Exception {
        
        
        List<ModelBoard> list =new ArrayList<ModelBoard>();
        
        ModelBoard insert1 = new ModelBoard();
        
        insert1.setBoardcd("insert1");
        insert1.setBoardnm("test");
        insert1.setUseYN(true);
        
        ModelBoard insert2 = new ModelBoard();
        insert2.setBoardcd("insert2");
        insert2.setBoardnm("test2");
        insert2.setUseYN(true);
        
        list.add(insert1);
        list.add(insert2);
        
        int result=service.insertBoardList(list);
        
        assertSame(result, 2);
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
        
        assertEquals(result.getBoardcd(), "free");
        
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

    }

    @Test
    public void getPrevArticle() throws Exception {

    }

    @Test
    public void getAttachFile() throws Exception {

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

    }

    @Test
    public void getCommentList() throws Exception {

    }

    @Test
    public void insertComment() throws Exception {

    }

    @Test
    public void updateComment() throws Exception {

    }

    @Test
    public void deleteComment() throws Exception {

    }

}