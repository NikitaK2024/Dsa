package com.linklist;

public class LL {
	
	private Node head;
	private Node tail;
	int size;
	
	LL(){
		
	}
	
	
	public LL(Node head, Node tail, int size) {
		super();
		this.head = head;
		this.tail = tail;
		this.size = 0;
	}


	public  void Listt(int data) {
		Node node=new Node(data);
		node.next=head;
		head=node;
		
		if(tail==null)
		{
			tail=head;
		}
		size+=1;
		//System.out.println(data);
	}
	
	
	public void last_insert(int data) {
		if(tail==null) {
			Listt(data);
		}
		Node node=new Node(data);
		tail.next=node;
		tail=node;
		size++;
		
		System.out.println("\nNew Node Added"+data);
	}
	
	void insert_index(int data, int index) {
		if(index==0)
		{
			Listt(data);
		}
		
		if(index==size)
		{
			last_insert(data);
		}
		
		Node temp=head;
		
		for(int i=1;i<index;i++)
		{
			temp=temp.next;
		}
		
		Node node=new Node(data,temp.next);
		temp.next=node;
		
		size++;
	}
	
	
	public int delete_First() {
		int data=head.data;
		head=head.next;
		if(head==null)
			tail=null;
		
		size--;
		return data;
	}
	
	
	public int delete_last() {
		if(size<=1) {
			return delete_First();
		}
		
		Node second=get(size-2);
		int data=tail.data;
		tail=second;
		tail.next=null;
		size--;
		return data;
	}
	
	public int delete_index(int index) {
		if(index==0)
			return delete_First();
		if(index==size-1)
			return delete_last();
		
		Node prev=get(index-1);
		int data=prev.next.data;
		prev.next=prev.next.next;
		
		return data;
	}
	public Node get(int index)
	{
		Node node=head;
		for (int i=0;i<index;i++) {
			node=node.next;
		}
		return node;
	}
	
	
	public Node find(int data) {
		Node node=head;
		while(node!=null)
		{
			if(node.data==data)
				return node;
			
			node=node.next;
		}
		
		return node;
	}
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+ " -> ");
			temp=temp.next;
		}
		System.out.print("END");
	}

	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
		
			this.data = data;
				}
		
		
		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		LL list=new LL();
		list.Listt(24);
		list.Listt(4);
		list.Listt(14);
		
		list.display();
		list.last_insert(300);
		list.display();
		
		list.insert_index(321, 2);
		System.out.println();
		list.display();
		System.out.println();
		list.delete_First();
		System.out.println();
		list.display();
		
		list.delete_last();
		System.out.println();
		list.display();
		
		list.delete_index(2);
		System.out.println();
		list.display();
		
		Node node=list.find(321);
	
		
	}

}
