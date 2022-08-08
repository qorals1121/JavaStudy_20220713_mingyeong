package j19_익명클래스.람다식;


@FunctionalInterface //람다식이라고 선언해줌 -> 두개 이상의 메소드 사용 불가 (무조건 하나만 사용가능)
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);

}
