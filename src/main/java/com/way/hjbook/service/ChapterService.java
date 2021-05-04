package com.way.hjbook.service;

import com.way.hjbook.entity.Chapter;
import com.way.hjbook.utils.Result;

import java.math.BigInteger;

/**
 * @Author: wuaoya
 * @Date: 2021-05-04 18:32
 */
public interface ChapterService {

    /**
     * 上传章节
     * @param chapter
     * @return
     */
    Result upload(Chapter chapter);

    /**
     * 修改章节
     * @param chapter
     * @return
     */
    Result modifyChapter(Chapter chapter);

    /**
     * 根据书名查询所有章节
     * @param test
     * @return
     */
    Result selectBybookId(Long test);

    /**
     * 根据章节查询章节内容
     * @param chapterId
     * @return
     */
    Result selectByChapterId(Long chapterId);

    /**
     * 删除章节
     * @param chapterId
     * @return
     */
    Result deleteChapterById(Long chapterId);


}
