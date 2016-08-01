/**
 * @(#)Repaso65.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/29
 */

public class Repaso65 implements Runnable {
        
    
    public Repaso65() {
    	Thread Hilo = new Thread(this);
    	Hilo.start();
    }//constructor
    
    public void run()
    {
    	
    	while(true)
    	{
    		System.out.println ("Soy un Hilo y una clase 65");
    		try{
    		
    		Thread.sleep(1000);
    		
    		}catch(InterruptedException e){
    			e.printStackTrace();
    		}//catch
    	}//while
    }//metodo run
    
    public static void main(String[] args) {
        // TODO code application logic here
        Repaso65 C = new Repaso65();
        
    }//main
}//calss
