package cursoJava2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExercicioDeApi {
	private static final String VIA_CEP_URL = "https://viacep.com.br/ws/";

	public String buscarCep(String cep) throws Exception {
		String urlParaChamada = VIA_CEP_URL + cep + "/json/";
		URL url = new URL(urlParaChamada);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		// Lendo a resposta da requisição
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		StringBuilder resultado = new StringBuilder();
		String linha;
		while ((linha = reader.readLine()) != null) {
			resultado.append(linha);
		}
		reader.close();
		// Retorna o resultado JSON
		return resultado.toString();
	}
}