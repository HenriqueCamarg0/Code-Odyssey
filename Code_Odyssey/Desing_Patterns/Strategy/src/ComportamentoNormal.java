public class ComportamentoNormal implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }

    @Override
    public void atacar() {
        System.out.println("Ataque normal!");
    }

    @Override
    public void defender() {
        System.out.println("Defesa normal!");
    }
}