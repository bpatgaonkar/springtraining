package com.mycompany.config.plan.dao;

import java.util.List;

import com.mycompany.config.plan.Plan;

public interface PlanDao {
	public Plan getPlanByName(String planName);
	public List<Plan> getAllPlans();
}
