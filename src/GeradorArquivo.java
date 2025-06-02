import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void gerarArquivo(Itens endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            FileWriter arquivo = new FileWriter(endereco.cep()+".json");
            arquivo.write(gson.toJson(endereco));
            arquivo.close();

        } catch (IOException e) {
            System.out.println("Falha na gravação do arquivo");
        }
    }
}
