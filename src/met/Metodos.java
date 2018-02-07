
package met;
import java.util.ArrayList;
import java.util.Iterator;
import mlibreria.Mlibreria;
import javax.swing.JOptionPane;


public class Metodos {
   
    public void engadirLibros(ArrayList<Libro>lis){
    Libro l = new Libro(JOptionPane.showInputDialog("titulo"),JOptionPane.showInputDialog("Autor"),JOptionPane.showInputDialog("IBSN"),Float.parseFloat(JOptionPane.showInputDialog("precio")),Integer.parseInt(JOptionPane.showInputDialog("UNIDADES")));
    lis.add(l);
    }
    
    public void venderLibros(ArrayList<Libro>lis){
      String s;
      s=JOptionPane.showInputDialog("libro a vender");
      for(Libro lib:lis){
          if(lib.getTitulo().equals(s)){
              lib.setUnidades(lib.getUnidades()-Integer.parseInt(JOptionPane.showInputDialog("candidad a vender")));
          }
      }  
    }
    
    public void amosarLibros(ArrayList<Libro>lis){
        Iterator it = lis.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
    
    public void darBaixa(ArrayList<Libro>lis){
        lis.remove(Integer.parseInt(JOptionPane.showInputDialog("posicion del elemento a borrar")));
    }
    
    public void buscarLibro(ArrayList<Libro>lis){
        String s;
      s=JOptionPane.showInputDialog("titulo del libro");
      for(Libro lib:lis){
          if(lib.getTitulo().equals(s)){
              System.out.print(lib);
          }
        }
    }

   
}
