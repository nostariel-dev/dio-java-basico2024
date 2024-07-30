package com.example.Singleton;

public class Singleton {

    // Instância privada e estática da própria classe
    private static Singleton instance;

    // Construtor privado para impedir a criação de novas instâncias
    private void singleton() {
        // Código de inicialização
    }

    // Método público estático para fornecer acesso à instância única
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Método de exemplo
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

    class SingletonTest {

    public static void main(String[] args) {
        // Tenta obter instâncias do Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Verifica se as instâncias são iguais
        System.out.println("singleton1 hashcode: " + singleton1.hashCode());
        System.out.println("singleton2 hashcode: " + singleton2.hashCode());

        // Usa o método do Singleton
        singleton1.showMessage();
        singleton2.showMessage();
    }
}
