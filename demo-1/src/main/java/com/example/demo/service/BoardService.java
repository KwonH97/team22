package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBoardDao;
import com.example.demo.dto.Board;

@Service
public class BoardService {

	@Autowired
	private IBoardDao dao;
	
	public List<Board> getAllList(){
		List<Board> list = dao.getAllList();
		 
		return list;
	}
	
	
	public void regBoard(Board board) {
		dao.regBoard(board);
	}
	
	
	public Board getBoard(int bno) {
		Board board = dao.getBoard(bno);
		return board;
	}
	
	public void deleteBoard(int bno) {
		dao.deleteBoard(bno);
	}
	
}
