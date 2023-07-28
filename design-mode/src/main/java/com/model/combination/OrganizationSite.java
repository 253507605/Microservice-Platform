package com.model.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 17:26
 */
public class OrganizationSite extends Organization {

    private List<Organization> organizations;


    public OrganizationSite(String name) {
        super(name);
        organizations = new ArrayList<>();
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    @Override
    public Organization getChild(String name) {
        for (Organization organization : organizations) {
            Organization child = organization.getChild(name);
            if(child != null){
                return child;
            }
        }
        return null;
    }

    @Override
    public void addOrganization(Organization organization) {
        organizations.add(organization);
    }
}
