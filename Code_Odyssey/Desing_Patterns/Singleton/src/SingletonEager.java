
    // Singleton Eager:
    // No padrão Singleton Eager, a instância é criada no momento em que a classe é carregada na memória.
    // Isso garante que a instância estará disponível imediatamente, mas pode desperdiçar recursos
    // se a instância nunca for utilizada.


public class SingletonEager {
    // SingletonEager 
    private static final SingletonEager instance = new SingletonEager();
    
    private SingletonEager() {
        super();
    }
    
    public static SingletonEager getInstance() {
        return instance;
    }
}
