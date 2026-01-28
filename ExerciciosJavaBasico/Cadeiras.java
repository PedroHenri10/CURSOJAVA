class Cadeiras{
	public static void main(String[] args){
		int alunos = 47;
		int cadeirasPorFileira = 6;
		
		int qtdFileiras = alunos/cadeirasPorFileira;
		
		if(alunos % cadeirasPorFileira != 0){
			qtdFileiras = qtdFileiras + 1;
		}
		
		System.out.println("precisa de " + qtdFileiras + " fileiras para preencher " + alunos + " alunos");
	}
}