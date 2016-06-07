package com.mahendra.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ka_all")
public class ka_all {
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int sn;
    private int day;
    private String t_max;
    private String t_min;
    private String h_am;
    private String h_pm;
    private String rainfall;
    private String sunshine;
    private String wind;
    private int year;

    public ka_all(int sn, int day, String t_max, String t_min, String h_am, String h_pm, String rainfall, String sunshine, String wind, int year) {
        this.sn = sn;
        this.day = day;
        this.t_max = t_max;
        this.t_min = t_min;
        this.h_am = h_am;
        this.h_pm = h_pm;
        this.rainfall = rainfall;
        this.sunshine = sunshine;
        this.wind = wind;
        this.year = year;
    }

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getT_max() {
        return t_max;
    }

    public void setT_max(String t_max) {
        this.t_max = t_max;
    }

    public String getT_min() {
        return t_min;
    }

    public void setT_min(String t_min) {
        this.t_min = t_min;
    }

    public String getH_am() {
        return h_am;
    }

    public void setH_am(String h_am) {
        this.h_am = h_am;
    }

    public String getH_pm() {
        return h_pm;
    }

    public void setH_pm(String h_pm) {
        this.h_pm = h_pm;
    }

    public String getRainfall() {
        return rainfall;
    }

    public void setRainfall(String rainfall) {
        this.rainfall = rainfall;
    }

    public String getSunshine() {
        return sunshine;
    }

    public void setSunshine(String sunshine) {
        this.sunshine = sunshine;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
