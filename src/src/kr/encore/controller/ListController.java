package kr.encore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.encore.model.DeptDAO;

@Controller
public class ListController {
	
	@Autowired
	private DeptDAO deptDAO;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		List list = deptDAO.deptList();
		model.addAttribute("list", list);
		return "list";
	}
}
