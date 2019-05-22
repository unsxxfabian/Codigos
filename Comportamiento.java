package ejemplos;

import jade.core.Agent;
import jade.core.behaviours.*;
import java.util.Scanner;
public class Comportamiento extends Agent {
    int a,b;
    
    protected void setup(){
        Scanner f=new Scanner(System.in);
        System.out.println("INGRESE NUMERO 1");
        a=f.nextInt();
        System.out.println("INGRESE NUMERO 2");
        b=f.nextInt();
        System.out.println("numero1: "+a+" numero2: "+b);
        addBehaviour(new MiComportamiento());
    }
    public class MiComportamiento extends Behaviour{
        public void action(){
            
            System.out.println("Soy comportamiento del Agente1 para sumar");
            System.out.println("suma: "+(a+b)+" ");
            addBehaviour(new MiComportamiento2());
        }
        public boolean done(){
            return true;
        }
    }
    private class MiComportamiento2 extends Behaviour{
        public void action(){
	    System.out.println("Soy comportamiento del Agente2 para resta");
            
            System.out.println("restar: "+(a-b));
            System.out.println("Nombre: "+getLocalName());
            addBehaviour(new MiComportamiento3());
	}
	public boolean done(){
 	    return true;
	}
    }
    private class MiComportamiento3 extends Behaviour{
        public void action(){
	    System.out.println("Soy comportamiento del Agente3 para multuplicar");
            System.out.println("multiplicacion: "+(a*b));
	    addBehaviour(new MiComportamiento4());
	}
	public boolean done(){
 	    return true;
	}
    }
    private class MiComportamiento4 extends Behaviour{
        public void action(){
	    System.out.println("Soy comportamiento del Agente4 para dividir");
            System.out.println("dividir: "+(a/b));
	}
	public boolean done(){
 	    return true;
	}
    }
}