package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };
	public void realizarTest(int numerotiradas){
		int dado[] = new int[numerotiradas];
		for(int i=0;i<numerotiradas;i++){
			dado[i]=lanzarDado();
			testAleatorio[dado[i]]++;
		}
		for(int i=1;i<=6;i++){
			System.out.println("Cara "+i+" Ha salido: "+ testAleatorio[i]+" veces");

		}

	}
	

	public Dado() {

	}

	public int[] getTestAleatorio() {
		return testAleatorio;
	}


	public void setTestAleatorio(int[] testAleatorio) {
		this.testAleatorio = testAleatorio;
	}


	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}

}
