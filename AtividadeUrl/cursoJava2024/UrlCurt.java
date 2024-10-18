package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlCurt extends JFrame {
    private JTextField inputUrlField;
    private JTextField outputUrlField;
    private JButton shortenButton;

    public UrlCurt() {
        // Configurações da Janela
        setTitle("Encurtador de URL - TinyURL");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Campo de entrada da URL
        JLabel inputLabel = new JLabel("URL Original:");
        inputLabel.setBounds(10, 10, 100, 25);
        add(inputLabel);

        inputUrlField = new JTextField();
        inputUrlField.setBounds(120, 10, 250, 25);
        add(inputUrlField);

        // Campo de saída da URL encurtada
        JLabel outputLabel = new JLabel("URL Encurtada:");
        outputLabel.setBounds(10, 50, 100, 25);
        add(outputLabel);

        outputUrlField = new JTextField();
        outputUrlField.setBounds(120, 50, 250, 25);
        outputUrlField.setEditable(false);
        add(outputUrlField);

        // Botão de encurtar
        shortenButton = new JButton("Encurtar URL");
        shortenButton.setBounds(120, 90, 150, 25);
        add(shortenButton);

        // Ação do botão
        shortenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String originalUrl = inputUrlField.getText();
                if (!originalUrl.isEmpty()) {
                    try {
                        String shortUrl = shortenUrlWithTinyURL(originalUrl);
                        outputUrlField.setText(shortUrl);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao encurtar a URL: " + ex.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira uma URL válida.");
                }
            }
        });
    }

    // Método para encurtar a URL usando a API do TinyURL
    private String shortenUrlWithTinyURL(String longUrl) throws Exception {
        String apiUrl = "https://tinyurl.com/api-create.php?url=" + longUrl;
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Lendo a resposta da API
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
        StringBuilder response = new StringBuilder();
        String responseLine;
        while ((responseLine = br.readLine()) != null) {
            response.append(responseLine.trim());
        }
        br.close();

        // A URL encurtada é retornada diretamente na resposta
        return response.toString();
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                UrlCurt app = new UrlCurt();
                app.setVisible(true);
            }
        });
    }
}
