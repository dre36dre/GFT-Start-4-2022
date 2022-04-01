package Vetores;

import java.util.Scanner;

public class Vetor {

	int N;
	private int par;
	private int impar;
	Scanner entrada=new Scanner(System.in);

	int[]  vetor=new int[N];

	public Vetor() {
		super();
	}

	public Vetor(int n, Scanner entrada, int[] vetor) {
		super();
		N = n;
		this.entrada = entrada;
		this.vetor = vetor;
	}



	public int getPar() {
		return par;
	}

	public int getImpar() {
		return impar;
	}

	public void setPar(int par) {
		this.par = par;
	}

	public void setImpar(int impar) {
		this.impar = impar;
	}

	public void criacaoVetor() {
		System.out.println("Digite o numeros de posições:");
		N=entrada.nextInt();

		for(int i=0;i<N;i++) {
			 for(int j = i+1; j <N;j++){
			System.out.println("Digite os valores:");
			
			vetor[i]=entrada.nextInt();
			
			if (vetor[i] == vetor[i-1])                   
				System.out.println("O elemento" +vetor[j] + "se repete");
		}
			
			if(vetor[i] %2 ==0) {
			
				par=par++;
			}else {
				vetor[i]=impar;
			}
				impar+=1;
			}
		
		
		
			
			System.out.printf("Quantidades pares %d: "+par);
			System.out.printf("Numeros pares %d :",vetor[par]);
			System.out.printf("Quantidades impares %d: ",impar);
			System.out.printf("Numeros impares %d",vetor[impar]);
			
			System.out.println("Quantidade numeros repetidos %d",);
			System.out.println("Numeros repetidos %d:", );
	}
	


	}
