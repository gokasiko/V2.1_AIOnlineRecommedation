package com.seu.kse.bean;

public class UserPaperNoteKey {
    public UserPaperNoteKey(String uid , String pid){
        this.uid = uid;
        this.pid = pid;
    }

    public UserPaperNoteKey(){

    }

    private String uid;

    private String pid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}