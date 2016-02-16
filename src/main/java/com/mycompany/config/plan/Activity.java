package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Activity generated by hbm2java
 */
@XmlType(name="Activity")
@XmlAccessorType(XmlAccessType.FIELD)
public class Activity  implements java.io.Serializable {

	 @XmlTransient
     private BigDecimal activityid;
	 @XmlTransient
     private long version;
	 @XmlTransient
     private ActivityGroup activityGroup;
	 @XmlElement(name="ActivityType")
     private ActivityType activityType;
     @XmlTransient
     private String planname;
     @XmlTransient
     private String selector;
     @XmlTransient
     private BigDecimal sessionid;
     @XmlTransient
     private Date lstmoddttm;
     @XmlAttribute
     private Long position;
     @XmlAttribute
     private String initialvisibility;
     @XmlTransient
     private Set activityEvents = new HashSet(0);
     @XmlTransient
     private Set actAccDescs = new HashSet(0);
     @XmlTransient
     private Set activityContexts = new HashSet(0);
     @XmlTransient
     private Set actStDescs = new HashSet(0);

    public Activity() {
    }

	
    public Activity(BigDecimal activityid, ActivityType activityType, String planname, BigDecimal sessionid, Date lstmoddttm) {
        this.activityid = activityid;
        this.activityType = activityType;
        this.planname = planname;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public Activity(BigDecimal activityid, ActivityGroup activityGroup, ActivityType activityType, String planname, String selector, BigDecimal sessionid, Date lstmoddttm, Long position, String initialvisibility, Set activityEvents, Set actAccDescs, Set activityContexts, Set actStDescs) {
       this.activityid = activityid;
       this.activityGroup = activityGroup;
       this.activityType = activityType;
       this.planname = planname;
       this.selector = selector;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.position = position;
       this.initialvisibility = initialvisibility;
       this.activityEvents = activityEvents;
       this.actAccDescs = actAccDescs;
       this.activityContexts = activityContexts;
       this.actStDescs = actStDescs;
    }
   
    public BigDecimal getActivityid() {
        return this.activityid;
    }
    
    public void setActivityid(BigDecimal activityid) {
        this.activityid = activityid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public ActivityGroup getActivityGroup() {
        return this.activityGroup;
    }
    
    public void setActivityGroup(ActivityGroup activityGroup) {
        this.activityGroup = activityGroup;
    }
    public ActivityType getActivityType() {
        return this.activityType;
    }
    
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    public String getPlanname() {
        return this.planname;
    }
    
    public void setPlanname(String planname) {
        this.planname = planname;
    }
    public String getSelector() {
        return this.selector;
    }
    
    public void setSelector(String selector) {
        this.selector = selector;
    }
    public BigDecimal getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(BigDecimal sessionid) {
        this.sessionid = sessionid;
    }
    public Date getLstmoddttm() {
        return this.lstmoddttm;
    }
    
    public void setLstmoddttm(Date lstmoddttm) {
        this.lstmoddttm = lstmoddttm;
    }
    public Long getPosition() {
        return this.position;
    }
    
    public void setPosition(Long position) {
        this.position = position;
    }
    public String getInitialvisibility() {
        return this.initialvisibility;
    }
    
    public void setInitialvisibility(String initialvisibility) {
        this.initialvisibility = initialvisibility;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Set getActivityEvents() {
        return this.activityEvents;
    }
    
    public void setActivityEvents(Set activityEvents) {
        this.activityEvents = activityEvents;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Set getActAccDescs() {
        return this.actAccDescs;
    }
    
    public void setActAccDescs(Set actAccDescs) {
        this.actAccDescs = actAccDescs;
    }
    public Set getActivityContexts() {
        return this.activityContexts;
    }
    
    public void setActivityContexts(Set activityContexts) {
        this.activityContexts = activityContexts;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Set getActStDescs() {
        return this.actStDescs;
    }
    
    public void setActStDescs(Set actStDescs) {
        this.actStDescs = actStDescs;
    }




}


