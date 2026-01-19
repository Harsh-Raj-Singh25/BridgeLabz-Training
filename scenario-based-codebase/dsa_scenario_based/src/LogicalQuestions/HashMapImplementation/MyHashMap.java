package LogicalQuestions.HashMapImplementation;

public class MyHashMap {
	HashNode[] map;
	
	public MyHashMap() {
		map=new HashNode[1000];
		for(int i=0;i<1000;i++) {
			map[i]=new HashNode(-1,null);
			
		}
	}
	// defining the hash function
	private int hash(int key) {
		return key % 1000;
	}
	
	// defining the method to put in hash
	public void put(int key,String value) {
		int hash=hash(key);
		HashNode temp=map[hash];
		
		while(temp.next!=null) {
			if(temp.next.key==key) {
				temp.next.value=value;
				return;
			}
			temp=temp.next;
		}
		temp.next=new HashNode(key,value);
	}
	
	// defining a method to fetch a value using key
	public String get(int key) {
		int hash=hash(key);
		HashNode temp=map[hash].next;
		// looping while temp is not null
		while(temp!=null) {
			if(temp!= null) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
}
