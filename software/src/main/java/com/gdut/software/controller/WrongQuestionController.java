package com.gdut.software.controller;

import com.alibaba.fastjson.JSON;
import com.gdut.software.entity.QueryInfo;
import com.gdut.software.entity.WrongQuestions;
import com.gdut.software.service.WrongQuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class WrongQuestionController {
    @Resource
    private WrongQuestionService wrongQuestionService;

    @RequestMapping(value = "/getWrongQuestions", method = RequestMethod.POST)
    public String getWrongQuestions(@RequestBody QueryInfo queryInfo){
        queryInfo.setPage((queryInfo.getPage() - 1) * queryInfo.getSize());
        System.out.println(queryInfo);
        List<WrongQuestions> qList = wrongQuestionService.selectQuestions(queryInfo);
        int count = wrongQuestionService.getCount(queryInfo);
        HashMap<String, Object> map = new HashMap<>();
        map.put("number", count);
        map.put("questionList", qList);
        return JSON.toJSONString(map);
    }

    @RequestMapping("/getWrongQuestionsKinds/{id}")
    public String getWrongQuestionsKinds(@PathVariable int id){
        List<String> kList = wrongQuestionService.getKinds(id);
        HashMap<String, Object> map = new HashMap<>();
        map.put("kinds", kList);
        return JSON.toJSONString(map);
    }


}
