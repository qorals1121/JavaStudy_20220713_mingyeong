package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<K, V> { // T = type, E = elements type이 더 상위임.
	private K key;
	private V value;
}
