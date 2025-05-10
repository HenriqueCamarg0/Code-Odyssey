

    // Singleton Lazy:
    // No padrão Singleton Lazy, a instância é criada apenas quando for solicitada pela primeira vez.
    // Isso pode ser feito com verificações de null e sincronização, mas pode ser menos eficiente
    // se não for implementado corretamente.

public class SingletonLazy {

    private static SingletonLazy instance;
    
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
