## Stream의 구성요소 Revisited
- 종결 처리를 통해 최종 결과물을 도출
- 종결 처리의 실행이 필요할 때 중간 처리들도 비로소 실행 (lazy Evaluation)

## Max / Min / Count Stream 안의 데이터의 최대값 / 최소값 / 개수
```java
Optional<T> max(Comparator<? super T> comparator);
Optional<T> min(Comparator<? super T> comparator);
long count();
```
- max - Stream 안의 데이터 중 최대값을 반환. Stream이 비어있다면 빈 Optional을 반환
- min - Stream 안의 데이터 중 최소값을 반환. Stream이 비어있다면 빈 Optional을 반환
- count - Stream 안의 데이터의 개수를 반환

