package com.way.hjbook.service;

import com.way.hjbook.entity.Book;
import com.way.hjbook.mapper.BookMapper;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

import static com.way.hjbook.utils.ResultCode.*;

/**
 * 书
 * @Author: wuaoya
 * @Date: 2021-05-04 19:34
 */
@Service
public class BookServiceImpl  implements BookService{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Result selectAllBook() {
        Result result = new Result();
        try {
            List<Book> bookList = bookMapper.selectAllBook();
            if(!StringUtils.isEmpty(bookList)){
                return result.successMassage(SUCCESS, bookList);
            }
            return result.errorMassage(BOOK_SELECT_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result insertBook(Book book) {
        Result result = new Result();
        try {
            if(1 == bookMapper.insert(book)){
                return result.successMassage(SUCCESS, book);
            }
            return result.errorMassage(BOOK_INSERT_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result modifyBook(Book book) {
        Result result = new Result();
        try {
            if(1 == bookMapper.updateByPrimaryKey(book)){
                return result.successMassage(SUCCESS, book);
            }
            return result.errorMassage(BOOK_MODIFY_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result deleteBookById(Long id) {
        Result result = new Result();
        try {
            if(1 == bookMapper.deleteByPrimaryKey(id)){
                return result.successMassage(SUCCESS);
            }
            return result.errorMassage(BOOK_DELETE_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
