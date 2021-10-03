package com.kakura.task0.customreader;


import com.kakura.task0.exception.ReaderException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomReader {

    public List<String> readFromFile(String path) throws ReaderException {
        List<String> stringList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String tmp;
            while ((tmp = reader.readLine()) != null) {
                stringList.add(tmp);
            }
        } catch (FileNotFoundException e) {
            throw new ReaderException("File not found ", e);
        } catch (IOException e) {
            throw new ReaderException(e); // ???????
        }

        if (stringList.size() < 2) {
            throw new ReaderException("not enough elements");
        }

        return stringList;
    }
}
