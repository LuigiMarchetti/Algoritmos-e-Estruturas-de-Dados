package com.project;

import com.project.interfaces.Lista;

public class LinkedList implements Lista {
    protected NoLista primeiro;
    protected NoLista ultimo;
    protected int qtdeElementos;
    @Override
    public void inserir(int valor) {
        NoLista novo = new NoLista();
        novo.setInfo(valor);
        if(this.estaVazia()){
            this.primeiro = novo;
        }
        else {
            this.ultimo.setProx(novo);
        }
        qtdeElementos++;
    }

    @Override
    public void inserir(int valor, int pos) {
        NoLista novo = new NoLista();
        novo.setInfo(valor);
        if(pos == 0){
            this.primeiro = novo;
        }
        else {
            NoLista no = new NoLista();
            no = this.primeiro;
            int count = 0;
            while (no != null){
                if (count == pos){
                    novo.setProx(no.getProx());
                    no.setProx(novo);
                    break;
                }
                no = no.getProx();
            }
        }
        qtdeElementos++;
    }

    @Override
    public String exibir() {

        return null;
    }

    @Override
    public int buscar(int valor) {
        NoLista no = this.primeiro;
        while (no != null) {
            if (no.getInfo() == valor) {
                //
                break;
            }
            no = no.getProx();
        }
        return 0;
    }

    @Override
    public void retirar(int valor) {
        NoLista no = this.primeiro;
        if (this.primeiro.getInfo() == valor){
            this.primeiro = this.primeiro.getProx();
            qtdeElementos--;
            return;
        }
        while (no != null){
            if (no.getProx().getInfo() == valor){
                no.setProx(no.getProx().getProx());
                break;
            }
            no = no.getProx();
        }
        qtdeElementos--;
    }

    @Override
    public boolean estaVazia() {
        if (qtdeElementos == 0){
            return true;
        }
        return false;
    }

    @Override
    public void concatenar(ListaEstatica outra) {
        NoLista outraNo = this.primeiro;
        while (outraNo != null){
            this.inserir(outraNo.getInfo());
            outraNo = outraNo.getProx();
        }
    }

    @Override
    public LinkedList dividir() {
        int metade = this.getTamanho();
        this.qtdeElementos = metade;
        LinkedList nova = new LinkedList();

        NoLista p = this.primeiro;
        for (int i = 0; i < metade; i++){
            nova.inserir(p.getInfo());
            p = p.getProx();
        }
        this.primeiro = p;
        return nova;
    }

    @Override
    public LinkedList copiar() {
        LinkedList nova = new LinkedList();
        NoLista no = this.primeiro;
        while (no != null){
            nova.inserir(no.getInfo());
            no = no.getProx();
        }
        return nova;
    }

    @Override
    public int getTamanho() {
        NoLista no = this.primeiro;
        int count = 0;
        while (no != null){
            count++;
            no = no.getProx();
        }
        return count;
    }

    @Override
    public int pegar(int pos) {
        NoLista p = primeiro;
        int count = 0;
        while (p != null){
            if (count == pos){
                return p.getInfo();
            }
            p = p.getProx();
        }
        return -1;
    }
}