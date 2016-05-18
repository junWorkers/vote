package com.yc.cinema.mapper;

import static org.junit.Assert.*;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

import com.yc.cinema.entity.FileBean;
import com.yc.cinema.entity.FileMinfo;
import com.yc.cinema.services.FileService;
import com.yc.cinema.servicesimpl.FileServiceImpl;

public class FileMinfoMapperTest {

	@Test
	public void testGetFilmsByFilmBean() {
		FileService fs=new FileServiceImpl();
		FileBean fileBean=new FileBean();
		//fileBean.setActor("成龙");
		List<FileMinfo> film=fs.getFileByFileBEean(fileBean);
		LogManager.getLogger().debug("查到的数据"+film);
		System.out.println(film);
		assertNotNull("没有查到数据",film);
	}
	

	@Test
	public void testInsertFilm() {
		FileService fs=new FileServiceImpl();
		FileBean fileBean=new FileBean(1,"君","10001","张学友","夏永康",88.0);
		int result=fs.insertFilm(fileBean);
		LogManager.getLogger().debug("得到的数据"+fileBean);
		assertEquals("插入失败",result,1);
	}
}
