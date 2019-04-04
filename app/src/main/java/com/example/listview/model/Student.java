package com.example.listview.model;

public class Student {
    private String sName;
    private String sId;
    private String Country;

    public Student(String SName, String SId, String country) {
        sName = SName;
        sId = SId;
        Country = country;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + sId +
                ", studentName='" + sName + '\'' +
                ", countryName='" + Country + '\'' +
                '}';
    }
}
