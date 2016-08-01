/**
 * @(#)Jugador.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/29
 */

public class Jugador {
       //atributos
       int Vida;
       int Curacion; 
    
    public Jugador() {
    	Vida     = 10;
    	Curacion = 5;
    	
    }//constrcutor
    
    synchronized void Recibir_Golpe(int Cantidad)
    {
    	Vida -= Cantidad;
    	
    	try{
    	Thread.sleep(5);
    	}catch(InterruptedException e){
    		e.printStackTrace();
    	}//catch
    	
    	Vida += Curacion;
    	
    }//metodo recibir golpe
    
    synchronized boolean Esta_Muerto()
    {
    	return (Vida<=0);
    }//metodo esta muerto
   
    public static void main(String[] args) {
       Jugador player1 = new Jugador();
       
       Hilo1 H = new Hilo1(player1);
       Hilo2 I = new Hilo2(player1);
       
    }//main
}//class
