package jsonread;

import com.google.gson.*;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 * @author Jorge
 */
public class JSONRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        
       // Apenas a URL para obter a cotação do dólar na data 04/11/2017
        String sURL = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarPeriodo(dataInicial=@dataInicial,dataFinalCotacao=@dataFinalCotacao)?%40dataInicial=%2701-31-2017%27&%40dataFinalCotacao=%2702-28-2017%27&%24format=json";

        // Conectar à URL usando a biblioteca nativa do Java.
        URL url = new URL(sURL);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();
        
        // Converter um objeto JSON para imprimir os dados 
        JsonParser jp = new JsonParser(); //from gson API.
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an object.
        JsonArray produtosArray = rootobj.getAsJsonArray("value"); //May be an array

 
        //Exibe a tela
        Janela p = new Janela();
        p.addRowsToList(produtosArray);
        p.setVisible(true);
										
    }
 
}