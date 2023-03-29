import org.catolicasc.bank.maruan.Endereco;
import org.catolicasc.bank.maruan.Pessoa;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        System.out.println("Insira seu CPF:");
        pessoa.setCpf(scanner.nextLine());
    } 
}
