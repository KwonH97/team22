package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.dto.Board;

@Mapper
public interface IBoardDao {
	public List<Board> getAllList();
	public Board getBoard(int bno);
	public void regBoard(@Param("board") Board board);
	public void deleteBoard(int bno);
}
