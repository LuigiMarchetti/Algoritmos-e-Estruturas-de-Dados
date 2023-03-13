public class Principal {

    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();

        for (int i = 0; i < 10; i++) {
            lista.inserir(i);
        }

        ListaEstatica novaLista = lista.dividir();
        System.out.println(lista.getTamanho());     // Ok
        System.out.println(novaLista.getTamanho()); // Ok
        
        lista.concatenar(novaLista);
        System.out.println(lista.getTamanho());     // Ok

        System.out.println(lista.estaVazia());      // Ok

        lista.retirar(8);
        System.out.println(lista.exibir());         // Ok

    }

}