package com.ivan.polovyi.interpreterpattern;

//Abstract expression
public interface PermissionExpression {

	boolean interpret(User user); 
}
