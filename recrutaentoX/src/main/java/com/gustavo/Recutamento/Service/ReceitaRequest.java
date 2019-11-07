/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.Recutamento.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ReceitaRequest {
    
    private static final Logger logger = Logger.getLogger(ReceitaRequest.class.getName());
    
    private String consutaCNPJ(String cnpj) throws MalformedURLException, IOException{
        
        try{
            
        String request = "https://www.receitaws.com.br/v1/cnpj/".concat(cnpj);
        URL url  = new URL(request);
        URLConnection conn = url.openConnection();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String linha;
        while ((linha = buffer.readLine()) != null) {
            System.out.println(linha);
        }
        }
        catch(MalformedURLException m){
            logger.log(Level.SEVERE,"Fudeu a requisicao --> ",m);
        }
        
    }
}
        
        return "";
        
    }
    
    
}
