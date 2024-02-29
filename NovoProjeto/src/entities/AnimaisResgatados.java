/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Scanner;

/**
 * Quando é f
 * @author jpsco
 */
public class AnimaisResgatados extends Animal{
    Scanner sc = new Scanner(System.in);
    private String codigoChip;
    public String avisoSucesso = "Animal cadastrado com sucesso!";
    
    
    
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

    public String getApelido(){
        return apelido;
    }
    
    public void setApelido(String apelido){
        this.apelido = apelido;
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
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    /**
     * @return the tamanho
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
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

    /**
     * @return the codigoChip
     */
    public String getCodigoChip() {
        return codigoChip;
    }
    public void setCodigoChip(String codigoChip) {
        this.codigoChip = codigoChip;
    }
    
    public void cadastrarAnimal(){
        
        System.out.println("======================================");
        System.out.println("          FORMULÁRIO DO ANIMAL        ");
        System.out.println("======================================");
        
        System.out.print("Código do animal: ");
        codigoCadastro = sc.nextInt();
        sc.nextLine();

        System.out.print("Código do Chip: ");
        codigoChip = sc.nextLine();
        
        System.out.print("Tipo: ");
        tipo = sc.nextLine();
        
        System.out.print("Apelido: ");
        apelido = sc.nextLine();
        
        System.out.print("Nome científico: ");
        nomeCientifico = sc.nextLine();
        
        System.out.print("Cor: ");
        cor = sc.nextLine();
        
        System.out.print("Altura: ");
        altura = sc.nextDouble();
        
        System.out.print("Peso: ");
        peso = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Situação: ");
        situacao = sc.nextLine();
        
        System.out.println("\n\n**  " + avisoSucesso.toUpperCase() +"  ** \n\n");
       
        
    }
    
    public void exibirDadosCompleto(){
        System.out.println("======================================");
        System.out.println("            FICHA DO ANIMAL           ");
        System.out.println("======================================");
        System.out.println("Inscrição: " + getCodigoCadastro());
        System.out.println("Chip Nº: "+getCodigoChip());
        System.out.println("Tipo: " +getTipo());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Nome Científico: "+getNomeCientifico());
        System.out.println("Cor: "+getCor());
        System.out.println("Tamanho: "+getAltura() + " cm");
        System.out.println("Peso: "+getPeso() + " Kg");
        System.out.println("Situação: "+getSituacao());
    }
    
    
    

}
    
    

