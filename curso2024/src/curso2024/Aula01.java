package curso2024;

public class Aula01 {

	public static void main(String[] args) {
String primeiroNome = "Ricardo";
String segundoNome = "Issa";
String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
System.out.println(nomeCompleto);
	}
	public static String nomeCompleto(String primeiroNome,String segundoNome) {
return "Resultado do metodo " + primeiroNome + (" ").concat(segundoNome);

}
}