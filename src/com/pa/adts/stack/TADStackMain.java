/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pa.adts.stack;

/**
 *
 * @author patricia.macedo
 */
public class TADStackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack stack1 = new StackLinked();

        try {
            stack1.push(1);
            stack1.push(2);
            stack1.push(3);
            stack1.push(4);
            stack1.push(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(stack1.isEmpty());
        try {
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
        } catch (EmptyStackException e1) {
            System.out.println(e1.getMessage());
        }
        System.out.println(stack1.size());

    }

}
