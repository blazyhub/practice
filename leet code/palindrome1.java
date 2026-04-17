class palindrome1{

	static boolean ispalindrome(int x){
		if (x<0)
			return false;

		int original=x;
		int revese=0;

		while(x!=0){
			int digit = x%10;
			revese = revese *10 + digit;
			x = x/10;
		}

		return revese== original;
	}



	public static void main(String[] args) {

		System.out.println("satrt");

		int num =-121;
		if(ispalindrome(num)){
			System.out.println("its palindrome");
		}
		else{
			System.out.println("not a plainrome");
		}




		System.out.println("end");
		
	}


}