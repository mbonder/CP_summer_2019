package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.FileNameMap;


public class filesize {

    public static long sumSize(File inFile) {
        long sum = 0;
        if (inFile.isDirectory()) {
            for (File f : inFile.listFiles()) {
                System.out.println(f.toString()+ " " + f.getName());
                //sum += f.length();
                sum+= sumSize(f);
            }
        } else {
            return inFile.length();
        }

            return sum;
    }

    public static void main(String[] args) {

        /*String path = "C:\\Users\\maksb\\Desktop\\myfile\\mytext.txt";
        File file = new File(path);
                                                                            to jest dla jednego pliku
        long size = file.length();
        System.out.println(size); */


        String path = "C:\\Users\\maksb\\Desktop\\myfile";
        File mypath = new File(path);
        if (mypath.isDirectory()) {
            for (File f : mypath.listFiles()) ;
            System.out.println(sumSize(mypath));

        }


    }
}
