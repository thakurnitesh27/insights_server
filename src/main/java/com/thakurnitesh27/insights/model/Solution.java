package com.thakurnitesh27.insights.model;

public class Solution {

    private final String id;
    //the link to problem for which this solution exists.
    private final Problems problems;

    private String content;

    public Solution(String id,Problems problems) {
        this.id=id;
        this.problems = problems;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
