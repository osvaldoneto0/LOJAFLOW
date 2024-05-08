package lojaflow;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;

		while (true) {
		    System.out.println("*****************************************************");
		    System.out.println("                                                     ");
		    System.out.println("                       FLOW STORE                    ");
		    System.out.println("                                                     ");
		    System.out.println("*****************************************************");
		    System.out.println("                                                     ");
		    System.out.println("            1 - Criar Conta                          ");
		    System.out.println("            2 - Visualizar Catálogo de Produtos      ");
		    System.out.println("            3 - Adicionar Produto ao Carrinho        ");
		    System.out.println("            4 - Visualizar Carrinho de Compras       ");
		    System.out.println("            5 - Finalizar Compra                     ");
		    System.out.println("            6 - Visualizar Histórico de Pedidos      ");
		    System.out.println("            7 - Gerenciar Conta                      ");
		    System.out.println("            8 - Sair                                 ");
		    System.out.println("                                                     ");
		    System.out.println("*****************************************************");
		    System.out.println("Entre com a opção desejada:                          ");
		    System.out.println("                                                     ");

		    opcao = leia.nextInt();
		    

		    switch (opcao) {
		        case 1:
		            System.out.println("Criar Conta\n");
		            
		            break;
		        case 2:
		            System.out.println("Visualizar Catálogo de Produtos\n");
		           
		            break;
		        case 3:
		            System.out.println("Adicionar Produto ao Carrinho\n");
		            
		            break;
		        case 4:
		            System.out.println("Visualizar Carrinho de Compras\n");
		           
		            break;
		        case 5:
		            System.out.println("Finalizar Compra\n");
		            
		            break;
		        case 6:
		            System.out.println("Visualizar Histórico de Pedidos\n");
		            
		            break;
		        case 7:
		            System.out.println("Gerenciar Conta\n");
		            
		            break;
		        case 8:
		            System.out.println("Sair\n");
		            System.out.println("\nObrigado por utilizar o FLOW STORE Brazil. Até mais!");
		            
		            leia.close();
		            System.exit(0);
		            break;
		        default:
		            System.out.println("\nOpção Inválida!\n");
		            break;
		    }
		}

			}

			    

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Osvaldo Neto - osvaldonetoo011@gmail.com");
		System.out.println("github.com/osvaldoneto0");
		System.out.println("*********************************************************");
	}
}