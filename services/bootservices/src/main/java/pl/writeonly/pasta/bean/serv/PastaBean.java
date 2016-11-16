package pl.writeonly.pasta.bean.serv;


public class PastaBean implements Pasta {

	@Override
	public void printHelloWorld(String msg) {

		System.out.println("Hello : " + msg);
	}

}
