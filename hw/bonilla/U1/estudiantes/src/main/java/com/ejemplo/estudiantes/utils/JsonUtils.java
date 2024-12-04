package com.ejemplo.estudiantes.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Robinson Bonilla
 */
public class JsonUtils {
    //Leer Datos del Json
    public static <T> List<T> cargarDesdeJson(String fileName, Class<T[]> type) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                T[] array = new ObjectMapper().readValue(file, type);
                return Arrays.asList(array);
            }
        } catch (IOException e) {
            System.out.println("Error al cargar datos desde el archivo JSON: " + e.getMessage());
        }
        return new ArrayList<T>();
    }
    
    
    
    //////////////////////////////////////
    //Guardar Datos en el Json
    
    public static <T> void guardarEnJson(String fileName, List<T> list) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new File(fileName), list);
        } catch (IOException e) {
            System.out.println("Error al guardar datos en el archivo JSON: " + e.getMessage());
        }
    }
    
    //////////////////////////////////////////////////
    
    

}
