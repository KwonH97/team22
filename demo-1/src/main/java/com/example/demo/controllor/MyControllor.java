package com.example.demo.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Board;
import com.example.demo.service.BoardService;


@Controller
public class MyControllor {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/")
	public String root() {
		return "main";
	}
	
	@RequestMapping("/list")
	public String listView(Model model) {
		List<Board> list = service.getAllList();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	
	@RequestMapping("/detail")
	public String boardView(@RequestParam("bno") int bno, Model model) {
		Board board = service.getBoard(bno);
		model.addAttribute("board", board);
		
		return "detail";
	}
	
	@RequestMapping("/regForm")
	public String regForm() {
		return "regForm";
	}
	
	@RequestMapping("/regist")
	public String regist(@RequestParam("title")String title, @RequestParam("content")String content, @RequestParam("writer")String writer) {
		
		Board board = new Board(0, title, content, writer);
		service.regBoard(board);
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("bno")int bno) {
		
		service.deleteBoard(bno);
		return "redirect:list";
	}
	
}
