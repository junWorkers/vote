package com.yc.cinema.servicesimpl;

import java.util.List;

import com.yc.cinema.entity.FileBean;
import com.yc.cinema.entity.FileMinfo;
import com.yc.cinema.mapper.FileMinfoMapper;
import com.yc.cinema.services.FileService;
import com.yc.cinema.util.MyBatisUtil;

public class FileServiceImpl implements FileService {
	private FileMinfoMapper filmInfoMapper;
	public FileServiceImpl(){
		filmInfoMapper=MyBatisUtil.getSession(true).getMapper(FileMinfoMapper.class);
	}

	@Override
	public List<FileMinfo> getFileByFileBEean(FileBean fileBean) {
		 List<FileMinfo> film=filmInfoMapper.getFilmsByFilmBean(fileBean);
		 return film;
	}

	@Override
	public int insertFilm(FileBean fileBean) {
		int result=filmInfoMapper.addFilm(fileBean);
		return result;
	}
	
}
