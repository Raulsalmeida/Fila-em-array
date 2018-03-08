import java.util.Scanner;

public class Main {

	public static void menuUI(){
        System.out.println("FILA EM ARRAY\n====================="
                + "\nEscolha uma opção:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover elemento\n"
                + "3 - Ver o início\n"
                + "4 - Ver o tamanho da fila\n"
                + "5 - Ver se a fila está vazia\n"
                + "0 - SAIR\n\n>>> ");
        
    }
	
	public static void main (String[] args) {
		
		int tamanho;
		int fc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da fila:");
		tamanho = sc.nextInt();
		System.out.println("Digite a taxa de crescimento:");
		fc = sc.nextInt();
		FilaArray filaArray = new FilaArray(tamanho, fc);
		
		int resposta = -1;
		while(resposta != 0) {
			menuUI();
			Scanner op = new Scanner(System.in);
			resposta = op.nextInt();
			switch(resposta) {
				case 1:
				
				break;
			}
		}
		
		
	}

	
}
