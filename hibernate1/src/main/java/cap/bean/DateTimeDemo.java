package cap.bean;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {
    private Integer id;
    private java.util.Date utilDate;
    private java.util.Date utilDate_timestamp;
    private java.util.Date utilDate_date;
    private java.util.Date utilDate_time;
    private java.sql.Date sqlDate;
    private java.sql.Time sqlTime;
    private java.sql.Timestamp sqlTimestamp;
    private java.util.Calendar utilCalendar;
    private java.util.Calendar utilCalendar_calendar;
    private java.util.Calendar utilCalendar_calendar_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getUtilDate() {
        return utilDate;
    }

    public void setUtilDate(Date utilDate) {
        this.utilDate = utilDate;
    }

    public Date getUtilDate_timestamp() {
        return utilDate_timestamp;
    }

    public void setUtilDate_timestamp(Date utilDate_timestamp) {
        this.utilDate_timestamp = utilDate_timestamp;
    }

    public Date getUtilDate_date() {
        return utilDate_date;
    }

    public void setUtilDate_date(Date utilDate_date) {
        this.utilDate_date = utilDate_date;
    }

    public Date getUtilDate_time() {
        return utilDate_time;
    }

    public void setUtilDate_time(Date utilDate_time) {
        this.utilDate_time = utilDate_time;
    }

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Time getSqlTime() {
        return sqlTime;
    }

    public void setSqlTime(Time sqlTime) {
        this.sqlTime = sqlTime;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }

    public Calendar getUtilCalendar() {
        return utilCalendar;
    }

    public void setUtilCalendar(Calendar utilCalendar) {
        this.utilCalendar = utilCalendar;
    }

    public Calendar getUtilCalendar_calendar() {
        return utilCalendar_calendar;
    }

    public void setUtilCalendar_calendar(Calendar utilCalendar_calendar) {
        this.utilCalendar_calendar = utilCalendar_calendar;
    }

    public Calendar getUtilCalendar_calendar_date() {
        return utilCalendar_calendar_date;
    }

    public void setUtilCalendar_calendar_date(Calendar utilCalendar_calendar_date) {
        this.utilCalendar_calendar_date = utilCalendar_calendar_date;
    }
}
