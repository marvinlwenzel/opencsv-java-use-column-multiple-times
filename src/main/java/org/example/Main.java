package org.example;


import com.opencsv.bean.AbstractBeanField;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.lang3.StringUtils;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        try {
            List<Visitor> beans = new CsvToBeanBuilder<Visitor>(new FileReader("some.csv"))
                    .withType(Visitor.class).withSeparator(';').build().parse();
            for (Visitor b : beans) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


