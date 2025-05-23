/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaces;

/**
 *
 * @author pc
 */
public class Interfaces {

    public static void main(String[] args) {
        Mosquito m = new Mosquito("loqui", 2, 'm');
        m.despegar();
        
        Volador v = new Avion("6546", "dale",300);
        
        v.aterrizar();
        v.despegar();
        v.volar();
        
        
    }
}
