package linkedlist;
public class LinkedList {
	int data;
	LinkedList next;

	public LinkedList(int data) {
		this.data = data;	
		this.next = null;
	}
	
	public void insert(LinkedList head, int data){
		LinkedList node = new LinkedList(data);
		if(head == null){
			head = node;
		}
		else{
			LinkedList tmp = head;
			while(tmp.next != null){
				tmp = tmp.next;
			}
			tmp.next = node;
		}	
	}
	public void display(LinkedList head){
		if(head == null){
			System.out.println("List is empty");
		}
		else{
			LinkedList tmp = head;
			while(tmp.next != null){
				System.out.print(tmp.data+"-->");
				tmp = tmp.next;
			}
			System.out.println(tmp.data);
		}
	}
	public int count(LinkedList head){
		int counter = 0;
		if(head == null)
			return 0;
		else{
			LinkedList tmp = head;
			while(tmp.next != null){
				counter++;
				tmp = tmp.next;
			}
			return counter;
		}
	}
	public void revFromMid(LinkedList head,int m,int n){
		if(m > count(head))
			System.out.println("Enter starting value less than list count");
		else{
		LinkedList ls,le,tmp,p;
		ls = le = tmp = p = head;
		/*if(m == 1)
			tmp = tmp.next;*/
		for(int i=1;i<m;i++){
			p = tmp;
			tmp = tmp.next;
		}
		ls = tmp;
		//p.next = null;
		for(int i=1;i<n-m+1;i++){
			tmp=tmp.next;
		}
		le=tmp;
		tmp=tmp.next;
		LinkedList curr = ls;
		LinkedList tmpN,tmp2=null;
		tmpN=curr.next;
		while(curr!=le){
			tmp2=tmpN.next;
			tmpN.next = curr;
			curr=tmpN;
			tmpN=tmp2;
		}
	
			ls.next=tmp;
			head = tmp;
			if(p.next != curr)
				p.next=null;
			else
				p.next=curr;
		}
}
	public static void main(String[] args) {
		LinkedList obj = new LinkedList(3);
		obj.insert(obj, 5);
		obj.insert(obj, 30);
		obj.insert(obj, 40);
		obj.insert(obj,	50);
		obj.insert(obj, 2);
		obj.insert(obj, 44);
		obj.display(obj);
		obj.revFromMid(obj, 1,7  );
		obj.display(obj);
		
	}
}