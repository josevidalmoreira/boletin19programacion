
package mlibreria;
import met.Libro;
import met.Metodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Mlibreria {


    public static void main(String[] args) {
       Integer x=0;
       Metodos m = new Metodos();
      
       ArrayList<Libro> listaLIB=new ArrayList<Libro>();
       
       for(int y=1;y>0;y++){
        x=Integer.parseInt(JOptionPane.showInputDialog("1= engadir libro , 2=vender libro , 3=buscar libro , 4=dar de baixa , 5=amosar ,6=acabar"));
       switch(x){
           case 1 :m.engadirLibros(listaLIB);
           break;
           case 2:m.venderLibros(listaLIB);
           break;
           case 3:m.buscarLibro(listaLIB);
           break;
           
           case 4 :m.darBaixa(listaLIB);
           break;
           case 5:m.amosarLibros(listaLIB);
           break;
           case 6:y=-1;
       }
       }
       m.amosarLibros(listaLIB);
    }
    
}
