package com.design.behavioralModel.status;

public abstract class CourseVideoState {

    protected  CourseVideoContext courseVideoContext;


    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();  //播放

    public abstract void speed();  //快进

    public abstract void pause();  //暂停

    public abstract void stop();  //停止

}
