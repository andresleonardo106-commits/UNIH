/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.ArrayList;
import java.util.Scanner;

public class uniH{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Materia> materias =new ArrayList<>();
        int otraMateria=1;
        while(otraMateria==1){
        System.out.println("Ingrese el nombre de la materia:");
        String nombre= teclado.nextLine();
        while(nombre.equals("")){
            System.out.println("Error: debe ingresar un nombre valido");
            System.out.println("Ingrese el nombre de la Materia");
            nombre=teclado.nextLine(); 
    }   
        Materia materia= new Materia(nombre);
        materias.add(materia);
        System.out.println("¿Cuantos NRC tiene esta materia?");
        int cantidad=teclado.nextInt();
        
        while(cantidad<=0){
            System.out.println("Error: debe ingresarmuna cantidad mayor que 0");
            System.out.println("¿Cuantos NRC tiene esta materia?");
            cantidad= teclado.nextInt();     
        }   
        teclado.nextLine();
        for(int i=0; i<cantidad;i++){
        
          System.out.println("Ingrese el codigo del NRC:");
           String codigo=teclado.nextLine();
           while(codigo.equals("")){
               System.out.println("Error:debe ingresar un codigo valido:");
               System.out.println("Ingrese el codigo del NRC:");
               codigo=teclado.nextLine();
           }
          System.out.println("Ingrese el dia:");
           String dia =teclado.nextLine();
           while(dia.equals("")){
               System.out.println("Error: Ingrese un dia valido");
               System.out.println("Ingrese el dia:");
               dia=teclado.nextLine();
           }
          System.out.println("Ingrese la hora inicio(1-12):");
          int horaInicio=teclado.nextInt();
          System.out.println("Seleccione el Horario:");
          System.out.println("1. AM");
          System.out.println("2. PM");
          int periodoInicio=teclado.nextInt();
          while(horaInicio < 1 || horaInicio > 12){
            System.out.println("Error:Ingrese una hora entre 1 y 12:");
            horaInicio=teclado.nextInt();   
        }
          while(periodoInicio!=1 && periodoInicio!=2){
              System.out.println("Opcion no valida.Selecciona 1 para AM o 2 para PM");
              periodoInicio=teclado.nextInt();
          }
          System.out.println("Ingrese la hora de salida(1-12):");
          int horaFin=teclado.nextInt();
          while(horaFin < 1 || horaFin > 12){
              System.out.println("Error:Ingrese una hora entre 1 y 12:");
              horaFin=teclado.nextInt();
          }
          if(periodoInicio==1){
              System.out.println("Horario seleccionado: AM");
          }else{
              System.out.println("Horario seleccionado: PM");
          }
          if(periodoInicio==1 && horaInicio==12){
              horaInicio=0;
          }else if(periodoInicio==2 && horaInicio!=12){
              horaInicio=horaInicio+12;
          }
          System.out.println("Seleccione el horario de finalizacion");
          System.out.println("1 : AM");
          System.out.println("2 : PM");
          int periodofin=teclado.nextInt();
          while(periodofin!=1 && periodofin!=2){
              System.out.println("Opcion no valida: seleccione 1 para AM o 2 para PM");
              periodofin=teclado.nextInt();
          }
          if(periodofin==1){
              System.out.println("Horario seleccionado :AM");
          }else {
              System.out.println("Horario seleccionado: PM");  
        }
        if(periodofin==1 && horaFin==12){
            horaFin=0;       
        }else if(periodofin==2&& horaFin!=12) {
            horaFin=horaFin+12;           
        } 
           while(horaFin<horaInicio){
               System.out.println("Error: La hora de finalizacion no puede ser menor a la hora de inicio");
               System.out.println("Ingrese la hora de salida (1-12):");
               horaFin=teclado.nextInt();
               while(horaFin<1 || horaFin>12){
                   System.out.println("Error: Ingrese una hora entre 1 y 12:");
                   horaFin=teclado.nextInt();
               }
               System.out.println("Seleccione el Horario de Finalizacion:");
               System.out.println("1. AM");
               System.out.println("2. PM");
               periodofin=teclado.nextInt();
               while(periodofin!=1 && periodofin!=2){
                   System.out.println("Opcion no valida: Seleccione 1 para AM o 2 para PM");
                   periodofin=teclado.nextInt();
               }
               if(periodofin==1&& horaFin==12){
                   horaFin=0;
               }else if(periodofin==2 && horaFin!=12){
                   horaFin=horaFin+12;
               }
           }
           NRC nrc=new NRC(codigo,dia,horaInicio, horaFin);
           materia.agregarNRC(nrc); 
    }
        System.out.println("¿Desea registrar otra Materia?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        otraMateria=teclado.nextInt();
        while(otraMateria!=1 && otraMateria != 2){
            System.out.println("Opcion no valida : Seleccione 1 o 2");
            otraMateria=teclado.nextInt();
        }
        teclado.nextLine(); 
        System.out.println("Materia registrada:"+materia.getnombre());
        for(NRC nrc:materia.getopcionesNRC()){
            System.out.println("codigo:"+nrc.getcodigo());
            System.out.println("dia:"+nrc.getdia());
            System.out.println("Hora de inicio:"+  nrc.gethorainicio());
            System.out.println("Hora Fin:"+nrc.gethorafin());
        }
        System.out.println("¿Desea registrar otra Materia?");
        System.out.println("1. Si");
        System.out.println("2. No");
        }
        System.out.println("TODAS LAS MATERIAS");
        for(Materia m: materias){
            System.out.println("Materia:"+m.getnombre());
            for(NRC n :m.getopcionesNRC()){
                System.out.println("codigo:"+n.getcodigo());
                System.out.println("Dia:"+ n.getdia());
                System.out.println("Hora Inicio:"+ n.gethorainicio());
                System.out.println("Hora Fin:"+ n.gethorafin());
            }
        }
        ArrayList<NRC> horario=new ArrayList<>();
        int TotalHorario=generarHorario(materias, horario,0);
        if(TotalHorario==0){
            System.out.println("No se encontraron Horarios disponibles.Las materias se cruzan");
        }  
    }
    public static boolean HorarioValido(ArrayList<NRC> horario, NRC nuevo){
        for( NRC n : horario){
            if(n.seCruza(nuevo)){
                return false;
            }
        }
        return true;
    }
    public static int generarHorario(ArrayList<Materia> materias , ArrayList<NRC> horario,int posicion){
        if (posicion==materias.size()){
            System.out.println("Horario encontrado");
            for(NRC n :horario){
                System.out.println(n.getcodigo()+"-"+n.getdia());
            }
            return 1;      
        }
        Materia materia=materias.get(posicion);
        int encontrado=0;
        for(NRC n: materia.getopcionesNRC()){
            if(HorarioValido(horario,n)){
                horario.add(n);
                encontrado+= generarHorario(materias , horario, posicion+1);
                
                horario.remove(horario.size()-1);            
    }
}
        return encontrado;
    }
}