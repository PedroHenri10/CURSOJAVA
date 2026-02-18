class Ordem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    char letra1 = Character.toLowerCase(sc.next().charAt(0));
    char letra2 = Character.toLowerCase(sc.next().charAt(0));

    if((int) letra1<(int)letra2){
      System.out.println("Primeira letra está em ordem alfabética");
  }else if((int) letra1==(int)letra2){
      System.out.println("Primeira letras iguais");
    }else{
      System.out.println("Primeira letra não está em ordem alfabética");
    }
  }
}
