
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento normal = new ComportamentoNormal();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.atacar();
        robo.defender();

        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();
        robo.atacar();
        robo.defender();
    }
}
