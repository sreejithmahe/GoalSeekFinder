package com.goalseek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.goalseek.dao.GoalSeekDao;
import com.goalseek.service.GoalseekService;
/**
 * @author sreejith.kizhakkayil
 *
 */
@RestController
public class GoalSeekController {
	
	@Autowired
	private GoalseekService goalseekService;

	@RequestMapping (value ="/goalseek")
     public String goalseek(@RequestBody GoalSeekDao gs) {
		return goalseekService.getGoalseek(gs);
    }
	
	@RequestMapping (method=RequestMethod.PUT, value="/goalseek")
	public String updateGoalseek(@RequestBody GoalSeekDao gs) {
		goalseekService.updateGoalseek(gs);
		return "RequestMethod.PUT";
	}
	@RequestMapping (method=RequestMethod.POST, value="/goalseek")
	public  String addGoalseek(@RequestBody GoalSeekDao gs) {
		return "RequestMethod.POST";
	}
	@RequestMapping (method=RequestMethod.DELETE, value="/goalseek")
	public String delGoalseek() {
		return "RequestMethod.DELETE";
	}
}
