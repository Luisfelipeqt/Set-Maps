package Minterfaces.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program_Service {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<ProductService> list = new ArrayList<>();
        String path = "C:\\projetos\\ws-eclipse\\curso_programacao\\file.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");

                list.add(new ProductService(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();

            }

            ProductService x = CalculationService.max(list);
            System.out.println("Most expesive:");
            System.out.println(x.getPrice());



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}


