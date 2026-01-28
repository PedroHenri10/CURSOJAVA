class TresSalas{
	public static void main(String[] args){
		int alunos = 47;
		int salas = 3;
		int sala1=0;
		int sala2=0;
		int sala3=0;
		
		System.out.println("total alunos: "+ alunos);
		distribuirRecursivo(alunos, sala1, sala2, sala3);
				
	}
	
	 static void distribuirRecursivo(int total, int s1, int s2, int s3) {
		
			if (total == 0) {
				System.out.println("sala 1: " + s1 + " alunos\n" +
								   "sala 2: " + s2 + " alunos\n" +
								   "sala 3: " + s3 + " alunos");
				return; 
			}
		
			if(total > 0){
				s1 += 1;
				total--;
			}
			
			if(total > 0){
				s2 += 1;
				total--;
			}
			
			if(total > 0){
				s3 += 1;
				total--;
			}
			distribuirRecursivo(total, s1, s2, s3);
		}
}