## 메서드 레퍼런스 (Method Reference)
- 기존에 이미 선언되어 있는 메서드를 지정하고 싶을때
- ::오퍼레이터 사용
- 생략이 많기 때문에 사용할 메서드의 매개변수의 타입과 리턴 타입을 미리 숙지해야함
---
## 메서드 레퍼런스의 4가지 케이스

1. ClassName::staticMethodName : 클래스의 static Method를 지정할 때
2. objectName::instanceMethodName : 선언 된 객체의 instance method를 지정할 때
3. ClassName::instanceMethodName : 객체의 instance method를 지정할 때
4. ClassName::new : 클래스의 constructor를 지정할 때
---
## 메서드 레퍼런스 1, 2번 케이스
- ClassName::staticMethodName
- 클래스의 static method (정적 메서드)를 지정할 때

```java
Function<String, Integer> str2int = Integer::parseInt;
int five = str2int.apply("5");
```
- objectName::instanceMethodName
- 이미 선언되어 있는 객체의 instance method를 지정할 때
```java
String str = "hello";
Predicate<String> equalsToHello = str::equals;
boolean helloEqualsWorld = equalsHello.test("world");
```
- 해당 클래스의 인스턴스를 매개변수(parameter)로 넘겨 메서드를 실행해주는 함수
```java
Function<String, Integer> strLength = String:: length;
int length = strLength.apply("Hello world!");

BiPredicate<String, String> strEquals = String::equals;
boolean result = strEquals.test("hello", "world");
```