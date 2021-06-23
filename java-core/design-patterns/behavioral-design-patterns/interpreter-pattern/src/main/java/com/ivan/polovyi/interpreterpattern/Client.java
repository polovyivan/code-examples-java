package com.ivan.polovyi.interpreterpattern;

public class Client {

    public static void main(String[] args) {
        Report report = new Report("Cash Flow Report", "NOT ADMIN");
        //Report report = new Report("Cash Flow Report", "ADMIN");
        ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        PermissionExpression expression = expressionBuilder.build(report);
        System.out.println("expression = " + expression);
        User user = new User("IVAN", "USER", "ADMIN");
        expression.interpret(user);
    }

}
