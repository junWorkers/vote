package com.yc.cinema.mapper;

import java.util.List;

import com.yc.cinema.entity.FileBean;
import com.yc.cinema.entity.FileMinfo;

public interface FileMinfoMapper {
  List<FileMinfo> getFilmsByFilmBean(FileBean fileBean);
  int addFilm(FileBean fileBean);
}