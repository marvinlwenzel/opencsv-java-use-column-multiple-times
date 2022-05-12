package org.example;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

import java.util.List;

public class Visitor {

    @CsvBindByName
    private int id;

    @CsvBindByName(column = "name")
    private String nameRaw;

    @CsvCustomBindByName(converter = ConvertFirstName.class, column = "name")
    private String firstName;

    @CsvCustomBindByName(converter = ConvertLastName.class, column = "name")
    private String lastName;

    @CsvBindAndSplitByName(column = "name", collectionType = List.class, elementType = String.class)
    private List<String> names;

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", nameRaw='" + nameRaw + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", names=" + names +
                '}';
    }
}

