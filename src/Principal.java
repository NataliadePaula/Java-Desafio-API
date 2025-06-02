import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Busca busca = new Busca();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do cep desejado");

        try {
            Itens consultaEndereco = busca.consultar(scanner.next());
            System.out.println(consultaEndereco);
            GeradorArquivo gerador = new GeradorArquivo();
            gerador.gerarArquivo(consultaEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}
