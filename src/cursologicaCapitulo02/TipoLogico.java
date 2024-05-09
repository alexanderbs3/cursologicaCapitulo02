package cursologicaCapitulo02;

public class TipoLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira:" + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
        System.out.println("Variavel falsa:" + variavelFalsa);
	
	    System.out.println("--------------------------------");
	    
	    Integer idade = 17;
	    
	    Boolean PodeTirarCarteira = idade >= 18;
	    
	    // System.out.println("Pode tirar carteira? "  + PodeTirarCarteira);
	    
	    if (PodeTirarCarteira) {
	    	System.out.println("Sim! ele pode tirar carteira. ");
	    	
	    	
	    } else {
	    	System.out.println("Nao!ela nao pode tirar a carteira. ");
 	    }
	    	
	    	
	    	
	    
	
	
	
	}

}
