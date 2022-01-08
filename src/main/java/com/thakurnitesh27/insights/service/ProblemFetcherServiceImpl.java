package com.thakurnitesh27.insights.service;


import com.thakurnitesh27.insights.model.Problems;
import com.thakurnitesh27.insights.model.Solution;
import com.thakurnitesh27.insights.model.Tags;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ProblemFetcherServiceImpl implements ProblemFetcherService{

    @Autowired
    private final CacheManager cacheManager;

    public ProblemFetcherServiceImpl(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @Override
    public List<Problems> fetchProblems(String... tags) {

        if (tags == null || (Objects.nonNull(tags) && tags.length == 0)) {
            return get();
        }
        else {

            Set<Problems> matchingProblems=new HashSet<>();

                Arrays.stream(tags).forEach(t->{
                      Tags tag=  Tags.valueOf(t);

           Set<Problems> problemsSet= get().stream().filter(p->p.getTags().contains(tag)).collect(Collectors.toSet());
                matchingProblems.addAll(problemsSet);

                });

                return new ArrayList<>(matchingProblems);
        }


    }


    // todo Use redis cache to get all problems
    private List<Problems> get() {
        List<Problems> problems = new ArrayList<>();

        Problems p = new Problems("1", "First Missing Integer", "" +
                "Given an unsorted integer array, find the first missing positive integer.\n" +
                "\n" +
                "Example:\n" +
                "\n" +
                "Given [1,2,0] return 3,\n" +
                "\n" +
                "[3,4,-1,1] return 2,\n" +
                "\n" +
                "[-8, -7, -6] returns 1\n" +
                "\n" +
                "Your algorithm should run in O(n) time and use constant space.");

        List<String> externalLinks = new ArrayList<>();
        externalLinks.add("https://www.interviewbit.com/problems/first-missing-integer/");
        externalLinks.add("https://www.geeksforgeeks.org/find-the-smallest-positive-number-missing-from-an-unsorted-array/");
        externalLinks.add("https://leetcode.com/problems/first-missing-positive/");

        p.setExternal_links(externalLinks);
        p.setTags(Arrays.asList(Tags.Array));

        Solution s = new Solution("1", p);
        s.setContent("rcbfdbgfbvbf");
        problems.add(p);

        return problems;
    }
}
