
package entities;

/**=============================================================================
 * 2 - Criação da superclasse abstrata(modelo), seus atributos e construtor
 * =============================================================================
 */
public abstract class Animal {

    private int codigoCadastro;
    private String tipo;
    private String nomeCientifico;
    private double tamanho;
    private double peso;
    private String situacao;
    
    /**
     * @return the codigoCadastro
     */
    public int getCodigoCadastro() {
        return codigoCadastro;
    }

    /**
     * @param codigoCadastro the codigoCadastro to set
     */
    public void setCodigoCadastro(int codigoCadastro) {
        this.codigoCadastro = codigoCadastro;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the nomeCientifico
     */
    public String getNomeCientifico() {
        return nomeCientifico;
    }

    /**
     * @param nomeCientifico the nomeCientifico to set
     */
    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    /**
     * @return the tamanho
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
    public Animal(int codigoCadastro, 
            String tipo, 
            String nomeCientifico, 
            double tamanho, 
            double peso,  
            String situacao
    ){
        this.codigoCadastro = codigoCadastro;
        this.tipo = tipo;
        this.nomeCientifico = nomeCientifico;
        this.tamanho = tamanho;
        this.peso = peso;
        this.situacao = situacao;
        
    }
}
