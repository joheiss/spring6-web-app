package com.jovisco.spring6webapp.domain;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Activity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant time;
    private String title;
    private double distance;
    private String distanceUoM;
    private int duration;
    private String durationUoM;
    private double weight;
    private String weightUoM;
    
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private ActivityUser activityUser;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Instant getTime() {
        return time;
    }
    public void setTime(Instant time) {
        this.time = time;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public String getDistanceUoM() {
        return distanceUoM;
    }
    public void setDistanceUoM(String distanceUoM) {
        this.distanceUoM = distanceUoM;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDurationUoM() {
        return durationUoM;
    }
    public void setDurationUoM(String durationUoM) {
        this.durationUoM = durationUoM;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getWeightUoM() {
        return weightUoM;
    }
    public void setWeightUoM(String weightUoM) {
        this.weightUoM = weightUoM;
    }
    public ActivityUser getActivityUser() {
        return activityUser;
    }
    public void setActivityUser(ActivityUser user) {
        this.activityUser = user;
    }

    
    @Override
    public String toString() {
        return "Activity [id=" + id + ", time=" + time + ", title=" + title + ", user=" + activityUser + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Activity other = (Activity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    
}
