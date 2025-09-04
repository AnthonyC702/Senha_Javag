package criptografica;


import static criptografica.CadastroCriptografico.criptografarSenha;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Cadastro de usuario ===");
        System.out.println("Digite seu nome de usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        
        String senhaCriptografada = criptografarSenha(senha);
        
        System.out.println("\n Cadastro realizado com sucesso!");
        System.out.println("Usuário : " + usuario);
        System.out.println("senha (Criptografada): " + senhaCriptografada);
        
        
    }
    
}
