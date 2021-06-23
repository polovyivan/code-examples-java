package com.ivan.polovyi.interpreterpattern;

//Terminal expression
public class Permission implements PermissionExpression {

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    private String permission;

    @Override
    public boolean interpret(User user) {
        return  user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permission='" + permission + '\'' +
                '}';
    }
}
