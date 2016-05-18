package com.yc.cinema.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import com.yc.cinema.entity.FileBean;
import com.yc.cinema.entity.FileMinfo;
import com.yc.cinema.services.FileService;
import com.yc.cinema.servicesimpl.FileServiceImpl;

public class FilmAction implements ModelDriven<FileBean>,SessionAware{
	private FileBean fileBean;
	private FileService filmService;
	private Map<String,Object> session;
	@Override
	public FileBean getModel() {
		fileBean=new FileBean();
		return fileBean;
	}
	
	public FilmAction(){
		filmService=new FileServiceImpl();
	}
	
	public String search(){
		//LogManager.getLogger().debug("取道的查询条件"+fileBean);
		List<FileMinfo> files=filmService.getFileByFileBEean( fileBean);
		//System.out.println(fileBean);
		session.put("films",files);
		return "success";
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	
	public void add(){
		LogManager.getLogger().debug("条件"+fileBean);
		System.out.println("fsdfsfsdafsdafsdafsdafsad");
		System.out.println("heihie"+fileBean);
		filmService.insertFilm(fileBean);
	}
}
