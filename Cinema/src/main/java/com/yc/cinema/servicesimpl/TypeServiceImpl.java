package com.yc.cinema.servicesimpl;

import java.util.List;

import com.yc.cinema.entity.FileMtype;
import com.yc.cinema.mapper.FileMtypeMapper;


import com.yc.cinema.services.TypeService;
import com.yc.cinema.util.MyBatisUtil;

public class TypeServiceImpl implements TypeService {
	private FileMtypeMapper fileTypeMapper;
	public TypeServiceImpl(){
		fileTypeMapper=MyBatisUtil.getSession().getMapper(FileMtypeMapper.class);
	}
	@Override
	public List<FileMtype> findAllType() {
		List<FileMtype> types=fileTypeMapper.getAllType();
		return types;
	}

}
