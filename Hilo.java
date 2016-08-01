/**
 * @(#)Hilo.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/28
 * Repaso sobre hilos o Thread en JAVA */


public class Hilo {
        
    public Hilo() {
    	
    }//constructor
    
    
    public static void main(String[] args) {
        MyHilo X = new MyHilo();
        
        while(true)
        {
        	System.out.println ("Soy una funcion principal ");
        	//hacer que espere
        	try{
        		Thread.sleep(2000);
        	}catch(InterruptedException e){
        		e.printStackTrace();
        	}//try-catch
         }//while
    }//main
}//class

/* Un hilo  tiene algunos metodos especiales
 * start: iniciar el hilo y va a llamar al metodo run
 * run: lo que queremos que haga el Hilo
 * destroy, entre otros
 **/

class MyHilo extends Thread{
	
	MyHilo() {
		start();
	}//constructor
	
	public void run()
	{
		//codigo para que haga nuestro Hilo
		while(true)
        {
        	System.out.println ("Soy una funcion Hilo ");
        	//hacer que espere
        	try{
        		Thread.sleep(4000);
        	}catch(InterruptedException e){
        		e.printStackTrace();
        	}//try-catch
         }//while
		
	}//metodo run
}//class-MyHilo
























