/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

/**
 *
 * @author onad
 */
public class InventoryManagementSystem {
    boolean isClosed;

    public void setIsClosed(boolean isClosed) {
        this.isClosed = isClosed;
    }

    boolean getIsClosed() {
        return this.isClosed;
    }
    public static void main(String[] args) {
        new LoginUI().show();
    }
}
