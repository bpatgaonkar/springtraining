package com.mycompany.config.plan.service;

import java.util.List;

import com.mycompany.config.plan.Plan;

public interface PlanService {
	public Plan getPlanByName(String planName);
	public List<Plan> getAllPlans();
}
