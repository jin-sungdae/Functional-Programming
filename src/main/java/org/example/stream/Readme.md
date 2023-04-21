## 스트림이란? 
## What is Stream?
- 데이터의 흐름
- 컬렉션(Collection) 형태로 구성된 데이터를 람다를 이용해 간결하고 직관적으로 프로세스하게 해줌
- For, while 등을 이용하던 기존 loop을 대체
- 손쉽게 병렬 처리를 할 수 있게 해줌

## Filter
- 만족하는 데이터만 걸러내는데 사용
- Predicat에 true를 반환하는 데이터만 존재하는 stream을 리턴
```java
Stream<T> filter(Predicate<? super T> predicate);
```

## Map
- 데이터를 번형하는데 사용
- 데이터에 해당 함수가 적용된 결과물을 제공하는 stream을 리턴
```java
<R> Stream<R> map(Function<? super T, ? extends R> mapper);
```

## Sorted
- 데이터가 순서대로 정렬된 stream을 리턴
- 데이터의 종류에 따라 Comparator가 필요할 수 있음
```java
Stream<T> sorted();
Stream<T> sorted(Comparator<? super T> comparator);
```

## Distinct
- 중복되는 데이터가 제거된 stream을 리턴
```java
Stream<T> distinct();
```