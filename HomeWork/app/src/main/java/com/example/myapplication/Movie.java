package com.example.myapplication;

import java.util.List;

public class Movie {
    private String title;
    private double vote_average;
    private String overview;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getVoteAverage() { return vote_average; }
    public void setVoteAverage(double voteAverage) { this.vote_average = voteAverage; }

    public String getOverview() { return overview; }
    public void setOverview(String overview) { this.overview = overview; }
}

