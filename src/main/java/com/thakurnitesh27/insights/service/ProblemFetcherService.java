package com.thakurnitesh27.insights.service;

import com.thakurnitesh27.insights.model.Problems;

import java.util.List;


public interface ProblemFetcherService {


    public List<Problems> fetchProblems(String... tags);
}
