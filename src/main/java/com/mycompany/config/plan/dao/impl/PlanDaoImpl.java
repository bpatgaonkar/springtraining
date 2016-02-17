package com.mycompany.config.plan.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.dao.PlanDao;

public class PlanDaoImpl implements PlanDao {
	private SessionFactory sessionFactory;
	private static final Logger log = Logger.getLogger(PlanDaoImpl.class);
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Plan getPlanByName(String planName) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createCriteria(Plan.class)
				//.setProjection(Projections.distinct(Projections.id()))
				//.setFetchMode("responsibilities", FetchMode.JOIN)
				//.setFetchMode("responsibilityDef", FetchMode.JOIN)
				//.setFetchMode("responsibilities.activityGroups.activities",FetchMode.JOIN)
				.add(Restrictions.like("name", planName)).list();
		if(list!=null && !list.isEmpty()){
			Plan plan = (Plan)list.get(0);
                        plan.getResponsibilities();
			return plan;
		}
		return null;
	}

	public List<Plan> getAllPlans() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Plan> list = session.createCriteria(Plan.class)
				//.setFetchMode("responsibilities", FetchMode.JOIN)
				//.setFetchMode("responsibilityDef", FetchMode.JOIN)
				.list();
		/*for(int i=0;i<list.size();i++){
			Plan plan = list.get(i);
			Set<Responsibility> resp = plan.getResponsibilities();
			Iterator<Responsibility> itr = resp.iterator();
			while(itr.hasNext()){
				Responsibility r= itr.next();
				Set<ActivityGroup> ag= r.getActivityGroups();
				Iterator<ActivityGroup> agItr = ag.iterator();
				while(agItr.hasNext()){
					Set<Activity> as = agItr.next().getActivities();
					Iterator<Activity> asItr = as.iterator();
					while(asItr.hasNext()){
						asItr.next().getActivityType().getActivitydefinitions();
					}
				}
			}
		}*/
		log.debug("no of plans "+list.size());
		return list;
	}

}
