package com.project.interfaces;

import com.project.ListaEstatica;

public interface Lista {
    void inserir(int valor);

    void redimensionar();

    String exibir();

    int buscar(int valor);

    void retirar(int valor);

    boolean estaVazia();

    void concatenar(ListaEstatica outra);

    ListaEstatica dividir();

    ListaEstatica copiar();

    int getTamanho();
}
