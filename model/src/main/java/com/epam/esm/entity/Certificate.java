package com.epam.esm.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Certificate {

    private int id;
    private String name;
    private int price;
    private int duration;
    private String createDate;
    private String lastUpdateDate;

    public Certificate(int id, String name, int price, int duration, String createDate, String lastUpdateDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
    }


}
