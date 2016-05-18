package com.yc.cinema.services;

import java.util.List;

import com.yc.cinema.entity.FileBean;
import com.yc.cinema.entity.FileMinfo;

public interface FileService {

	List<FileMinfo> getFileByFileBEean(FileBean fileBean);
	
	public int insertFilm(FileBean fileBean);

}
