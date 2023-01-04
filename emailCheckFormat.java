//Simple program for checking the format of the email
public class emailCheckFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="gokul.elumalai12@gmail.com";
		System.out.println(email);
		String[] arrofstr=email.split("@",2);
		for(int i=0;i<arrofstr.length;i++) {
		    System.out.println(arrofstr[i]);
		}
		String s1=arrofstr[0];
		String s2=arrofstr[1];
	    //System.out.println(s1);
	    char[] c1=new char[s1.length()];
	    char[] c2=new char[s2.length()];
	    int count=0;
	    for(int i=0;i<s1.length();i++) {
	       c1[i]=s1.charAt(i);
	    }
	    for(int i=0;i<s2.length();i++) {
	       c2[i]=s2.charAt(i);
	    }
	    for(int i=0;i<c1.length;i++) {
	        if(c1[i] == '.') {
	            count+=1;
	        }
	    }
	    for(int i=0;i<c2.length;i++) {
	        if(c2[i] == '.') {
	            count+=1;
	        }
	    }
	    if(count>1) {
	        System.out.println("True");
	    }
	    else {
	        System.out.println("False");
	    }
	    }
}