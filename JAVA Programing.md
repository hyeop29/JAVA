## JAVA의 태동
  - 플랫폼 독립적인 언어 필요 : 기존 언어로 작성된 프로그램은 플랫폼 간 호환성이 없어, 플랫폼이 달라지면 소스를 다시 컴파일하거나 프로그램을 다시 작성해야 함.
  
  - 플랫폼 독립성의 비밀 : JAVA로 작성된 프로그램은 사실 '자바 가상 기계'라는 프로그램의 입력 파일에 지나지 않음 >> '자바 가상 기계' 자체는 플랫폼 종속적이지만 JAVA 프로그램은 '자바 가상
                        기계' 만 설치되어 있으면 어디서든 실행됨.
                      
                      
## 객체지향 프로그래밍이란?
  - 실세계에서 발생하는 일을 보다 쉽게 프로그래밍하기 위해, 객체 중심의 프로그래밍 언어 탄생
  
  - 갹체지향 프로그램의 장점 : 소프트웨어 생산성 향상 -> 프로그램을 빨리 찍어낼 수 있게 해준다.
                             why? 소프트웨어의 '재사용'과 '부분 수정'을 용이하게 하여, 소프트웨어를 처음부터 작성하는 부담을 대폭 줄임으로써 생산성 크게 향상
                            객체지향 언어의 상속, 다향성, 객체, 캡슐화 등 개념들이 소프트웨어 재사용을 쉽게 하는 효과가 있다.
                     
  - 객체지향 언어의 특성
    
    1) 캡슐화
       데이터와 관련 함수를 하나로 결합.  
       데이터를 외부로부터 숨김(보호, 보안, 접근 제어) -> 외부에서는 비공개 데이터에 직접  접근하거나 메소드의 구현 세부를 알 수 없음.
       
    2) 상속
       상위 클래스의 특성을 하위 클래스가 물려받음.  
       JAVA는 다중 상속을 불허함.  
       장점 : 상속을 받음으로써 누군가 만든 기능에 새로운 특성을 추가해, 새로운 기능을 만들 수 있다 -> 소프트웨어 생산성 향상
       
  - 클래스와 객체
    
    1) 클래스
      객체를 만들기 위한 설계도  
      객체의 속성(데이터, 변수)과 행위(메소드) 선언  
      class에 설장자(mutator)와 접근자(accessor)을 구현하는 이유 : 클래스에서 선언된 private 변수는 다른 클래스에서 접근할 수 없기 때문에,  접근하기 위한 메서드를 선언하여 사용할 수 있게하기 위함
      
    2) 객체
      클래스라는 설계도에 따라 만들어낸 실체  
      객체 생성 과정 : 객체에 대한 레퍼런스 변수선언 -> 객체 생성  
      객체를 생성할 때 c언어와 다르게 java는 new라는 키워드를 사용해야함.  
      자바는 객체가 필요 없어지면 스스로 소멸시킨다. -> 소멸자가 필요가 없다!
      
- example
 ```java
    class Person{    //Person class
    String name;
    int age;

    String getName(){
        return name;
    }
}

public class EX {
    public static void main(String[] args){
        Person p = new Person();
        /*객체 사용*/
        p.name = "Lee";
        p.age = 24;
        System.out.println(p.getName());
    }
}
```
## 메소드란?

  - 메소드는 C/C++의 함수와 동일
  - JAVA의 모든 메소드는 반드시 클래스 안에 있어야 함(캡슐화 원칙)
  
  - JAVA의 인자 전달 방식
  
    - 기본 타입 전달 : 값에 의한 (call by value)
      + 변수 값이 복사되어 전달 (메소드는 독립해서 돌아가게 하기 위해)
      + 메소드의 매개 변수가 변경되어도 당연히 실인자 값은 변경되지 않음
    - 객체/배열 전달 : 레퍼런스에 의한 호출 (call by reference)
      + 레퍼런스 변수 값이 복사되어 전달
      + 객체/배열이 통째로 복사되어 전달되는 것 아님!
      + 레퍼런스 변수를 통해 객체를 변경하면 당연히 실제 객체도 변경 (메소드에서 원본 값을 변경하고 싶기 때문에)
    - 객체 소멸
      + new에 의해 생성된 객체 메모리를 자바 가상 기계로 되돌려 주는 행위
      + 소멸된 객체 공간은 가용 메모리에 포함
      - 자바 응용프로그램에서 임의로 객체 소멸할 수 없음
      + 객체 소멸은 가상 기계의 고유한 역할(C/C++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제)
      + 가비지 : 가리키는 레퍼런스가 하나도 없어 더 이상 사용할 수 없는 객체
      + 가비지 컬력션 : 자바 가상 기계의 가비지 컬렉터가 자동으로 가비지를 수집하여 반환

