
public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PositionalList <String> myList = new LinkedPositionalList <>();
		Position <String> p0,p1,p2,p3,p4;
		
		p0 = myList.addFirst("g");
		p1 = myList.addAfter(p0,"f");
		p2 = myList.addAfter(p1,"b");
		p2 = myList.addAfter(p2,"c");
		p2 = myList.addAfter(p2,"d");
		p3 = p2;
		p4 = myList.addAfter(p3,"e");
		
		System.out.println("PUNTEROS");
		
		System.out.println(p1.getElement());
		System.out.println(p2.getElement());
		System.out.println(p3.getElement());

		System.out.println("LISTA");
		
		String p = null;
		
		do {
			try {
				Position<String> tempPosition = myList.first();
				p = myList.remove(tempPosition);
				System.out.println(p);
				
			}catch (Exception e) {
				System.out.println("Finalizo la lista");
				p = null;
				break;
				
			}
			
		}while(p != null);
		
		
				
		
	}

}
