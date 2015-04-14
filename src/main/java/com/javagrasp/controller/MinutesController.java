package com.javagrasp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javagrasp.model.Activity;
import com.javagrasp.model.Exercise;
import com.javagrasp.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("exercise: " + exercise.getMinutes());
		System.out.println("exercising Activity: " + exercise.getActivity());
		return "addMinutes";
		//return "forward:addMoreMinutes";
		//return "redirect:addMoreMinutes";
	}
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise){
		
		System.out.println("exercising: " + exercise.getMinutes());
		System.out.println("exercising Activity: " + exercise.getActivity());
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities" , method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivity(){
		return exerciseService.findAllActivities();
	}

	
}
