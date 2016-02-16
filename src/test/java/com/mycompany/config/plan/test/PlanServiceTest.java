package com.mycompany.config.plan.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.config.plan.Activity;
import com.mycompany.config.plan.ActivityGroup;
import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.Responsibility;
import com.mycompany.config.plan.service.PlanService;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:com/mycompany/config/applicationContext.xml"})
public class PlanServiceTest {
	@Autowired
	PlanService planService;
	
	public static final Logger log = Logger.getLogger(PlanServiceTest.class);
	
	//@Test
	public void testGetPlanByName() {
		assertNotNull(planService);
		Plan plan = planService.getPlanByName("PLMainLoanPlan1");
		assertNotNull(plan);
		if(plan!=null){
			Set responiblities = plan.getResponsibilities();
			Iterator<Responsibility> itrResp = responiblities.iterator();
			while(itrResp.hasNext()){
				Responsibility resp = itrResp.next();
				log.debug("Responsibility = "+resp.getResponsibilityDef().getDisplayname() + " at position "+resp.getPosition());
				Set aGroup= resp.getActivityGroups();
				Iterator<ActivityGroup> itrAGroup = aGroup.iterator();
				while(itrAGroup.hasNext()){
					ActivityGroup ag = itrAGroup.next();
					log.debug("ActivityGroup = "+(ag.getTitle()==null ? "" : ag.getTitle()) + " at position = "+ag.getPosition());
					Set activities = ag.getActivities();
					Iterator<Activity> itrActivity = activities.iterator();
					while(itrActivity.hasNext()){
						Activity act = itrActivity.next();
						log.debug("Activity ="+(act.getActivityType().getDisplayname() == null ? act.getActivityType().getDescription():act.getActivityType().getDisplayname())
								+" at position = "+act.getPosition());
					}
				}
			}	
		}		
	}

	//@Test
	public void testGetAllPlans() {
		assertNotNull(planService);
		List<Plan> plansList = planService.getAllPlans();
		assertNotSame(true, plansList.isEmpty());
		
	}

}
