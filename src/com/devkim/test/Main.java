package com.devkim.test;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		String[] strArr = new String[length];
		for(int i = 0; i < length; i++) {
			strArr[i] = sc.next();
		}
		int[] arr = new int[strArr[0].length()];
		for(int i = 0; i < length - 1; i++) {
			for(int j = 0; j < strArr[i].length();j++) {
				if(strArr[i].indexOf(j) != strArr[i+1].indexOf(j)) {
					arr[j] = 1;
				}
			}
		}
		
		
	}
}
