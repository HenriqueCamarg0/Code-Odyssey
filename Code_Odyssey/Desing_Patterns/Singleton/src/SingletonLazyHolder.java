// Singleton Lazy Holder:
// Este é um padrão Singleton que utiliza uma classe estática interna para garantir que a instância
// seja criada apenas quando for realmente necessária (lazy initialization).
// A classe interna `instanceHolder` só será carregada na memória quando o método `getInstance` for chamado.
// Isso garante eficiência e thread safety sem a necessidade de sincronização explícita.

public class SingletonLazyHolder {

    private static class instanceHolder {
        public static final SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return instanceHolder.instance;
    }
}
