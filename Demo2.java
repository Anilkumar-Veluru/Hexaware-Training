class Demo2
{
	public static void main(String [] args)
	{
	//List l=new List();
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Thanesh");
		al.add(true);
		al.add('A');
		al.add(10.6);
		
		ArrayList al2=new ArrayList();
		al2.add(999);
		al2.add(777);
		al2.add(666);
		
		Iterator i=al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("=====");
		Iterator i1=al2.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("==Add All ===");
		al.addAll(al2);
		System.out.println(al);
		System.out.println(al.contains(999));
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println("Removed : "+al.remove(7));
		System.out.println(al.contains(666));
	}
}