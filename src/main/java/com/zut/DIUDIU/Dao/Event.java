package com.zut.DIUDIU.Dao;

import java.util.Date;

/**
 * 
 * @date 2020/11/12
 */
public class Event {
    private Integer eventid;

    private String eventkind;

    private String eventstate;

    private Date eventstarttime;

    private Date eventovertime;

    private Date eventmodifytime;

    private String eventdetails;

    private String eventimg;

    private Integer eventtypeid;

    private Integer eventpublisherid;

    public Event(Integer eventid, String eventkind, String eventstate, Date eventstarttime, Date eventovertime, Date eventmodifytime, String eventdetails, String eventimg, Integer eventtypeid, Integer eventpublisherid) {
        this.eventid = eventid;
        this.eventkind = eventkind;
        this.eventstate = eventstate;
        this.eventstarttime = eventstarttime;
        this.eventovertime = eventovertime;
        this.eventmodifytime = eventmodifytime;
        this.eventdetails = eventdetails;
        this.eventimg = eventimg;
        this.eventtypeid = eventtypeid;
        this.eventpublisherid = eventpublisherid;
    }

    public Integer getEventid() {
        return eventid;
    }

    public void setEventid(Integer eventid) {
        this.eventid = eventid;
    }

    public String getEventkind() {
        return eventkind;
    }

    public void setEventkind(String eventkind) {
        this.eventkind = eventkind;
    }

    public String getEventstate() {
        return eventstate;
    }

    public void setEventstate(String eventstate) {
        this.eventstate = eventstate;
    }

    public Date getEventstarttime() {
        return eventstarttime;
    }

    public void setEventstarttime(Date eventstarttime) {
        this.eventstarttime = eventstarttime;
    }

    public Date getEventovertime() {
        return eventovertime;
    }

    public void setEventovertime(Date eventovertime) {
        this.eventovertime = eventovertime;
    }

    public Date getEventmodifytime() {
        return eventmodifytime;
    }

    public void setEventmodifytime(Date eventmodifytime) {
        this.eventmodifytime = eventmodifytime;
    }

    public String getEventdetails() {
        return eventdetails;
    }

    public void setEventdetails(String eventdetails) {
        this.eventdetails = eventdetails;
    }

    public String getEventimg() {
        return eventimg;
    }

    public void setEventimg(String eventimg) {
        this.eventimg = eventimg;
    }

    public Integer getEventtypeid() {
        return eventtypeid;
    }

    public void setEventtypeid(Integer eventtypeid) {
        this.eventtypeid = eventtypeid;
    }

    public Integer getEventpublisherid() {
        return eventpublisherid;
    }

    public void setEventpublisherid(Integer eventpublisherid) {
        this.eventpublisherid = eventpublisherid;
    }
}