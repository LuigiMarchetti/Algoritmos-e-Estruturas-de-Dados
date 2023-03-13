public class LinkedList implements Lista{
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
    }

    @Override
    public void redimensionar() {

    }

    @Override
    public String exibir() {
        return null;
    }

    @Override
    public int buscar(int valor) {
        return 0;
    }

    @Override
    public void retirar(int valor) {

    }

    @Override
    public boolean estaVazia() {
        return false;
    }

    @Override
    public void concatenar(ListaEstatica outra) {

    }

    @Override
    public ListaEstatica dividir() {
        return null;
    }

    @Override
    public ListaEstatica copiar() {
        return null;
    }

    @Override
    public int getTamanho() {
        return 0;
    }
}