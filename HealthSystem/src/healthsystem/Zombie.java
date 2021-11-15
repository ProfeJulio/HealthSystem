package healthsystem;

public class Zombie{

  //Atributos
  private String nombre;
  private int vida = 50;
  private int danioRasgunio;
  
  //Metodos
  public Zombie(String nombre, int danioRasgunio){
    this.nombre = nombre;
    this.danioRasgunio = danioRasgunio;
  }
  public int ataque(){
      return (danioRasgunio); 
  }
    
  public void recibirDanio(int danio){
    //implementar verificación    
    if(danio > vida){
      this.vida = 0;
      System.out.println("La vida del Zombie a llegado cero.");
    }else{
      vida = vida - danio;
    }    
  }
  //get y set
  public int getVida(){ return vida;}
  public void setVida(int vida){ this.vida = vida;}
    
}