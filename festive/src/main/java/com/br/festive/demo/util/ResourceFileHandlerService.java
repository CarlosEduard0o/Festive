package com.br.festive.demo.util;

import com.br.festive.demo.port.service.util.ResourceFileService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
@Service
public class ResourceFileHandlerService implements ResourceFileService {
    @Override
    public String read(String resourcePath) throws IOException {
        final ClassLoader classLoader = ResourceFileHandlerService.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(resourcePath);

        if(inputStream == null){
            throw new RuntimeException("Arquivo não encontrado");
        }

        final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(inputStream)
        );

        String content = "";
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            content += line;
        }
        return content;
    }
}
