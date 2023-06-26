/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author Kanto
 */
public class Test {
     public static String uploadPhoto(String path, MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        byte[] bytes = file.getBytes();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(path +File.separator + fileName)));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        return fileName;
    }
}
