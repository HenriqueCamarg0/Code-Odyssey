public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com força total!");
    }

    @Override
    public void defender() {
        System.out.println("Defesa agressiva!");
    }
}