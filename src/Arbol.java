public class Arbol {

    double alturaFt;
    double diametroTroncoInches;
    TipoArbol tipoArbol;

    Arbol(double alturaFt, double diametroTroncoInches, TipoArbol tipoArbol){
        this.alturaFt=alturaFt;
        this.diametroTroncoInches=diametroTroncoInches;
        this.tipoArbol=tipoArbol;
    }
    void crecer(){
        this.alturaFt = this.alturaFt+10;
        this.diametroTroncoInches= this.diametroTroncoInches+1;
    }
    void anunciarArbol(){
        if(this.alturaFt>100){
            System.out.println("El "+this.tipoArbol+" Es un árbol alto!");

        }
    }
}
