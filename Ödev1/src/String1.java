
public class String1 {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4) );
		System.out.println(mesaj.concat(" Ya�as�n!!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] characters = new char[5];
		mesaj.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(mesaj.indexOf('a'));
		
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
	    System.out.println(mesaj.substring(2,5)); 
	    
	    for (String kelime : mesaj.split( " ")) {
	    	System.out.println(kelime);	    	
	    }
	    
	    System.out.println(mesaj.toLowerCase());
	    System.out.println(mesaj.toUpperCase());
	    System.out.println(mesaj.trim());
	    
	     

}

}
