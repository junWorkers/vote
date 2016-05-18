package com.yc.cinema.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;
	
	static{
		InputStream in;
		try {
			in = Resources.getResourceAsStream("mybatis.xml");
			factory=new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//取到sqlSession对象
	public static SqlSession getSession(){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession();
		}
		return session;
	}
	//取到SqlSession对象，事务自动提�?
	public static SqlSession getSession(boolean isAutoCommit){
		SqlSession session=null;
		if(factory!=null){
			session=factory.openSession(isAutoCommit);//isAutoCommit为true时，自动提交
		}
		return session;
	}
	//关闭SqlSession
	public static void close(SqlSession session){
		if(session!=null){
			session.close();
		}
	}

}
