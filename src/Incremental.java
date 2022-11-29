
public class Incremental {	
    
    private static int count = 0;
    private int numero;
    private static Incremental instance = new Incremental();    
    private Incremental()
    {
    	
    }
    
    public static Incremental getInstance() 
    {
		return instance;
	}
    
    public void IncrementNumber(int number)
    {
        for(int i = 0; i< number; i++)
        {
        	numero = ++count;
        	System.out.println("Incremental " + numero);
        }
    }
    
}
