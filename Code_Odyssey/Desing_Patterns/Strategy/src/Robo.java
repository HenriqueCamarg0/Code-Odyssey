public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

    public void atacar(){
        comportamento.atacar();
    }

    public void defender(){
        comportamento.defender();
    }

}
