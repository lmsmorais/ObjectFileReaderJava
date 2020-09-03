package br.uniso;

import java.io.*;

public class ObjectFileReader {
    public static void main (String[] args){
        //criar arquivo
        File f = new File("arquivoObjetos.bin");

        //tratar exceções
        try {
            InputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            Student s1 = (Student)ois.readObject();
            Student s2 = (Student)ois.readObject();

            String studentName1 = s1.getNome();
            String studentName2 = s2.getNome();

            System.out.println(studentName1);
            System.out.println(studentName2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
