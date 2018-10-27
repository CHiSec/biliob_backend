package com.jannchie.biliob.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class VideoOnline {
    private ObjectId id;

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public class Data {
        private String number;
        private Date datetime;

        public String getNumber() {
            return number;
        }

        public Date getDatetime() {
            return datetime;
        }
    }
}