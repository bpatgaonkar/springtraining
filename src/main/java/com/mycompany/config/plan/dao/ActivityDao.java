/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config.plan.dao;

import com.mycompany.config.plan.Activity;
import java.util.List;

/**
 *
 * @author Patgaonkar
 */
public interface ActivityDao {
    public List<Activity> getActivities();
    public Activity getActivityForTypeCode(String typeCode);
}
