package com.example.android.moviedbtrainingapp.model;


import com.google.gson.annotations.Expose;

import java.io.Serializable;
import java.util.List;

public class MoviesResponse implements Serializable {

    @Expose
    String page;
    @Expose
    List<Movie> results;
    @Expose
    String total_results;
    @Expose
    String total_pages;

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public String getTotal_results() {
        return total_results;
    }

    public void setTotal_results(String total_results) {
        this.total_results = total_results;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }
}
