/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.ArrayList;

/**
 *
 * @author Andre
 */
class Materia {
    private String nombre;
    private ArrayList<NRC> opcionesNRC;
    public Materia(String nombre){
        this.nombre=nombre;
        this.opcionesNRC=new ArrayList<>();  
        
        }  
    public String getnombre(){
        return nombre;
    }
    public void agregarNRC(NRC nrc){
        opcionesNRC.add(nrc);
    }    
    public ArrayList<NRC>getopcionesNRC(){
        return opcionesNRC;
        
    }
}
    

