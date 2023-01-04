/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);
    
        String nombre = obtenerNombre();
        System.out.printf("%s\n", nombre);
    
        System.out.printf("%s\n", obtenerNombre());
    }
    
    
    public static String obtenerCiudadMayuscula(String m){ //devuelve cadena
        String m2 = m.toUpperCase();
        return m2;
    }
    
    public static void obtenerMultiplicacion(int tabla, int limite){ //no devuelve nada, es void
        
    }
  /*  public void obtenerSuma (){ //(con void es procedimiento)      
    }
    public int obtenerSuma1 (){ //(con int es funcion que retorna entero )      
    }
    public double obtenerSuma2 (){ //(con double es funcion que retorna decimal, etc)      
    }
*/
    
    public static String obtenerNombre(){//devuelve cadena
        return "Luis";
    }
    
    
}
