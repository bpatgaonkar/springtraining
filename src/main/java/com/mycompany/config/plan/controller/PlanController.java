package com.mycompany.config.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.PlanList;
import com.mycompany.config.plan.Responsibility;
import com.mycompany.config.plan.ResponsibilityDef;
import com.mycompany.config.plan.service.PlanService;

@Controller
@RequestMapping("/plan")
public class PlanController {
	@Autowired
	PlanService planService; 
	
	public PlanService getPlanService() {
		return planService;
	}

	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, value = "/{name}", method = RequestMethod.GET)
	public @ResponseBody Plan getPlanByName(@PathVariable String name, ModelMap model) {
		Plan plan= planService.getPlanByName(name);
		((Responsibility) plan.getResponsibilities().iterator().next()).getResponsibilityDef().getResponsibilities();
		((Responsibility) plan.getResponsibilities().iterator().next()).getActivityDetails();
		((Responsibility) plan.getResponsibilities().iterator().next()).getActivityGroups();
		return plan;
	}
	
	@RequestMapping(value="/list", produces = {MediaType.APPLICATION_XML_VALUE}, method = RequestMethod.GET)
	public @ResponseBody PlanList getAllPlan(ModelMap model) {
		List<Plan> plist= planService.getAllPlans();
		PlanList plans = new PlanList();
		plans.setPlans(plist);
		plans.setNoOfRecords(plist.size());
		return plans;
	}	
}
