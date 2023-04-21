## NPE - NullPointerException 함정카드 같은 에러
- Null 상태인 오브젝트를 레퍼런스 할 때 발생
- Runtime error 이기 때문에 실행 전 까지는 발생 여부를 알기 쉽지 않음
- "[Null pointer를 발명한 것은] 나의 10억 불 짜리 실수였다. (I call it my billion-dollar mistake)" -토니 호어(Tony Hoare), 2009년 한 강연에서

## Optional 있을 수 도 있고 없을 수도 있다.
- Null일수도, 아닐 수도 있는 오브젝트를 담은 상자
```java
java.util.Optional<T>

Optional<String> maybeString = Optional.of("Hello world");
String string = maybeString.get();
```

## Optional 만드는 법
```java
public static <T> Optional<T> of (T value)
public static <T> Optional<T> empty()
public static <T> Optional<T> ofNullable(T value)
```
- of - Null 이 아닌 오브젝트를 이용해 Optional을 만들 때
- Empty - 빈 Optional을 만들 때
- ofNullable - Null인지 아닌지 알 지 못하는 오브젝트로 Optional을 만들 때

## Optional 안에 있는 값을 확인하고 꺼내는 법
```java
public boolean isPresent()
public T get()
public T orElse(T other)
public T orElseGet(Supplier<? extends T> supplier)
public <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X
```
- isPresent - 안의 오브젝트가 null 인지 아닌지 체크. Null이 아닐 시 true
- get - Optional 안의 값을 추출. Null이라면 에러
- orElse - Optional이 null이 아니라면 Optional 안의 값을, null이라면 other로 공급된 값을 리턴
- orElseGet - Optional이 null이 아니라면 Optional 안의 값을, null이라면 supplier로 공급되는 값을 리턴
- orElseThrow - Optional이 null이 아니라면 Optional 안의 값을, null 이라면 exceptionSupplier로 공급되는 exception을 던짐
