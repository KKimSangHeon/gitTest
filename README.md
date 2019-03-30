4. 형인자 메소드의 추가설명
즉 
public static <K,V> HashMap<K, V> newInstance() {
	return new HashMap<K,V>();
}

newInstance() 메소드를 통해 Map<String, List<String>> m = new HashMap<String, List<String>>();
대신 Map<String, List<String>> m = HashMap.getInstance(); 가 가능해짐
(자바 1.7 부터는 Map<String, List<String>> myMap = new HashMap<>();를 지원하긴
