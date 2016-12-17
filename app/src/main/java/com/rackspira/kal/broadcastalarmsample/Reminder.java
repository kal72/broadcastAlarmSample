package com.rackspira.kal.broadcastalarmsample;

import java.util.Date;

/**
 * Created by kristiawan on 12/17/16.
 */

public class Reminder {

    private int id;
    private String nama;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
