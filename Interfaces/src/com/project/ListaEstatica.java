package com.project;

import com.project.interfaces.Lista;

public class ListaEstatica implements Lista {

    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        this.info = new int[10];
        this.tamanho = 0;
    }

    @Override
    public void inserir(int valor) {
        if (this.tamanho == this.info.length) {
            this.redimensionar();
        }
        this.info[this.tamanho] = valor;
        this.tamanho++;
    }

    public void inserir(int valor, int pos) {
        if (pos < 0 || pos > getTamanho()){
            throw new IndexOutOfBoundsException();
        }
        for (int i = pos; i < this.tamanho; i--) {
            try {
                this.info[i] = this.info[i - 1];
            } catch (ArrayIndexOutOfBoundsException e) {}
        }
        info[pos] = valor;
        tamanho++;
    }


    @Override
    public void redimensionar() {
        int[] vetorAntigo = this.info;
        this.info = new int[vetorAntigo.length * 2];
        for (int i = 0; i < vetorAntigo.length; i++) {
            this.info[i] = vetorAntigo[i];
        }
    }

    @Override
    public String exibir() {
        String view = "";
        for (int i = 0; i < this.tamanho; i++) {
            int item = this.info[i];
            view += item + " ";
        }
        return view;
    }

    @Override
    public int buscar(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if (valor == this.info[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void retirar(int valor) {
        int index = this.buscar(valor);
        for (int i = index; i < this.tamanho; i++) {
            try {
                this.info[i] = this.info[i + 1];
            } catch (ArrayIndexOutOfBoundsException e) {}
        }
        this.tamanho--;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public void concatenar(ListaEstatica outra) {
        for (int i = 0; i < outra.tamanho; i++) {
            this.inserir(outra.info[i]);
        }
    }

    @Override
    public ListaEstatica dividir() {
        int metade = this.tamanho / 2;
        ListaEstatica outra = new ListaEstatica();

        while (this.tamanho > metade) {
            int valor = this.info[metade];
            outra.inserir(valor);
            this.retirar(valor);
        }

        return outra;
    }

    @Override
    public ListaEstatica copiar() {
        ListaEstatica nova = new ListaEstatica();
        for (int valor : this.info) {
            nova.inserir(valor);
        }
        return nova;
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

}