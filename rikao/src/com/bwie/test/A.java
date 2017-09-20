package com.bwie.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *@作者：刘佳
 *@时间：2017年8月20日下午7:42:26
 *@功能：
 */

public class A {
	public static void main(String[] args){
		FileWriter fw = null;  
        try  
        {  
            fw = new FileWriter("D:\\jpg\\a1.txt");  
              
        }catch(FileNotFoundException e){
        	System.out.println("FileNotFoundException");
        }
        catch (IOException e)  
        {  
            System.out.println("IOException");  
        }catch (Exception e) {
        	System.out.println("Exception");
		}  
	}
	
}
