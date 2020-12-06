package deitelCapitulo10.examples;

public class TesteDafaultImpl implements TestDafault
{
	@Override
	public void shows() {
		TestDafault.super.shows();
		System.out.println("Metodo Default sobrescrito");
	}
	
	public static void main(String[] args) {
		TesteDafaultImpl impl = new TesteDafaultImpl();
		
		impl.shows();
		
		
		
	}
}
