/**
 * Classe principal do aplicativo que demonstra o uso de diferentes implementações
 * do padrão de projeto Singleton.
 * 
 * O padrão Singleton garante que uma classe tenha apenas uma instância e fornece
 * um ponto global de acesso a ela. Este exemplo inclui três variações:
 * 
 * - SingletonEager: Implementação onde a instância é criada no momento da 
 *   inicialização da classe.
 * - SingletonLazy: Implementação onde a instância é criada de forma preguiçosa 
 *   (lazy), ou seja, apenas quando for solicitada pela primeira vez.
 * - SingletonLazyHolder: Implementação que utiliza o padrão "Initialization-on-demand
 *   holder idiom", garantindo thread safety e carregamento preguiçoso.
 * 
 * O método main demonstra como obter as instâncias de cada uma dessas implementações
 * e exibe suas referências no console.
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // SingletonEager
        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println("SingletonEager instance: " + singletonEager);

        // SingletonLazy
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println("SingletonLazy instance: " + singletonLazy);

        // SingletonLazyHolder
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("SingletonLazyHolder instance: " + singletonLazyHolder);
    }
}