## 접근 지정자
  - 클래스에 접근 할 수 있는가?
    + 클래스의 유일한 용도는 객체 생성
    + 따라서, '이 클래스에 new를 하여 객체를 생성할 수 있는가?'를 뜻함
    + class 선언 전에 public이 없다면 같은 패키지에 포함된 클래스만 접근 가능, 반면 public이 있는 경우 다른 패키지에서도 접근 가능
  - 생성된 객체의 멤버에 접근할 수 있는가?
    + 멤버변수의 용도는 읽거나 쓰기
    + 멤버함수(메소드)의 용도는 실행시키기
    + 따라서,'이 객체의 필드에 읽거나 쓸 수 있는가 혹은 이 객체의 메소드를 실행시킬 수 있는가?'를 뜻함
  - 멤버 접근 지정자
    + default 접근 지정자(접근 지정자 생략) : 같은 패키지의 클래스 멤버에만 접근 가능
    + public 멤버 : 다른 패키지에서도 접근 가능
    + private 멤버 :  같은 패키지에서도 접근 불가
    + protected 멤버 : 같은 패키지에서만 접근 가능하나, 상속받은 하위 클래스라면 다른 패키지에서도 

## Static 멤버
  
  
## final 키워드
  - final 큳래스 : 더이상 클래스 상속 불가능  ex) final class finalex{ .... }
  - final 메소드 : 더 이상 오버라이딩 불가능
  - final 변수 : 더 이상 값이 변할 수 없는 변수
    + 상수 선언할 때 사용  ex) public static final double PI = 3.141592653589793;
    + 상수는 선언 시 초기 값 지정하고, 실행 중 변경 불가


## 인터페이스
  -JAVA의 인터페이스
    + 극단적으로 '형식'만 남긴 클래스 : 껍데기만 남은 클래스
    + 멤버 변수 정의 불가 : 상수는 정의 가능
    + 모든 메소드가 추상 메소드
  - 인터페이스 선언 : interface 키워드로 선언
  ```java
  interface Clock { 
    public static final int ONEDAY = 24 ;
    abstract public int getMinute() ;
    int getHour() ;  //abstract public 생략
  }
  ```
  
  - 필요성
    + JAVA는 '다이아오든 문제'를 피하기 위해 다중 상속을 미지원 하지만, 다중 상속이 필요한 경우 발생 -> 알맹이 없는 클래스인 인터페이스 정의, 인터페잇는 다중 상속 허용
  
  - 인터페이스구현
    + implements 키워드 사용
    + 여러 개의 인터페이스 동시 구현 가능
    + 상속과 구현이 동시에 가능
    
## 예외 처리
  -오류  
   프로그램이 실행 중 어떤 원인에 의해 오동족하거나 비정상 종료되는 경우

  -예외  
   복구 가능한 덜 심각한 오류  
   예외가 발생하면 잘 처리하여 복구하기를 권장함
  -C언어와 JAVA의 예외처리 비교  
   C언어 : 표준 방법은 정의되어 있지 않으나, 리턴 값으로 예외 상황을 알려주는 방식 주로 사용  
   JAVA : Try-catch를 통한 표준 방법 지원, 예외 정보를 담고 있는 객체를 생성하여 전달하는 방식

  -예외 처리 방법  
   예외 처리문 : try-catch-finall문 사용, finally 블록은 생략 가능  
   예외가 발생하지 않으면 try문만 사용, try블록에서 예외가 발상한 경우 catch문 방문  
   예외 처리를 하는 것 보다 그 전에 다른 코드들로 확인해주는게 더 좋다  
   ex) 나누기 할 두 정수를 입력 받을 때  계산하기 전, 입력 받은 수 중 분모에 0이 있는지 확인하는 과정

 ## 추상 메소드와 추상 클래스
  - 추상 메소드
    + 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드를 의미  
    + 오버라이딩 : 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성  
                  슈퍼 클래스에 구현된 메소드를 무시하고 서브 클래스에서 새로운 기능의 메소드를 재정의하고자 함
    + 오버로딩 : 같은 클래스나 상속 관계에서 동일한 이름의 메소드 중복 작성  
                이름이 같은 여러 개의 메소드를 중복 정의하여 사용의 편리성 향상(ex: 이름은 같은나 전달 되는 인수의 자료형을 다르게 받기)  
    + 자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함
    + 사용 이유 : 모듈처럼 중복되는 부분이나 공통적인 부분은 미리 다 만들어진 것을 사용하고, 이를 받아 사용하는 쪽에서는 자신에게 필요한 부분만을 재정의 하여 사용함으로써 생산성이 향상되고 배포 등이 쉬워지기 때문입니다.
    + 선언부만이 존제하며, 구현부는 작성되어 있지 않습니다. 작성되어 있지 않은 구현부를 자식 클래스에서 오버라이딩하여 사용하는 것

  - 추상 클래스 
    + 자바에서 하나 이상의 추상 메소드를 포함하는 클래스를 가르켜 추상 클래스라고 합니다.
    + 객체 지향 프로그래밍에서 중요한 특징인 다형성을 가지는 메소드의 집합을 정의할 수 있도록 해줍니다.
    + 반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야합니다.

## 스레드와 멀티태스킹
  - 멀티태스킹 개념 : 하나의 응용프로그램이 여러 개의 작업을 동시에 처리  
    
  - 스레드와 프로세스  
    + 공통점 : 순차적으로 실행되는 프로그램의 흐름
    + 차이점 : 프로세스는 독립된 실행 단위  
             
               
