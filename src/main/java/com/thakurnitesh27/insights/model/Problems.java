package com.thakurnitesh27.insights.model;

import java.util.List;

public class Problems {

    private final String  id; //todo to be assigned automatically (hashing?) by memory based cache-Redis??
    private  final String name;
    private String description;
    private  String problem_statement;
    private List<String> external_links;
    private List<String> internal_links;
    private List<Solution> solutionList;
    private List<Tags> tags;


    public Problems(String id, String name, String problem_statement) {
        this.id = id;
        this.name = name;
        this.problem_statement = problem_statement;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProblem_statement() {
        return problem_statement;
    }

    public List<String> getExternal_links() {
        return external_links;
    }

    public void setExternal_links(List<String> external_links) {
        this.external_links = external_links;
    }

    public List<String> getInternal_links() {
        return internal_links;
    }

    public void setInternal_links(List<String> internal_links) {
        this.internal_links = internal_links;
    }

    public List<Solution> getSolutionList() {
        return solutionList;
    }

    public void setSolutionList(List<Solution> solutionList) {
        this.solutionList = solutionList;
    }

    public void setProblem_statement(String problem_statement) {
        this.problem_statement = problem_statement;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
}
