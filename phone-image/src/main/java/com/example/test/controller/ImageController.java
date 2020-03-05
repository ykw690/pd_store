package com.example.test.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Test1Application;

@RestController
@RequestMapping("/image1")
public class ImageController {
	public FileInputStream is;
	public File file;
	
	@RequestMapping("/test")
	public String Test1Application() {
		return "test";
	}
	
	@RequestMapping("/{name}")
	public void getImage(@PathVariable String name,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println(1);
		file=new File("D:\\STSworkspace\\phone-web\\image\\phone\\"+name);
		if(file.exists()) {
			try {
				is=new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			response.setContentType("image/jpeg");
			if(is!=null) {
				int i = is.available();
				byte data[]=new byte[i];
				is.read(data);
				is.close();
				response.setContentType("image/jpeg");
				ServletOutputStream toClient = response.getOutputStream();
				toClient.write(data);
				toClient.close();
			}
		}
	}
}
