class Node {
	Node next = null;
	int data;
	
	public Node(int d){
		data = d;
	}
	
	void AppendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while (n.next != null){
			n = n.next;
		}
		n.next = end;
	}
}

public class Code2_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
