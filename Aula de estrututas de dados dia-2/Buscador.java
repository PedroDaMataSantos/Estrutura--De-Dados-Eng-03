import java.util.Scanner;

public class Buscador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] aluno = {"Pedro", "Ana", "Maria", "Andre", "Patricia"};

        String alunoProcurado = "Maria";


        for (int i = 0; i < aluno.length; i++) {

            if (aluno[i].equals(alunoProcurado)) {
                System.out.println("Achei: "+alunoProcurado+ " na posição "+(i+1));
                break;

            }
        }
    }
}
