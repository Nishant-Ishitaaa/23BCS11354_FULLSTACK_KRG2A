package com.taxinghelp.model;

public class Service {
    private int id;
    private String category;
    private String name;

    public Service() {}
    public Service(int id, String category, String name) {
        this.id = id;
        this.category = category;
        this.name = name;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public String getName() { return name; }
}
