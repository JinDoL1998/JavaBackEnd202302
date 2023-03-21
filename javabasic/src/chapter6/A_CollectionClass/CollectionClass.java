package chapter6.A_CollectionClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// Collection Framework
// 배열 형태의 데이터를 보다 편하게 사용할 수 있도록 해주는 클래스의 집합

public class CollectionClass {

	public static void main(String[] args) {
		
		// Set 클래스
		// 집합 - 중복을 허용하지 않고 순서가 없는 형태
		// 순서가 없기 때문에 index 사용 불가능
		
		// HashSet<E>: 중복을 허용하지 않고 순서가 없는 형태
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(4859);
		integerSet.add(123);
		integerSet.add(4859);
		integerSet.add(798);
		integerSet.add(798);
		integerSet.add(3564113);
		
		Iterator<Integer> iterator = integerSet.iterator();
		
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		for (Integer item: integerSet) {
//			System.out.println(item);
		}
		
		// TreeSet<E>: 중복을 허용하지 않고 순서가 없는 형태 + 정렬
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(4859);
		treeSet.add(123);
		treeSet.add(4859);
		treeSet.add(798);
		treeSet.add(798);
		treeSet.add(3564113);
		
		for (Integer item: treeSet) {
//			System.out.println(item);
		}
		
		System.out.println("=================================");
		
		// List
		// 데이터를 일렬로 나열한 구조
		// 순서가 존재하고 중복이 허용 (배열)
		
		// ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add(0, "banana");
		
		list.set(0, "BaNaNa");
		
		String removeItem = list.remove(1);
		
		System.out.println(removeItem);
		System.out.println(list.toString());
		
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		// LinkedList<E> : 순서가 존재하고 중복이 허용된 '배열' + 
		//                 각 요소가 이전 요소와 다음 요소의 주소를 같이 가지고 있음
		//                 검색속도가 빠름
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long startTime = System.currentTimeMillis();
		for (int integer = 0; integer < 1_000_000; integer++)
			arrayList.add(0, integer);
		long endTime = System.currentTimeMillis();
		
//		System.out.println("Array List 작업 시간 : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for (int integer = 0; integer < 1_000_000; integer++)
			linkedList.add(0, integer);

		Iterator<Integer> arrayIterator = linkedList.listIterator();
		Iterator<Integer> likedIterator = linkedList.listIterator();

		startTime = System.currentTimeMillis();
		while(arrayIterator.hasNext()) {
			arrayIterator.next();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Array List 작업 시간 : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		while(likedIterator.hasNext()) {
			likedIterator.next();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Linked List 작업 시간 : " + (endTime - startTime));
		
		endTime = System.currentTimeMillis();
		
		System.out.println("Linked List 작업 시간 : " + (endTime - startTime));
	
		// Lotto 응용
		Set<Integer> lotto = new TreeSet<>();
		
		while (lotto.size() < 6) {
			Random random = new Random();
			int randomNumber = random.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		
		System.out.println(lotto.toString());
		
	}

}