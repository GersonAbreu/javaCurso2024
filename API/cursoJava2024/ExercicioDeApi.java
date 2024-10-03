package cursoJava2024;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Classe que representa os dados retornados da API ViaCEP
class Endereco {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Override
    public String toString() {
        return "CEP: " + cep +
               "\nLogradouro: " + logradouro +
               "\nComplemento: " + complemento +
               "\nBairro: " + bairro +
               "\nCidade: " + localidade +
               "\nUF: " + uf +
               "\nIBGE: " + ibge +
               "\nGIA: " + gia +
               "\nDDD: " + ddd +
               "\nSIAFI: " + siafi;
    }
}

public class ViaCepApiClient {

    // Método que consome a API do ViaCEP e retorna o endereço correspondente ao CEP
    public static Endereco buscarEnderecoPorCep(String cep) throws Exception {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Erro na requisição: Código de resposta " + responseCode);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Converter a resposta JSON para um objeto Endereco
        Gson gson = new Gson();
        return gson.fromJson(response.toString(), Endereco.class);
    }

    // Método principal para testar a API
    public static void main(String[] args) {
        try {
            // Teste com o CEP
            String cep = "01001000"; // CEP de exemplo
            Endereco endereco = buscarEnderecoPorCep(cep);
            System.out.println(endereco);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
