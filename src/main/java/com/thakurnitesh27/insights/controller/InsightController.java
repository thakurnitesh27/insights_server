package com.thakurnitesh27.insights.controller;

import com.thakurnitesh27.insights.model.Problems;
import com.thakurnitesh27.insights.service.ProblemFetcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "insight",produces="application/json")
@CrossOrigin(origins = "*")
public class InsightController {

    @Autowired
    ProblemFetcherService problemFetcherService;



    @GetMapping("/problems")
    public Iterable<Problems> getProblems(){
      return   problemFetcherService.fetchProblems(null);
    }
}
