package com.HashMapsHashFunctions.CustomHashMap;

class MyHashMap<K, V> {
	private HashNode<K, V>[] buckets;
	private int numBuckets; // Capacity of the array
	private int size; // Number of key-value pairs stored
	
	public MyHashMap() {
		numBuckets = 10; // Initial capacity
		buckets = new HashNode[numBuckets];
		size = 0;
	}

	// HASH FUNCTION: Maps a key to an index
	private int getBucketIndex(K key) {
		int hashCode = key.hashCode();
		int index = Math.abs(hashCode) % numBuckets;
		return index;
	}

	// 1. INSERT (PUT)
	public void put(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets[bucketIndex];

		// Check if key already exists, update value if it does
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}

		// Insert new node at the head of the list (Separate Chaining)
		size++;
		head = buckets[bucketIndex];
		HashNode<K, V> newNode = new HashNode<>(key, value);
		newNode.next = head;
		buckets[bucketIndex] = newNode;
	}

	// 2. RETRIEVAL (GET)
	public V get(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets[bucketIndex];

		while (head != null) {
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null; // Key not found
	}

	// 3. DELETION (REMOVE)
	public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = buckets[bucketIndex];
		HashNode<K, V> prev = null;

		while (head != null) {
			if (head.key.equals(key)) {
				break;
			}
			prev = head;
			head = head.next;
		}

		if (head == null)
			return null; // Key not found

		size--;
		if (prev != null) {
			prev.next = head.next;
		} else {
			buckets[bucketIndex] = head.next;
		}

		return head.value;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
