package Basic_Data_Structures_Course;

import java.util.*;

public class L15_HashMap<K, V> {

	private class HMNode {

		K key;
		V Value;

		public HMNode(K key, V Value) {
			this.key = key;
			this.Value = Value;
		}

		public String toString() {
			return this.key + "@" + this.Value;
		}
	}

	private LinkedList<HMNode>[] bucketArray;
	private int size;

	public L15_HashMap() {
		this(5);
	}

	public L15_HashMap(int cap) {

		this.bucketArray = new LinkedList[cap];
		this.size = 0;

		for (int i = 0; i < bucketArray.length; i++) {
			bucketArray[i] = new LinkedList<HMNode>();
		}
	}

	public void put(K key, V Value) {

		int bi = hashFunction(key);

		LinkedList<HMNode> bucket = bucketArray[bi];

		int fi = findInBucket(bucket, key);

		if (fi == -1) {
			HMNode nn = new HMNode(key, Value);
			this.size++;
			bucket.addLast(nn);
		} else {

			HMNode n = bucket.get(fi);
			n.Value = Value;
		}

		
		double threshold = (double) this.size / this.bucketArray.length;
		if (threshold > 3.0) {
			reshash();
		}
	}

	private void reshash() {

		LinkedList<HMNode>[] oba = this.bucketArray;

		this.bucketArray = new LinkedList[2 * oba.length];

		for (int i = 0; i < bucketArray.length; i++) {
			bucketArray[i] = new LinkedList<HMNode>();
		}

		for (int i = 0; i < oba.length; i++) {
			LinkedList<HMNode> bucket = oba[i];

			for (int j = 0; j < bucket.size(); j++) {
				HMNode node = bucket.get(j);
				put(node.key, node.Value);
			}
		}
	}

	private int findInBucket(LinkedList<L15_HashMap<K, V>.HMNode> bucket, K k) {

		for (int i = 0; i < bucket.size(); i++) {
			HMNode pn = bucket.get(i);
			if (pn.key.equals(k)) {
				return i;
			}
		}

		return -1;
	}

	private int hashFunction(K key) {

		int hc = key.hashCode();
		int bi = Math.abs(hc) % bucketArray.length;
		return bi;
	}

	public V get(K key) {

		int bi = hashFunction(key);
		LinkedList<HMNode> bucket = bucketArray[bi];

		int fi = findInBucket(bucket, key);

		if (fi == -1) {
			return null;
		} else {
			return bucket.get(fi).Value;
		}

	}

	public boolean containsKey(K key) {

		int bi = hashFunction(key);

		LinkedList<HMNode> bucket = bucketArray[bi];

		int fi = findInBucket(bucket, key);
		if (fi == -1) {
			return false;
		} else {
			return true;
		}

	}

	public V remove(K key) {

		int bi = hashFunction(key);

		LinkedList<HMNode> bucket = bucketArray[bi];
		int fi = findInBucket(bucket, key);

		if (fi == -1) {
			return null;
		} else {
			HMNode node = bucket.remove(fi);
			this.size--;
			return node.Value;
		}

	}

	// returns all the keys present in the hashmap in an arraylist
	public ArrayList<K> keySet() {

		ArrayList<K> keys = new ArrayList<>();

		for (int i = 0; i < bucketArray.length; i++) {

			LinkedList<HMNode> bucket = bucketArray[i];

			for (int j = 0; j < bucket.size(); j++) {
				HMNode node = bucket.get(j);
				keys.add(node.key);
			}
		}

		return keys;

	}

	public void display() {

		System.out.println("-----------------------");

		for (int i = 0; i < bucketArray.length; i++) {

			LinkedList<HMNode> bucket = bucketArray[i];
			System.out.print("B" + i + " => ");
			for (int j = 0; j < bucket.size(); j++) {
				HMNode node = bucket.get(j);
				System.out.print(node + ", ");
			}

			System.out.println(".");
		}

		System.out.println("-----------------------");
	}
}
