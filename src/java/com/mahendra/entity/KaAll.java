/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahendra.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mkpan
 */
@Entity
@Table(name = "ka_all", catalog = "weather", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KaAll.findAll", query = "SELECT k FROM KaAll k"),
    @NamedQuery(name = "KaAll.findBySn", query = "SELECT k FROM KaAll k WHERE k.sn = :sn"),
    @NamedQuery(name = "KaAll.findByDay", query = "SELECT k FROM KaAll k WHERE k.day = :day"),
    @NamedQuery(name = "KaAll.findByTMax", query = "SELECT k FROM KaAll k WHERE k.tMax = :tMax"),
    @NamedQuery(name = "KaAll.findByTMin", query = "SELECT k FROM KaAll k WHERE k.tMin = :tMin"),
    @NamedQuery(name = "KaAll.findByHAm", query = "SELECT k FROM KaAll k WHERE k.hAm = :hAm"),
    @NamedQuery(name = "KaAll.findByHPm", query = "SELECT k FROM KaAll k WHERE k.hPm = :hPm"),
    @NamedQuery(name = "KaAll.findByRainfall", query = "SELECT k FROM KaAll k WHERE k.rainfall = :rainfall"),
    @NamedQuery(name = "KaAll.findBySunshine", query = "SELECT k FROM KaAll k WHERE k.sunshine = :sunshine"),
    @NamedQuery(name = "KaAll.findByWind", query = "SELECT k FROM KaAll k WHERE k.wind = :wind"),
    @NamedQuery(name = "KaAll.findByYear", query = "SELECT k FROM KaAll k WHERE k.year = :year")})
public class KaAll implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sn")
    private Integer sn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "day")
    private int day;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_max")
    private float tMax;
    @Basic(optional = false)
    @NotNull
    @Column(name = "t_min")
    private float tMin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_am")
    private float hAm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "h_pm")
    private float hPm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "rainfall")
    private float rainfall;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sunshine")
    private float sunshine;
    @Basic(optional = false)
    @NotNull
    @Column(name = "wind")
    private float wind;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;

    public KaAll() {
    }

    public KaAll(Integer sn) {
        this.sn = sn;
    }

    public KaAll(Integer sn, int day, float tMax, float tMin, float hAm, float hPm, float rainfall, float sunshine, float wind, int year) {
        this.sn = sn;
        this.day = day;
        this.tMax = tMax;
        this.tMin = tMin;
        this.hAm = hAm;
        this.hPm = hPm;
        this.rainfall = rainfall;
        this.sunshine = sunshine;
        this.wind = wind;
        this.year = year;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public float getTMax() {
        return tMax;
    }

    public void setTMax(float tMax) {
        this.tMax = tMax;
    }

    public float getTMin() {
        return tMin;
    }

    public void setTMin(float tMin) {
        this.tMin = tMin;
    }

    public float getHAm() {
        return hAm;
    }

    public void setHAm(float hAm) {
        this.hAm = hAm;
    }

    public float getHPm() {
        return hPm;
    }

    public void setHPm(float hPm) {
        this.hPm = hPm;
    }

    public float getRainfall() {
        return rainfall;
    }

    public void setRainfall(float rainfall) {
        this.rainfall = rainfall;
    }

    public float getSunshine() {
        return sunshine;
    }

    public void setSunshine(float sunshine) {
        this.sunshine = sunshine;
    }

    public float getWind() {
        return wind;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sn != null ? sn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KaAll)) {
            return false;
        }
        KaAll other = (KaAll) object;
        if ((this.sn == null && other.sn != null) || (this.sn != null && !this.sn.equals(other.sn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mahendra.entity.KaAll[ sn=" + sn + " ]";
    }

    public int getMark() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
