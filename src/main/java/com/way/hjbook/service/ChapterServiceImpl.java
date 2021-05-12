package com.way.hjbook.service;

import com.way.hjbook.entity.Book;
import com.way.hjbook.entity.Chapter;
import com.way.hjbook.mapper.BookMapper;
import com.way.hjbook.mapper.ChapterMapper;
import com.way.hjbook.utils.Result;
import com.way.hjbook.utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.List;

import static com.way.hjbook.utils.ResultCode.*;

/**
 * @Author: wuaoya
 * @Date: 2021-05-04 18:31
 */
@Service
public class ChapterServiceImpl implements ChapterService{
    @Autowired
    private ChapterMapper chapterMapper;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public Result upload(Chapter chapter) {
        Result result = new Result();
        try {
            if(1 == chapterMapper.insert(chapter)){
                Book book = new Book();
                book.setId(chapter.getTest());
               Integer num = chapterMapper.selectCountByBookId(chapter.getTest());
               book.setChapterNum(num);
                bookMapper.updateByPrimaryKeySelective(book);
                return result.successMassage(ResultCode.SUCCESS, chapter);
            }
            return result.errorMassage(ResultCode.CHAPTER_UPLOAD_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result modifyChapter(Chapter chapter) {
        Result result = new Result();
        try {
            if(1 == chapterMapper.updateByPrimaryKeySelective(chapter)){
                return result.successMassage(ResultCode.SUCCESS, chapter);
            }
            return result.errorMassage(ResultCode.CHAPTER_MODIFY_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result selectBybookId(Long test) {
        Result result = new Result();
        try {
            List<Chapter> chapterList = chapterMapper.selectByBookId(test);
            if (!StringUtils.isEmpty(chapterList)){
                return result.successMassage(ResultCode.SUCCESS, chapterList);
            }
            return result.errorMassage(CHAPTER_NOT_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result selectByChapterId(Long chapterId) {
        Result result = new Result();
        try {
            Chapter chapter = chapterMapper.selectByPrimaryKey(chapterId);
            if (!StringUtils.isEmpty(chapter)){
                return result.successMassage(SUCCESS, chapter);
            }
            return result.errorMassage(CHAPTER_NOT_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result deleteChapterById(Long chapterId) {
        Result result = new Result();
        try {
            if(1 == chapterMapper.deleteByPrimaryKey(chapterId)){
                return result.successMassage(SUCCESS);
            }
            return result.errorMassage(CHAPTER_DELETE_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Result selectChapter() {
        Result result = new Result();
        try {
            List<Chapter> chapterList = chapterMapper.selectChapter();
            if(!StringUtils.isEmpty(chapterList)){
                return result.successMassage(SUCCESS, chapterList);
            }
            return result.errorMassage(CHAPTER_SELECTALL_ERROR);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
