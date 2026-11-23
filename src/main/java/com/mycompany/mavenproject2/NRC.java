/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Andre
 */
class NRC {
    private String codigo;
    private String dia;
    private int horainicio;
    private int horafin;
    
    public NRC(String codigo,String dia,int horainicio,int horafin){
      this.codigo = codigo;
      this.dia=dia;
      this.horainicio= horainicio;
      this.horafin=horafin;  
      }
    public String getcodigo(){
        return codigo;
    }
    public String getdia(){
        return dia;
    }
    public int gethorainicio(){
        return horainicio;
    }
    public int gethorafin(){
        return horafin;
    }
    public boolean seCruza(NRC otro){
        return this.dia.equals(otro.dia)
                && this.horainicio<otro.horafin
                && otro.horainicio<this.horafin;
    }
    
    }

