public class Arbol {

    private double alturaFt;
    private double diametroTroncoInches;
    private TipoArbol tipoArbol;

    public Arbol(double alturaFt, double diametroTroncoInches, TipoArbol tipoArbol){
        this.alturaFt=alturaFt;
        this.diametroTroncoInches=diametroTroncoInches;
        this.tipoArbol=tipoArbol;
    }
    public void crecer(){
        this.alturaFt = this.alturaFt+10;
        this.diametroTroncoInches= this.diametroTroncoInches+1;
    }
    public void anunciarArbolgrande(){
        if(this.alturaFt>100){
            System.out.println("El "+this.tipoArbol+" Es un árbol alto!");

        }
    }


    public double getAlturaFt() {
        return alturaFt;
    }

    public void setAlturaFt(double alturaFt) {
        this.alturaFt = alturaFt;
    }

    public double getDiametroTroncoInches() {
        return diametroTroncoInches;
    }

    public void setDiametroTroncoInches(double diametroTroncoInches) {
        this.diametroTroncoInches = diametroTroncoInches;
    }
}
