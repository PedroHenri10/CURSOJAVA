class Media{
	public static void main(String[] args){
		String aluno = "Cleiton Rasta!";
		float nota1 = 7.5f;
		float nota2 = 3.75f;
		float nota3 = 8.25f;
		float nota4 = 9.15f;
		
		float media = (nota1 + nota2+ nota3 + nota4)/4;
		
		System.out.println("Aluno: " + aluno);
		System.out.printf("media: %.2f", media);
	}
}