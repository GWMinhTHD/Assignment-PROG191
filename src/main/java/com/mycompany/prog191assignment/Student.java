/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog191assignment;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String gender;
    private double math;
    private double lit;
    private double lang;
    private String imgFileName;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void setLit(double lit) {
        this.lit = lit;
    }

    public void setLang(double lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getMath() {
        return math;
    }

    public double getLit() {
        return lit;
    }

    public double getLang() {
        return lang;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public Student() {
    }

    public Student(String name, String gender, double math, double lit, double lang, String imgFileName) {
        this.name = name;
        this.gender = gender;
        this.math = math;
        this.lit = lit;
        this.lang = lang;
        this.imgFileName = imgFileName;
    }

    public Student(String name, String gender, double math, double lit, double lang) {
        this.name = name;
        this.gender = gender;
        this.math = math;
        this.lit = lit;
        this.lang = lang;
    }
    
    public double gpa(){
        return (math + lit + lang)/3;
    }
}
