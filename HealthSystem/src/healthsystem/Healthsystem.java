package healthsystem;

class Healthsystem {

  public static void main(String[] args) {
    Jugador Jprincipal = new Jugador("Heroe", 15);
    Zombie zombito = new Zombie("Zombito", 500);
    Botiquin MiBotiquin = new Botiquin(15);

    System.out.println("Sistema de Salud (Healthsystem)\n");

    Jprincipal.recibirVida(MiBotiquin.curarVida());
    System.out.println(">> La vida del Jugador es "+Jprincipal.getVida()+"\n");

    System.out.println("\n\nAQUI ESTOY!!!\n\n");

    Jprincipal.recibirDanio( zombito.ataque() );
    System.out.println(">> El Zombie ataca a Jugador Principal. Jugador Principal tiene "+Jprincipal.getVida()+" de vida");

    zombito.recibirDanio( Jprincipal.ataque() );
    System.out.println(">> El Jugador Principal ataca a zombito. Zombito tiene "+zombito.getVida()+" de vida");

    Jprincipal.recibirVida( MiBotiquin.curarVida() );
    System.out.println(">> El Jugador Principal tiene "+ Jprincipal.getVida() +" de vida");

    Jprincipal.recibirVida( MiBotiquin.curarVida() );
    System.out.println(">> El Jugador Principal tiene "+ Jprincipal.getVida() +" de vida");

  }
}
