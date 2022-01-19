import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	String[] gobble = new String[19];
	int co = 0;
	
	while(co < gobble.length){
		gobble[co] = new String("");
		co ++;
	}
	
	gobble[0] = "	      __,,,,,,,,,_";
	gobble[1] = "	   t/%////\"====\"\\\\&\\j";
	gobble[2] = "	 {/%/////\"======\"\\\\\\&\\}   __";
	gobble[3] = "	{/%/////\"========\"\\\\\\&\\} |  |";
	gobble[4] = "       {/%///////00000@@@@@@@@&\\}|__|";
	gobble[5] = "       {/%/////0000@@@@@@@@@@@@%_|_=|_";
	gobble[6] = " 	{/%/////00@@@@@@@@@@@@@%( * \\|>";
	gobble[7] = " 	 t\\%\\\\\\\\\\\\0@@@@@%(((((((%\\ \\\\U";
	gobble[8] = " 	   ========;;(((((%;CCCCc(\\ \\\\";
	gobble[9] = " 	         /::::;CCCCCCCCCCc@} }}";
	gobble[10] = " 	        {:::;CCCCCCCCCCCc%@} }}";
	gobble[11] = " 	       {:::;CCCCCCCCCCCcc@} }}";
	gobble[12] = " 	    ======:;CCCCCCCc;%((((000";
	gobble[13] = " 	 +=======:;CCc;%(((((((((000";
	gobble[14] = " 	+=============(((((#######";
	gobble[15] = " 	 +========////y¥¥¥¥¥¥¥¥";
	gobble[16] = " 	   +/////      Y    Y";
	gobble[17] = " 	                \\    \\";
	gobble[18] = " 	                /M\\  /M\\";
		
	co = 0;
		
	while(co < gobble.length){
		System.out.println(gobble[co]);
		co++;
	}
	
	
	
	}
}
