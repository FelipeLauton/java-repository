package POO;

public class MetodoSobreCarga {
	public void testaMetodosSobreCarregados() {
		System.out.printf("Sal�rio em n�mero inteiro: %d\n",salario(1000));
		System.out.printf("Sal�rio em n�mero inteiro: %f\n",salario(7.500));
	}
	public int salario(int valorInt) {
		System.out.printf("Sal�rio em n�mero argumentointeiro: %d\n",valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("Sal�rio em n�mero argumentointeiro: %f	\n",valorDouble);
		return valorDouble * valorDouble;
	}
}
