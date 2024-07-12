package Projeto;

public class Main {
    public static void main(String[] args) {
        // Testando TabelaHash
        TabelaHash<String, String> tabelaHash = new TabelaHash<>(10);
        tabelaHash.inserir("1", "um");
        tabelaHash.inserir("2", "dois");
        tabelaHash.inserir("3", "três");

        System.out.println(tabelaHash.buscar("1")); // Output: um
        System.out.println(tabelaHash.buscar("2")); // Output: dois
        System.out.println(tabelaHash.buscar("3")); // Output: três
        tabelaHash.remover("2");
        System.out.println(tabelaHash.buscar("2")); // Output: null

        // Testando CacheLRU
        CacheLRU<String, String> cacheLRU = new CacheLRU<>(3);
        cacheLRU.inserir("1", "um");
        cacheLRU.inserir("2", "dois");
        cacheLRU.inserir("3", "três");
        System.out.println(cacheLRU.buscar("1")); // Output: um
        cacheLRU.inserir("4", "quatro");
        System.out.println(cacheLRU.buscar("2")); // Output: null (foi removido pela política LRU)
        cacheLRU.inserir("5", "cinco");
        System.out.println(cacheLRU.buscar("3")); // Output: null (foi removido pela política LRU)
        System.out.println(cacheLRU.buscar("4")); // Output: quatro
        System.out.println(cacheLRU.buscar("5")); // Output: cinco
    }
}

