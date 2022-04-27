# java의 interface
## 클래스의 설계도 역할
* 클래스를 설계할때 method 들을 설계하고, method의 이름을 정의하고, return type을 정의하고, argument를 정의하고 
하는 일들은 유사한 기능을 하는 클래스들 끼리는 공통으로 일치시켜야 하는 경우가 많다.
* 이때 interface에 미리 method의 모양(원형, prototype)을 만들어 두고, 
클래스를 선언할때 interface를 implements 하도록 규칙을 정해 버린다.
* interface를 implemets 한 클래스는 interface에 정의된 method를 반드시 만들어야 한다.

## 클래스의 다형성
* 인터페이스로 객체를 선언하고, 클래스의 생성자를 호출하여 인스턴스로 생성하는 방식의 코드를 사용하자
* 만약 사용하고자 하는 클래스를 변경하고 싶으면, 클래스의 생성자만 변경해 주면 모든 코드는
그대로 유지하면서 테스트를 할 수 있다.