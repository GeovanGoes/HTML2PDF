
public class Mainha {
	public static void main(String[] args) {
		String meuTexto = "Meu texto super complexo cheio de coisa e mais coisas e ai tem esse cara aqui #startsub e esse outro cara aqui #endsub que eu quero substituir, e além disso quero recortar eles da String...bem agora vejamos como farei isso!";
		String other = "";
		if(meuTexto.contains("#startsub")){
			meuTexto = meuTexto.replace("#startsub", "<sub>");
		}
		else{
			meuTexto = "deu ruim...";
		}
		if(meuTexto.contains("#endsub")){
			meuTexto = meuTexto.replace("#endsub", "</sub>");
		}
		else{
			meuTexto = "deu ruim...";
		}
		
		String texto = "1234567890";
		other = "456";
		System.out.println(texto.indexOf(other));
		System.out.println(texto.indexOf(other)+other.length());
		
		System.out.println(texto.substring(texto.indexOf(other), texto.indexOf(other)+other.length()));
		
		int startOfNext = texto.indexOf(other)+other.length();
		
		System.out.println(texto.substring(startOfNext));
		
		//System.out.println(meuTexto);
	}
}
