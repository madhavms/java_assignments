package com.inapp.firstjava.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileTest {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter path : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Input path is : "+reader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileTest test = new FileTest();
		System.out.println(test.listFileInDirectory("D:\\java_learn\\docrepo"));
		System.out.println(test.listFileInDirectory("D:/java_learn/docrepo"));
		
		System.out.println("File content is : "+test.readFileContentAsString("D:\\java_learn\\docrepo\\Hello.txt"));
	}
	
	public List<String> listFileInDirectory(String directoryPath){
		List<String> fileNames  = new ArrayList<String>();
		if(null != directoryPath && !"".equals(directoryPath.trim())){
			File directory = new File(directoryPath);		
			if(directory.exists()){
				System.out.println("Given path is valid : "+directoryPath);
				if(directory.isDirectory()){
					System.out.println("Given path points to a directory : "+directoryPath);
					File[] containingFiles = directory.listFiles();
					if(null != containingFiles && containingFiles.length > 0) {
						for (int i = 0; i < containingFiles.length; i++) {
							fileNames.add(containingFiles[i].getName());
						}
					} else {
						System.out.println("The given directory is Empty.");
					}
				} else {
					System.out.println("Given path is no a directory : "+directoryPath);
				}
				
			} else {
				System.out.println("Given path is Invalid : "+directoryPath);
			}
		} else {
			System.out.println("Given path is Empty : "+directoryPath);
		}
		
		
		return fileNames;
	}
	
	public String readFileContentAsString(String path){
		String fileContent = "";
		if(path != null && !"".equals(path)){
			File file = new File(path);
			if(!file.isDirectory()){
				//FileInputStream fileInputStream = null;
				try {
					System.out.println("In try");
					//fileInputStream = new FileInputStream(file);
					BufferedReader reader = new BufferedReader(new FileReader(file));
					fileContent = reader.readLine();
				} catch (FileNotFoundException e) {					
					e.printStackTrace();
				} catch (IOException e) {					
					e.printStackTrace();
				} finally{
					System.out.println("In finally");
				}
			} else {
				System.out.println("The given path points to a directory");
			}
		} else {
			System.out.println("Filename is invalid");
		}
		return fileContent;
	}

}
