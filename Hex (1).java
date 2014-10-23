class Hex{
	public static void main(String[]args){
	if(isHex(args[0]))
		System.out.println(toInt(args[0]));
	else
		System.out.println("not a hex number");
	
	}
	public static boolean isHex(String s){
		boolean answer=true;
		for(int i=0;i<s.length()&& answer;i++){
			if(!((s.charAt(i)>='0'&&s.charAt(i)<='9')||((s.charAt(i))>='A'&&s.charAt(i)<='F')))
			answer=false;
		}
		return answer;
	}
	public static int toInt(String s){
		int hex = 0;
		for(int i=0;i<s.length();i++){
		hex=hex+ctoi(s.charAt(i))*(int)Math.pow(16,s.length()-1-i);
		}
		return hex;
	}
	public static int ctoi(char c){
		int n=0;
		switch(c){
		case'0': n=0;break;
		case'1': n=1;break;
		case'2': n=2;break;
		case'3': n=3;break;
		case'4': n=4;break;
		case'5': n=5;break;
		case'6': n=6;break;
		case'7': n=7;break;
		case'8': n=8;break;
		case'9': n=9;break;
		case'A': n=10;break;
		case'B': n=11;break;
		case'C': n=12;break;
		case'D': n=13;break;
		case'E': n=14;break;
		case'F': n=15;break;
		}
		return n;
	}
}