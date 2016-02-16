/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config.plan.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mycompany.config.plan.Activity;
import com.mycompany.config.plan.service.ActivityService;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Patgaonkar
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:com/mycompany/config/applicationContext.xml"})
public class ActivityServiceTest {
	@Autowired
	ActivityService activityService;

	//@org.junit.Test
    public void testGetActivityTypeForTypeCode() {
        assertNotNull(activityService);
        Activity activity= activityService.getActivityForTypeCode("Full_Loan_Application");
        assertNotNull(activity);
    }

    //@org.junit.Test
	 public void testGetActivityTypes() {
	        assertNotNull(activityService);
	        List<Activity> activityList = activityService.getActivities();
	        assertTrue(activityList.size()>0);
	 }	
}
