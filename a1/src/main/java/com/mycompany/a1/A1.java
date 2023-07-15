/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.a1;

/**
 *
 * @author onad
 */
public class A1 {

    String m_name;
    String m_psswrd;

    public A1(String name, String psswrd) {
        m_name = name;
        m_psswrd = psswrd;
    }

    boolean user_login_information(A1 stdnt) {
        if (stdnt.m_name.equals("ond") && stdnt.m_psswrd.equals("31")) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
