package java24.board.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.board.infc.IBoard;

import static org.junit.Assert.*;

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

    }

    @Test
    public void getBoardList() throws Exception {

    }

    @Test
    public void getBoardListResultMap() throws Exception {

    }

    @Test
    public void insertBoard() throws Exception {

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

    }

    @Test
    public void getArticleList() throws Exception {

    }

    @Test
    public void getArticle() throws Exception {

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