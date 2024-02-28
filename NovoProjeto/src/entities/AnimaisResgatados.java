package entities;


public class AnimaisResgatados extends Animal{
    public AnimaisResgatados(int codigoCadastro, String tipo,String nomeCientifico,double tamanho,double peso,String situacao){
        super(codigoCadastro, tipo,nomeCientifico,tamanho, peso, situacao);
    }
    private String codigoEtiqueta;
    /**
     * @return the codigoEtiqueta
     */
    public String getCodigoEtiqueta() {
        return codigoEtiqueta;
    }
    public void setCodigoEtiqueta(String codigoEtiqueta) {
        this.codigoEtiqueta = codigoEtiqueta;
    }
    
}
    
    

