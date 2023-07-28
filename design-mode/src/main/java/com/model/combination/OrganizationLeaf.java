package com.model.combination;

/**
 * @Author Jason.Chen
 * @create 2023/6/28 17:28
 */
public class OrganizationLeaf extends Organization{

    public OrganizationLeaf(String name) {
        super(name);
    }

    @Override
    public Organization getChild(String name) {
        return name.equals(this.name) ? this : null;
    }

    @Override
    public void addOrganization(Organization organization) {
        System.out.println("无法添加组织架构！！");
    }
}
