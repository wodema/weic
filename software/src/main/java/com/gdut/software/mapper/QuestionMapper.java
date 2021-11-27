package com.gdut.software.mapper;

import com.gdut.software.entity.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionMapper {
    public Question selectById(int id);
}
