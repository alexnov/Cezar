package ru.alexnov.Cezar;

public class Cezar {
	
	public static int[] stringToInt(String str){
		String str2 = str.replaceAll(" ", "");
		char[] sarray = str2.toCharArray();
		int[] numbers = new int[str2.length()];
		for (int i=0; i<str2.length(); i++){
			numbers[i] = charToInt(sarray[i]);
		}
		
		return numbers;
	}
	
	private static int charToInt(char s){
		switch (s){
		case '�':
			return 1;
		case '�':
			return 2;
		case '�':
			return 3;
		case '�':
			return 4;
		case '�':
			return 5;
		case '�':
			return 6;
		case '�':
			return 7;
		case '�':
			return 8;
		case '�':
			return 9;
		case '�':
			return 10;
		case '�':
			return 11;
		case '�':
			return 12;
		case '�':
			return 13;
		case '�':
			return 14;
		case '�':
			return 15;
		case '�':
			return 16;
		case '�':
			return 17;
		case '�':
			return 18;
		case '�':
			return 19;
		case '�':
			return 20;
		case '�':
			return 21;
		case '�':
			return 22;
		case '�':
			return 23;
		case '�':
			return 24;
		case '�':
			return 25;
		case '�':
			return 26;
		case '�':
			return 27;
		case '�':
			return 28;
		case '�':
			return 29;
		case '�':
			return 30;
		case '�':
			return 31;
		case '�':
			return 32;
		case '�':
			return 33;
		default:
			return 0;
		}
	}

}
