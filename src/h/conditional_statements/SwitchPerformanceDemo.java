package h.conditional_statements;

public class SwitchPerformanceDemo {

	public static void main(String[] args) {
		long startTime = 0, endTime = 0;
		double taskTime = 0.0;
		// TODO 05: Performance of switch vs. multiple else if
		int num = 100;
		
		startTime = System.nanoTime();
		System.out.println(hundredElseIf(num));
		endTime = System.nanoTime();
		taskTime = (endTime - startTime) / 1000000.0;
		System.out.println("Multiple else if took " + taskTime + "ms.");
		
		startTime = System.nanoTime();
		System.out.println(hundredSwitchCases(num)); 
		endTime = System.nanoTime();
		taskTime = (endTime - startTime) / 1000000.0;
		System.out.println("Switch took " + taskTime + "ms.");

	}
	
	private static String hundredElseIf(int num) {
		String result;
		if(num == 1) {result = "ONE";}
		else if (num==2) {result = "TWO";}
		else if (num==3) {result = "THREE";}
		else if (num==4) {result = "FOUR";}
		else if (num==5) {result = "FIVE";}
		else if (num==6) {result = "SIX";}
		else if (num==7) {result = "SEVEN";}
		else if (num==8) {result = "EIGHT";}
		else if (num==9) {result = "NINE";}
		else if (num==10) {result = "TEN";}
		else if (num==11) {result = "ELEVEN";}
		else if (num==12) {result = "TWELVE";}
		else if (num==13) {result = "THIRTEEN";}
		else if (num==14) {result = "FOURTEEN";}
		else if (num==15) {result = "FIFTEEN";}
		else if (num==16) {result = "SIXTEEN";}
		else if (num==17) {result = "SEVENTEEN";}
		else if (num==18) {result = "EIGHTEEN";}
		else if (num==19) {result = "NINETEEN";}
		else if (num==20) {result = "TWENTY";}
		else if (num==21) {result = "TWENTY ONE";}
		else if (num==22) {result = "TWENTY TWO";}
		else if (num==23) {result = "TWENTY THREE";}
		else if (num==24) {result = "TWENTY FOUR";}
		else if (num==25) {result = "TWENTY FIVE";}
		else if (num==26) {result = "TWENTY SIX";}
		else if (num==27) {result = "TWENTY SEVEN";}
		else if (num==28) {result = "TWENTY EIGHT";}
		else if (num==29) {result = "TWENTY NINE";}
		else if (num==30) {result = "THIRTY";}
		else if (num==31) {result = "THIRTY ONE";}
		else if (num==32) {result = "THIRTY TWO";}
		else if (num==33) {result = "THIRTY THREE";}
		else if (num==34) {result = "THIRTY FOUR";}
		else if (num==35) {result = "THIRTY FIVE";}
		else if (num==36) {result = "THIRTY SIX";}
		else if (num==37) {result = "THIRTY SEVEN";}
		else if (num==38) {result = "THIRTY EIGHT";}
		else if (num==39) {result = "THIRTY NINE";}
		else if (num==40) {result = "FOURTY";}
		else if (num==41) {result = "FOURTY ONE";}
		else if (num==42) {result = "FOURTY TWO";}
		else if (num==43) {result = "FOURTY THREE";}
		else if (num==44) {result = "FOURTY FOUR";}
		else if (num==45) {result = "FOURTY FIVE";}
		else if (num==46) {result = "FOURTY SIX";}
		else if (num==47) {result = "FOURTY SEVEN";}
		else if (num==48) {result = "FOURTY EIGHT";}
		else if (num==49) {result = "FOURTY NINE";}
		else if (num==50) {result = "FIFTY";}
		else if (num==51) {result = "FIFTY ONE";}
		else if (num==52) {result = "FIFTY TWO";}
		else if (num==53) {result = "FIFTY THREE";}
		else if (num==54) {result = "FIFTY FOUR";}
		else if (num==55) {result = "FIFTY FIVE";}
		else if (num==56) {result = "FIFTY SIX";}
		else if (num==57) {result = "FIFTY SEVEN";}
		else if (num==58) {result = "FIFTY EIGHT";}
		else if (num==59) {result = "FIFTY NINE";}
		else if (num==60) {result = "SIXTY";}
		else if (num==61) {result = "SIXTY ONE";}
		else if (num==62) {result = "SIXTY TWO";}
		else if (num==63) {result = "SIXTY THREE";}
		else if (num==64) {result = "SIXTY FOUR";}
		else if (num==65) {result = "SIXTY FIVE";}
		else if (num==66) {result = "SIXTY SIX";}
		else if (num==67) {result = "SIXTY SEVEN";}
		else if (num==68) {result = "SIXTY EIGHT";}
		else if (num==69) {result = "SIXTY NINE";}
		else if (num==70) {result = "SEVENTY";}
		else if (num==71) {result = "SEVENTY ONE";}
		else if (num==72) {result = "SEVENTY TWO";}
		else if (num==73) {result = "SEVENTY THREE";}
		else if (num==74) {result = "SEVENTY FOUR";}
		else if (num==75) {result = "SEVENTY FIVE";}
		else if (num==76) {result = "SEVENTY SIX";}
		else if (num==77) {result = "SEVENTY SEVEN";}
		else if (num==78) {result = "SEVENTY EIGHT";}
		else if (num==79) {result = "SEVENTY NINE";}
		else if (num==80) {result = "EIGHTY";}
		else if (num==81) {result = "EIGHTY ONE";}
		else if (num==82) {result = "EIGHTY TWO";}
		else if (num==83) {result = "EIGHTY THREE";}
		else if (num==84) {result = "EIGHTY FOUR";}
		else if (num==85) {result = "EIGHTY FIVE";}
		else if (num==86) {result = "EIGHTY SIX";}
		else if (num==87) {result = "EIGHTY SEVEN";}
		else if (num==88) {result = "EIGHTY EIGHT";}
		else if (num==89) {result = "EIGHTY NINE";}
		else if (num==90) {result = "NINETY";}
		else if (num==91) {result = "NINETY ONE";}
		else if (num==92) {result = "NINETY TWO";}
		else if (num==93) {result = "NINETY THREE";}
		else if (num==94) {result = "NINETY FOUR";}
		else if (num==95) {result = "NINETY FIVE";}
		else if (num==96) {result = "NINETY SIX";}
		else if (num==97) {result = "NINETY SEVEN";}
		else if (num==98) {result = "NINETY EIGHT";}
		else if (num==99) {result = "NINETY NINE";}
		else if (num==100) {result = "ONE HUNDRED";}
		else { result = "not found";}
		return result;
	}
	
