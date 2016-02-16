package com.mycompany.config.plan.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.Responsibility;
import com.mycompany.config.plan.dao.PlanDao;

public class PlanDaoImpl implements PlanDao {
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Plan getPlanByName(String planName) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createCriteria(Plan.class)
				.setFetchMode("responsibilities", FetchMode.JOIN)
				.setFetchMode("responsibilityDef", FetchMode.JOIN)
				.setFetchMode("activityGroups.activities",FetchMode.JOIN)
				.add(Restrictions.like("name", planName)).list();
		if(list!=null && !list.isEmpty()){
			Plan plan = (Plan)list.get(0);
			/*Iterator<Responsibility> itr = plan.getResponsibilities().iterator();
			while(itr.hasNext()){
				System.out.println(itr.next().getResponsibilityDef());
			}*/
			return plan;
		}
		return null;
	}

	public List<Plan> getAllPlans() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Plan> list = session.createCriteria(Plan.class)
				.setFetchMode("responsibilities", FetchMode.JOIN)
				.setFetchMode("responsibilityDef", FetchMode.JOIN).list();
		return list;
	}

}
