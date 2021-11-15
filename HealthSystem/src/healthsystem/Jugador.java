package healthsystem;

class Jugador{
  // Atributos
  private String nombre;
  private int vida = 100;
  private int danioGolpe;

  // Metodos
  public Jugador(String nombre, int danioGolpe){
    this.nombre = nombre;
    this.danioGolpe = danioGolpe;
  }

  public int ataque(){
    return(danioGolpe);
  }

  public void recibirDanio(int danio){
    //implementar verificación    
    if(danio > vida){
      this.vida = 0;
      System.out.println("La vida del Jugador a llegado cero, GAME OVER.");
    }else{
      vida = vida - danio;
    }    
  }

  public void recibirVida(int vidaExtra){
    int suma = this.vida + vidaExtra;
    if(suma <= 100 ){
      this.vida = suma;
    }else{
      this.vida = 100;
    }
  }

  //Get y Set
  public String getNombre(){ return nombre;}
  public int getVida(){ return vida;}
  public void setVida(int vida){ this.vida = vida;}
}