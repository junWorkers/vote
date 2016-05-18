package com.yc.cinema.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.junit.Test;

import com.yc.cinema.entity.FileMtype;
import com.yc.cinema.services.TypeService;
import com.yc.cinema.servicesimpl.TypeServiceImpl;

public class FileMtypeMapperTest {

	@Test
	public void testGetAllType() {
		TypeService ts=new TypeServiceImpl();
		List<FileMtype> types=ts.findAllType();
		System.out.println(types);
		LogManager.getLogger().debug("hiehie"+types);
		assertNotNull("失败",types);
	}
}
