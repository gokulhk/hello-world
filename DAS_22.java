
import java.util.LinkedList;
import java.util.Scanner;

class Node{
	int data;
	Node next = null;
	Node(int d){
		this.data = d;
	}
}

public class DAS_22{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int len=0,n;
		System.out.println("Enter length of the list");
		len = sc.nextInt();
		DAS_22 nodes = new DAS_22();
		Node head = null, p=null;
		for(int i=0;i<len ;++i){
			head = nodes.append( head, sc.nextInt() );
		}

		System.out.println("Enter nth node index from last");
		n = sc.nextInt();
		p = nodes.nthNodeFromLast(head, n);
		if(p==null){
			System.out.println("given n value exceeds list length.");
		}
		else{
			System.out.println("nth node vale from last node : " + p.data);
		}
	}

	public Node append(Node head, int data ){

		//if list is empty create a node with given data and returns the pointer
		Node temp = new Node(data);
		if(head==null){
			return temp;
		}

		//get pointer to last node
		Node p = head;
		while(p.next!=null){
			p = p.next;
		}

		//appned new node at last
		p.next = temp;
		return head;
	}

	public Node nthNodeFromLast(Node head, int n){

		Node p = head;
		if(head==null || n ==0){
			return null;
		}

		Node q = p;
		int listlen = 0;
		while(q!=null){
			listlen++;
			q = q.next;
		}
		listlen++;

		if(listlen<n) return null;
		int itr =0;
		while(itr<listlen-n-1){
			System.out.println("Looped");
			p = p.next;
			itr++;
		}
		return p;
	}

}