
package aplication;
import entities.AnimaisResgatados;
import java.util.Scanner;
/*==============================================================================
//1 - Criação da classe principal
* ==============================================================================
*/
public class PaginaPrincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Objeto instanciado
        AnimaisResgatados animalResgatado = new AnimaisResgatados();

        animalResgatado.cadastrarAnimal();
        animalResgatado.exibirDadosCompleto();
      
        sc.close();
    }
    
}
