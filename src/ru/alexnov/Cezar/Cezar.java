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
		case 'à':
			return 1;
		case 'á':
			return 2;
		case 'â':
			return 3;
		case 'ã':
			return 4;
		case 'ä':
			return 5;
		case 'å':
			return 6;
		case '¸':
			return 7;
		case 'æ':
			return 8;
		case 'ç':
			return 9;
		case 'è':
			return 10;
		case 'é':
			return 11;
		case 'ê':
			return 12;
		case 'ë':
			return 13;
		case 'ì':
			return 14;
		case 'í':
			return 15;
		case 'î':
			return 16;
		case 'ï':
			return 17;
		case 'ð':
			return 18;
		case 'ñ':
			return 19;
		case 'ò':
			return 20;
		case 'ó':
			return 21;
		case 'ô':
			return 22;
		case 'õ':
			return 23;
		case 'ö':
			return 24;
		case '÷':
			return 25;
		case 'ø':
			return 26;
		case 'ù':
			return 27;
		case 'ü':
			return 28;
		case 'û':
			return 29;
		case 'ú':
			return 30;
		case 'ý':
			return 31;
		case 'þ':
			return 32;
		case 'ÿ':
			return 33;
		default:
			return 0;
		}
	}

}
