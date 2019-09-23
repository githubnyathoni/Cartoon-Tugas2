package com.example.cartoon.ui.home;

public class Model {
    int image;
    String name, birth, job, about;

    public Model(int image, String name, String birth, String job, String about){
        this.image = image;
        this.name = name;
        this.birth = birth;
        this.job = job;
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
