public class Main {
    public static void main(String[] args) {

    Arbol miAraucaria = new Arbol(120,15,TipoArbol.ARAUCARIA);

    Arbol miCerezo = new Arbol(30,8,TipoArbol.CEREZO);

        System.out.println(miAraucaria.getAlturaFt());
        System.out.println(miCerezo.getAlturaFt());
        miAraucaria.anunciarArbolgrande();
        miCerezo.anunciarArbolgrande();

    }
}