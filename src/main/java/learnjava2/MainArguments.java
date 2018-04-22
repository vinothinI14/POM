package learnjava2;

public class MainArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++)
		{
			System.out.println("Main method arguments are"+args[i]);
		}
		int i=0;
		while(i<=3)
		{
			System.out.println("Main method arguments are"+ args[i]);
			i++;
		}
		for(String arg:args)
		{
			System.out.println("Main method arguments are"+ arg);
		}
			
	}

}
