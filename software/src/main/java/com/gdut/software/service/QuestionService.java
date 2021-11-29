package com.gdut.software.service;

import com.gdut.software.entity.Question;
import com.gdut.software.mapper.QuestionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class QuestionService {
    @Resource
    private QuestionMapper questionMapper;

    public Question selectById(int id){
        return questionMapper.selectById(id);
    }
}
