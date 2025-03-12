package br.com.nazareth.ConsumoApiCorreios.consumo;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ConverteDados implements IConverteDados{
    public <T> T obterDados(String json, Class<T> tipo) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return mapper.readValue(json, tipo);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao deserializar JSON: " + e.getMessage(), e);
        }
    }
}