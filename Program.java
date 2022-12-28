package Minterfaces.Arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        List<Employees> list = new ArrayList<>();
        String path = "C:\\projetos\\ws-eclipse\\curso_programacao\\file.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String employeeCsv = br.readLine();
                    while (employeeCsv != null){
                        String[] fields = employeeCsv.split(",");

                        list.add(new Employees(fields[0], Double.parseDouble(fields[1])));
                        employeeCsv = br.readLine();

                    }

                    Collections.sort(list);
                    for(Employees s: list){
                        System.out.println(s.getName() + ", " + s.getSalary());

                    }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }

}