	private static String hundredSwitchCases(int num) {
		String result;
		switch(num) {
		case 1: result = "ONE"; break;
		case 2: result = "TWO"; break;
		case 3: result = "THREE"; break;
		case 4: result = "FOUR"; break;
		case 5: result = "FIVE"; break;
		case 6: result = "SIX"; break;
		case 7: result = "SEVEN"; break;
		case 8: result = "EIGHT"; break;
		case 9: result = "NINE"; break;
		case 10: result = "TEN"; break;
		case 11: result = "ELEVEN"; break;
		case 12: result = "TWELVE"; break;
		case 13: result = "THIRTEEN"; break;
		case 14: result = "FOURTEEN"; break;
		case 15: result = "FIFTEEN"; break;
		case 16: result = "SIXTEEN"; break;
		case 17: result = "SEVENTEEN"; break;
		case 18: result = "EIGHTEEN"; break;
		case 19: result = "NINETEEN"; break;
		case 20: result = "TWENTY"; break;
		case 21: result = "TWENTY ONE"; break;
		case 22: result = "TWENTY TWO"; break;
		case 23: result = "TWENTY THREE"; break;
		case 24: result = "TWENTY FOUR"; break;
		case 25: result = "TWENTY FIVE"; break;
		case 26: result = "TWENTY SIX"; break;
		case 27: result = "TWENTY SEVEN"; break;
		case 28: result = "TWENTY EIGHT"; break;
		case 29: result = "TWENTY NINE"; break;
		case 30: result = "THIRTY"; break;
		case 31: result = "THIRTY ONE"; break;
		case 32: result = "THIRTY TWO"; break;
		case 33: result = "THIRTY THREE"; break;
		case 34: result = "THIRTY FOUR"; break;
		case 35: result = "THIRTY FIVE"; break;
		case 36: result = "THIRTY SIX"; break;
		case 37: result = "THIRTY SEVEN"; break;
		case 38: result = "THIRTY EIGHT"; break;
		case 39: result = "THIRTY NINE"; break;
		case 40: result = "FOURTY"; break;
		case 41: result = "FOURTY ONE"; break;
		case 42: result = "FOURTY TWO"; break;
		case 43: result = "FOURTY THREE"; break;
		case 44: result = "FOURTY FOUR"; break;
		case 45: result = "FOURTY FIVE"; break;
		case 46: result = "FOURTY SIX"; break;
		case 47: result = "FOURTY SEVEN"; break;
		case 48: result = "FOURTY EIGHT"; break;
		case 49: result = "FOURTY NINE"; break;
		case 50: result = "FIFTY"; break;
		case 51: result = "FIFTY ONE"; break;
		case 52: result = "FIFTY TWO"; break;
		case 53: result = "FIFTY THREE"; break;
		case 54: result = "FIFTY FOUR"; break;
		case 55: result = "FIFTY FIVE"; break;
		case 56: result = "FIFTY SIX"; break;
		case 57: result = "FIFTY SEVEN"; break;
		case 58: result = "FIFTY EIGHT"; break;
		case 59: result = "FIFTY NINE"; break;
		case 60: result = "SIXTY"; break;
		case 61: result = "SIXTY ONE"; break;
		case 62: result = "SIXTY TWO"; break;
		case 63: result = "SIXTY THREE"; break;
		case 64: result = "SIXTY FOUR"; break;
		case 65: result = "SIXTY FIVE"; break;
		case 66: result = "SIXTY SIX"; break;
		case 67: result = "SIXTY SEVEN"; break;
		case 68: result = "SIXTY EIGHT"; break;
		case 69: result = "SIXTY NINE"; break;
		case 70: result = "SEVENTY"; break;
		case 71: result = "SEVENTY ONE"; break;
		case 72: result = "SEVENTY TWO"; break;
		case 73: result = "SEVENTY THREE"; break;
		case 74: result = "SEVENTY FOUR"; break;
		case 75: result = "SEVENTY FIVE"; break;
		case 76: result = "SEVENTY SIX"; break;
		case 77: result = "SEVENTY SEVEN"; break;
		case 78: result = "SEVENTY EIGHT"; break;
		case 79: result = "SEVENTY NINE"; break;
		case 80: result = "EIGHTY"; break;
		case 81: result = "EIGHTY ONE"; break;
		case 82: result = "EIGHTY TWO"; break;
		case 83: result = "EIGHTY THREE"; break;
		case 84: result = "EIGHTY FOUR"; break;
		case 85: result = "EIGHTY FIVE"; break;
		case 86: result = "EIGHTY SIX"; break;
		case 87: result = "EIGHTY SEVEN"; break;
		case 88: result = "EIGHTY EIGHT"; break;
		case 89: result = "EIGHTY NINE"; break;
		case 90: result = "NINETY"; break;
		case 91: result = "NINETY ONE"; break;
		case 92: result = "NINETY TWO"; break;
		case 93: result = "NINETY THREE"; break;
		case 94: result = "NINETY FOUR"; break;
		case 95: result = "NINETY FIVE"; break;
		case 96: result = "NINETY SIX"; break;
		case 97: result = "NINETY SEVEN"; break;
		case 98: result = "NINETY EIGHT"; break;
		case 99: result = "NINETY NINE"; break;
		case 100: result = "ONE HUNDRED"; break;
		default: result = "not found";
		}
		return result;
	}

}
