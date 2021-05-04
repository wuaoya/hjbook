package com.way.hjbook.service;

import com.way.hjbook.entity.Book;
import com.way.hjbook.utils.Result;

/**
 * @Author: wuaoya
 * @Date: 2021-05-04 19:27
 */
public interface BookService {

    Result selectAllBook();

    Result insertBook(Book book);

    Result modifyBook(Book book);

    Result deleteBookById(Long id);
}
