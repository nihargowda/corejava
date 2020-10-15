package eg;

public class Lambdademo {
	@FunctionalInterface 
	public interface HelloFunction{
		void hello();
	}
	@FunctionalInterface
	public interface Addition{
		int sum(int a,int b, int c);
	}}


