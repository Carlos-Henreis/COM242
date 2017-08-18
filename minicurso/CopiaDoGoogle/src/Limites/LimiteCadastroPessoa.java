package Limites;

import java.util.Scanner;

public class LimiteCadastroPessoa
{
    int id;
    String nome;
    String email;
    String telefone;
    String tipo;
    private Scanner teclado;
    
    public LimiteCadastroPessoa()
    {        
        teclado = new Scanner(System.in);
        System.out.println("Informe o ID do cidadão:");
        id = teclado.nextInt();
        System.out.println("Informe o nome do cidadão:");
        nome = teclado.next();
        System.out.println("Informe o email do cidadão:");
        email = teclado.next();
        System.out.println("Informe o telefone do cidadão:");
        telefone = teclado.next();
        System.out.println("Informe o tipo do telefone do cidadão:");
        tipo = teclado.next();
    }
    
    public String[] obterDados()
    {
        String formulario[] = {""+id,nome,email,telefone,tipo};
        return formulario;
    }
    
}
