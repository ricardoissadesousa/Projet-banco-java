package curso2024;

public class BancoTerminal {

	public static void main(String[] args) {
		double saldo = 25;
		double valorSolic = 18;
		
		if(saldo >= valorSolic) {
			saldo = saldo - valorSolic;		
			}else {
				System.out.println("Saldo insuficiente ! ");
			}
		System.out.println("Saldo apos a primeira operação:"+saldo);
	

	double saldo2 = 15;
	double valorSolic2 = 8;
	
	if(saldo2 >= valorSolic2) {
		saldo2 = saldo2 - valorSolic2;		
		}else {
			System.out.println("Saldo insuficiente ! ");
		}
	System.out.println("Saldo apos a segunda operação:"+saldo2);
	
	
	}
}
