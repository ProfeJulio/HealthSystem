package healthsystem;

public class Botiquin{

    //Atributos
    private int montoPuntosDeVida;
    private boolean estaUsado;
    
    //metodos
    public Botiquin(int montovida){
      this.montoPuntosDeVida = montovida;
      this.estaUsado = false;
    }

    public int curarVida(){
      if( this.estaUsado == false){
        this.estaUsado = true;
        return(montoPuntosDeVida);
      }else{
        System.out.println("¡¡Botiquín ya usado.!!");
        return(0);
      }
        
    }

    
      
}