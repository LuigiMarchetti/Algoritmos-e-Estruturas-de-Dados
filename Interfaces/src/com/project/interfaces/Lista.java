package com.project.interfaces;

import com.project.ListaEstatica;

public interface Lista {
    boolean estaVazia();
    int buscar(int valor);
    int getTamanho();
    int pegar(int pos);
    Lista dividir();
    Lista copiar();
    String exibir();
    void inserir(int valor);
    void inserir(int valor, int pos);
    void concatenar(ListaEstatica outra);
    void retirar(int valor);
}
