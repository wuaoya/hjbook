package com.way.hjbook.controller;

import com.way.hjbook.entity.Chapter;
import com.way.hjbook.service.ChapterService;
import com.way.hjbook.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 章节
 * @Author: wuaoya
 * @Date: 2021-05-04 18:30
 */
@RestController
@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/upload")
    public Result uploadChapter(@RequestBody Chapter chapter){
        return chapterService.upload(chapter);
    }

    @PostMapping("/modify")
    public Result modifyChapter(@RequestBody Chapter chapter){
        return chapterService.modifyChapter(chapter);
    }

    @GetMapping("/selectById")
    public Result selectChapterById(@RequestParam("chapterId") Long chapterId){
        return chapterService.selectByChapterId(chapterId);
    }

    @GetMapping("/selectByBookId")
    public Result selectChapterByBookId(@RequestParam("test") Long test){
        return chapterService.selectBybookId(test);
    }

    @DeleteMapping("/deleteById")
    public Result deleteChapterById(@RequestParam("chapterId") Long chapterId){
        return chapterService.deleteChapterById(chapterId);
    }

    @GetMapping("/selectChapter")
    public Result selectChapter(){
        return chapterService.selectChapter();
    }


}
