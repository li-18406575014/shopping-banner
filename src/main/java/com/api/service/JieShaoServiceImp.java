package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dao.JieshaoMapper;
import com.api.entity.Jieshao;

@Service
public class JieShaoServiceImp implements JieShaoService{

	@Autowired
	private JieshaoMapper jieshaoMapper;

	@Override
	public List<Jieshao> selectBanner() {
		return jieshaoMapper.selectAll();
	}
}
