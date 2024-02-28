
package aplication;
import entities.AnimaisResgatados;
/*==============================================================================
//1 - Criação da classe principal
* ==============================================================================
*/
public class PaginaPrincipal {

    public static void main(String[] args) {
        //Objeto instanciado
        AnimaisResgatados animalResgatado = new AnimaisResgatados(12365,"Cachorro","fafa",6.6,3.6,"sfsdfs");
        
        //Chamando os valores só para teste
        System.out.println("Cadastro: " + animalResgatado.getCodigoCadastro());
        System.out.println("Etiqueta: " + animalResgatado.getCodigoEtiqueta());
        
    }
    
}
