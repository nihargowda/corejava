package eg1;

public class Buffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("hii");
		sb.append(" hello");
		sb.delete(1,4);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(1, "oye");
		System.out.println(sb);

}

}
