class ehDivisivel{
	public static void main(String[] args){
		int valor1 = 22;
		int valor2 = 2;
		int ehDivisivel = valor1/valor2;
		
		if(valor1 % valor2 == 0){
			System.out.println("sim, eh divisivel!");		
		}else{
			System.out.println("não eh divisivel!");		
		}
		
	}
}