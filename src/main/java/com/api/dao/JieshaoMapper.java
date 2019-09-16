package com.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.api.entity.Jieshao;

@Mapper
public interface JieshaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jieshao record);

    Jieshao selectByPrimaryKey(Integer id);

    List<Jieshao> selectAll();

    int updateByPrimaryKey(Jieshao record);
}