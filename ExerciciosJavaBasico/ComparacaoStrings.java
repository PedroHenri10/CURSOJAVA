class ComparacaoStrings{
	public static void main(String[] args){
		String texto1 = "Vasco";
		String texto2 = "Vaso";
		String texto3 = "Chuva";
		String texto4 = "Chuva";
		
		if(texto1.equals(texto2)){
			System.out.println(texto1+ " e " + texto2 +" São iguais!");
		}else{
			System.out.println(texto1+ " e " + texto2 +" São diferentes!");
		}
		
		if(texto3.equals(texto4)){
			System.out.println(texto3+ " e " + texto4 +" São iguais!");
		}else{
			System.out.println(texto3+ " e " + texto4 +" São diferentes!");
		}
	}
}