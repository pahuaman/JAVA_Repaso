/**
 * @(#)Hilo1.java
 *
 *
 * @author Garfia José
 * @version 1.00 2016/7/29
 */


public class Hilo1 extends Thread{
    Jugador Player;
    
    public Hilo1(Jugador PassPlayer) {
    	Player = PassPlayer;
    	start();
    }//constructor
    
    public void run()
    {
    	Player.Recibir_Golpe(12);
    }//metodo run
    
}//class hilo1

//aqui se imprime el estado del jugador
class Hilo2 extends Thread{
	Jugador Player;
	
	public Hilo2(Jugador PassPlayer)
	{
		Player = PassPlayer;
		start();
	}//constrcutor
	
	public void run()
	{
		if(Player.Esta_Muerto()) System.out.println ("El jugador esta muerto ");
		else System.out.println ("El jugador esta vivo ");
	}//metodo run
	
}//class hilo2


