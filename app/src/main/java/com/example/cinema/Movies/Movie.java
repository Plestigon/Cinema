package com.example.cinema.Movies;

import android.graphics.drawable.Drawable;

import com.example.cinema.MainActivity;

import java.util.ArrayList;

public class Movie {
    int id, duration;
    Drawable thumbnail;
    String title, description,category,trailerUrl, bookingUrl;
    float ticketPrice;
    ArrayList<String> comment;




    // Constructor
    public Movie(int id, Drawable thumbnail, String trailerUrlId, String bookingUrlId
            , String title, String description, float ticketPrice
            , ArrayList<String> comment, String category, int duration) {
        this.id = id;
        this.thumbnail = thumbnail;
        this.duration = duration;
        this.trailerUrl = trailerUrlId;
        this.bookingUrl = bookingUrlId;
        this.title = title;
        this.description = description;
        this.ticketPrice = ticketPrice;
        this.comment = comment;
        this.category = category;
    }

    // All setter and getter
    public int getId() {
        return id;
    }


    public String getTrailerUrlId() {
        return trailerUrl;
    }

    public String getBookingUrlId() {
        return bookingUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public ArrayList<String> getComment() {
        return comment;
    }

    public String getCategory() {
        return category;
    }
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTrailerUrlId(String trailerUrlId) {
        this.trailerUrl = trailerUrlId;
    }

    public void setBookingUrlId(String bookingUrlId) {
        this.bookingUrl = bookingUrlId;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setComment(ArrayList<String> comment) {
        this.comment = comment;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
