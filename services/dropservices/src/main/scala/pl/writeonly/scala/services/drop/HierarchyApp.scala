public class HierarchyApp {

	public static void main(String[] args) {
		EventBus eb = new EventBus();
		eb.register(new IntHandler());
		eb.register(new NumberHandler());
		eb.post(1);
		eb.post(2L);
	}
}

class IntHandler{

	@Subscribe
	public void forInt(Integer i){
		System.out.println("Integer " + i);
	}

}
class NumberHandler{

	@Subscribe
	public void forInt(Number i){
		System.out.println("Number " + i);
	}

}
