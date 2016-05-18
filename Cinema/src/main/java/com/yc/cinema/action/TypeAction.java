package com.yc.cinema.action;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.yc.cinema.entity.FileMtype;
import com.yc.cinema.services.TypeService;
import com.yc.cinema.servicesimpl.TypeServiceImpl;

public class TypeAction {
	private TypeService typeService;
	private List<FileMtype> fileTypes;
	
	public List<FileMtype> getFileTypes() {
		return fileTypes;
	}
	public TypeAction(){
		typeService=new TypeServiceImpl();
	}
	//直接做异步响应，所以不需要进行页面跳转，返回类型使用void
	
	/*public void getTypes(){
		//获得response对象
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("charset=utf-8");
		try {
			List<FileMtype> types=typeService.findAllType();
			
			//使用gson
			Gson gson=new Gson();//创建json处理对象
			String jsonResult=gson.toJson(types);//把对象转换成json
			PrintWriter pw=response.getWriter();
			//pw.println("{\"msg\":\"我给你了\"}");
			pw.println(jsonResult);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
	//不进行页面条跳转，使用struts的插件包struts2-json-plugin来处理
	public String getTypes(){
		fileTypes=typeService.findAllType();
		return "success";
	}
}
