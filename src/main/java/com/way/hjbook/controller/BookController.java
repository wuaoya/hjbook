package com.way.hjbook.controller;

import com.way.hjbook.entity.Book;
import com.way.hjbook.service.BookService;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 书
 * @Author: wuaoya
 * @Date: 2021-05-04 20:30
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/selectAllBook")
    public Result selectAllBook(){
        return bookService.selectAllBook();
    }

    @PostMapping("/insertBook")
    public Result insertBook(@RequestBody Book book){
        return bookService.insertBook(book);
    }

    @PutMapping("/modifyBook")
    public Result modifyBook(@RequestBody Book book){
        return bookService.modifyBook(book);
    }

    @DeleteMapping("/deleteBookById")
    public Result deleteBookById(@RequestParam("id") Long id){
        return bookService.deleteBookById(id);
    }
}
