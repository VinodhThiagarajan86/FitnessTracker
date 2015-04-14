package com.javagrasp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javagrasp.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.javagrasp.service.ExerciseService#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();

		Activity run = new Activity();
		Activity bike = new Activity();
		Activity swim = new Activity();

		run.setDesc("run");
		bike.setDesc("bike");
		swim.setDesc("swim");

		activities.add(run);
		activities.add(bike);
		activities.add(swim);
		return activities;
	}

}
