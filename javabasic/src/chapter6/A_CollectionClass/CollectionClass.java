package chapter6.A_CollectionClass;

import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Collection Framework
 * 배열형태의 데이터를 보다 편하게 사용할 수 있도록 해주는 클래스의 집합
 */

public class CollectionClass {

	public static void main(String[] args) {
		
//		Set클래스
//		집합, 중복을 허용하지 않고 순서가 없는 형태
//		순서가 없기 때문에 인덱스 사용 불가능
//		hashSet : 중복 허용하지 않고 순서가 없는 형태
//		TreeSet : 
		
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(4);
		integerSet.add(2);
		integerSet.add(2);
		integerSet.add(1);
		integerSet.add(7);
		integerSet.add(5);
		integerSet.add(7);
		
		//iterator로 접근할 때는 일반적으로 while문을 쓴다
		Iterator<Integer> iterator = integerSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println();
		
		for(int items : integerSet) {
			System.out.println(items);
		}
		
		System.out.println(integerSet);
		
//		TreeSet : 중복을 허용하지 않고 순서가 없는 형태 + 정렬 
		
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(549);
		treeSet.add(5654);
		treeSet.add(235);
		treeSet.add(715);
		treeSet.add(54);
		treeSet.add(76854);
		System.out.println();
		for (int treeItem : treeSet) {
			System.out.println(treeItem);
		}
		
		System.out.println("===================");
		
//		List 데이터를 일렬로 나열한 구조
//		순서가 존재하고 중복이 허용된다
		
//		ArrayList : 순서가 존재하고 중복이 허용된 '배열'
		List<String> list = new ArrayList<String>();
		
		
		list.add("apple");
		list.add(0, "banana");
		System.out.println(list);
		
		list.set(0, "melon");
		
		for(int i =0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.remove(1));
		System.out.println(list);
		
//		LinkedList<E> : 순서존재, 중복허용 +  각 요소가 이전 요소와 다음 요소의 주소를 같이 가지고 있다.
//		검색속도가 빠르다 ? 난 더 느리다고 배웠는데? 검색시간이 빠른게 아니라 삽입에 걸리는 시간이 빠른거 아닌가
		
		List<Integer> arrayList =  new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
//		long startTime = System.currentTimeMillis();
//		for(int integer = 0 ; integer < 100000 ; integer++) {
//			arrayList.add(0,integer);
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("Arraylist 작업시간" + (endTime - startTime));
//		
//		
//		startTime = System.currentTimeMillis();
//		for(int integer = 0 ; integer < 100000 ; integer++) {
//			linkedList.add(0,integer);
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("linkedList 작업시간" + (endTime - startTime));
//		
//	
		System.out.println("===================");
		
//		Map<K, V> 
//		key와 value가 하나의 쌍으로 저장되는 구조
//		순서가 존재하지 않고, 단 key를 사용해서 특정한 value 를 가져 올 수 있음
		
//		HashMap<E,E>
		
		
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("Key", "value");
		hashMap.put("apple", "사과");
		
		System.out.println(hashMap.get("apple"));
				
				
		
		
	}

}
