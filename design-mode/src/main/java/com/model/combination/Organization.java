package com.model.combination;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 17:24
 */
public abstract class Organization {

    public String name;

    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Organization getChild(String name);

    public abstract void addOrganization(Organization organization);
}
