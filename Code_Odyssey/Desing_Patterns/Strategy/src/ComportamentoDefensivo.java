public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }

    @Override
    public void atacar() {
        System.out.println("Atacando com cautela!");
    }

    @Override
    public void defender() {
        System.out.println("Defesa reforçada!");
    }
}