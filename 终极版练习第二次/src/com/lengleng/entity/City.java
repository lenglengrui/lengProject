package com.lengleng.entity;

public class City {
    private String id;
    private String name;
    private String provinceid;

    public City(String id, String name, String provinceid) {
        this.id = id;
        this.name = name;
        this.provinceid = provinceid;
    }

    public City() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", provinceid='" + provinceid + '\'' +
                '}';
    }
}
