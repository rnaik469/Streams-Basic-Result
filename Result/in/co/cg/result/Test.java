package in.co.cg.result;

import java.io.IOException;
import in.co.cg.basic.StreamBasic;


public class Test {

	public static void main(String[] args) throws IOException {
		StreamBasic streamBasic=new StreamBasic(); //Instantiating class
		streamBasic.writeToBoy(); //invoking writeboy
		streamBasic.readBoy();	//invoking readboy
	}
}
