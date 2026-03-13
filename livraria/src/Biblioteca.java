import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private List<ItemBiblioteca> itens;
    private double totalMultasArrecadadas;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public List<ItemBiblioteca> getItens() {
        return itens;
    }

    public double getTotalMultasArrecadadas() {
        return totalMultasArrecadadas;
    }

    public void cadastrarItem(ItemBiblioteca item){
        itens.add(item);
    }

    public void emprestarItem(String codigo){
        ItemBiblioteca itemBuscado = buscarItemPorCodigo(codigo);

        if(itemBuscado == null){
            System.out.println(codigo);
            System.out.println("Item não encontrado!");
        }else{
            if (itemBuscado.isEmprestado()) {
                System.out.println(codigo);
                System.out.println("Item informado já está emprestado");
            } else {
                itemBuscado.emprestar();
                System.out.println(codigo);
                System.out.println("Item emprestado com sucesso.");
            }
        }
    }

    public void emprestarItem(String[] codigos){
        for(String codigo : codigos){
            emprestarItem(codigo);
        }
    }

    public double devolverItem(String codigo, int diasAtraso){
        ItemBiblioteca encontrado = buscarItemPorCodigo(codigo);
        if(encontrado == null){
            return 0;
        }else{
            if(diasAtraso > 0){
                double multa = encontrado.calcularMulta(diasAtraso);
                System.out.printf("Item devolvido com sucesso. Multa: R$ %.2f ", multa);
                System.out.println();
                totalMultasArrecadadas += multa;
                encontrado.devolver();
                return multa;
            }else{
                double multa = encontrado.calcularMulta(diasAtraso);
                System.out.printf("Item devolvido com sucesso. Multa: R$ %.2f ", multa);
                System.out.println();
                encontrado.devolver();
                return multa;
            }
        }
    }

    public ItemBiblioteca buscarItemPorCodigo(String codigo){
        for(ItemBiblioteca i : itens){
            if(i.getCodigo().equals(codigo)){
                return i;
            }
        }
        return null;
    }

    public void listarIItens(){
        if(itens.isEmpty()){
            System.out.println("Não há itens cadastrdos.");
        }else {
            for (ItemBiblioteca i : itens) {
                System.out.println(i);
            }
        }
    }
}
