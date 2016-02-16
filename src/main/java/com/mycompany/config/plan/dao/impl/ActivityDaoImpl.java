/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config.plan.dao.impl;

import com.mycompany.config.plan.Activity;
import com.mycompany.config.plan.dao.ActivityDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 * @author Patgaonkar
 */
public class ActivityDaoImpl implements ActivityDao {
	private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public List<Activity> getActivities() {
		return this.sessionFactory.getCurrentSession().createQuery("from Activity").list();
	}

	public Activity getActivityForTypeCode(String typeCode) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createQuery("from Activity where activityTypeCode=?").setParameter(0, typeCode).list();
		if(list!=null && !list.isEmpty()){
			return (Activity)list.get(0);
		}
		return null;
	}

}
