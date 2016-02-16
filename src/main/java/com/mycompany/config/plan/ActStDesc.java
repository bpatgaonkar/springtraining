package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ActStDesc generated by hbm2java
 */
public class ActStDesc  implements java.io.Serializable {


     private BigDecimal actStDescId;
     private long version;
     private Activity activity;
     private String state;
     private String curstate;
     private String invact;
     private BigDecimal sessionid;
     private Date lstmoddttm;
     private BigDecimal actStDepId;
     private Set activityEvents = new HashSet(0);

    public ActStDesc() {
    }

	
    public ActStDesc(BigDecimal actStDescId, Activity activity, String state, BigDecimal sessionid, Date lstmoddttm) {
        this.actStDescId = actStDescId;
        this.activity = activity;
        this.state = state;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ActStDesc(BigDecimal actStDescId, Activity activity, String state, String curstate, String invact, BigDecimal sessionid, Date lstmoddttm, BigDecimal actStDepId, Set activityEvents) {
       this.actStDescId = actStDescId;
       this.activity = activity;
       this.state = state;
       this.curstate = curstate;
       this.invact = invact;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.actStDepId = actStDepId;
       this.activityEvents = activityEvents;
    }
   
    public BigDecimal getActStDescId() {
        return this.actStDescId;
    }
    
    public void setActStDescId(BigDecimal actStDescId) {
        this.actStDescId = actStDescId;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public Activity getActivity() {
        return this.activity;
    }
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    public String getCurstate() {
        return this.curstate;
    }
    
    public void setCurstate(String curstate) {
        this.curstate = curstate;
    }
    public String getInvact() {
        return this.invact;
    }
    
    public void setInvact(String invact) {
        this.invact = invact;
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
    public BigDecimal getActStDepId() {
        return this.actStDepId;
    }
    
    public void setActStDepId(BigDecimal actStDepId) {
        this.actStDepId = actStDepId;
    }
    public Set getActivityEvents() {
        return this.activityEvents;
    }
    
    public void setActivityEvents(Set activityEvents) {
        this.activityEvents = activityEvents;
    }




}

