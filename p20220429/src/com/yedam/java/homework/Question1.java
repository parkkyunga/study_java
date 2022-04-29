package com.yedam.java.homework;

public class Question1 {
	public static void main(String[] args){
		String[] strArray = { "10" , "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++ ){
    	try{
        	value = Integer.parseInt(strArray[i]);
        } catch(NumberFormatException e){
        	System.out.println("숫자형식에 맞지않습니다.");
        } catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("인덱스범위를 벗어났습니다.");
        } finally {
        	System.out.println(value);
        }
    }
}
}
