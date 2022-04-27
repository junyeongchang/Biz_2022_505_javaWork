# 객체지향
## 추상화
* 정보처리에 필요한 데이터를 저장할 변수를 하나의 그룹으로 선언하고, 항상 묶음으로 처리하는 것을 객체지향이라고 하는데
* 어떤 데이터가 필요하고, 어떤 데이터는 덜 필요한지를 판단하여 클래스를 선언하는 것

## 정보의 은닉
* 클래스영역에 선언되는 변수는 일반적으로 ```private``` 으로 선언한다.
* 다른 곳에서 클래스영역에 선언된 변수에 직접 접근하여 값을 변경하거나 하는 것을 방지하는 이유이다.

## 캡슐화
* 클래스에 선언된 method는 내부의 코드가 어떻게 작동되는지 몰라도, 보통 이름만 보고 어떤 결과를 보여주는지 알수 있다.
* 클래스에 선언된 method를 호출하여 문제를 해결해야 할때 내부의 코드에는 관심을 갖지 않아도 된다.

## 상속(extends, 확장)
* 잘 작성된 클래스(보통 Service 클래스)의 기능을 이어받아 새로운 클래스를 선언하고, 
필요에 따라 일부 method를 재정의(Override) 하여 기능을 추가하는 방법
* method를 재정의 하는 것은 기존의 클래스의 코드들을 재활용하면서 일부 기능을 확장하는 것이다.
## Override : methode의 재정의
* 상속받은 클래스의 일부 method의 코드를 새로 작성 하여 기능을 추가하거나, 다른 연산을 수행하도록 하는 것
* 보통은 상속의 한가지 특징으로 같이 생각한다.

## OverLoading
* 한 클래스내에서는 같은 이름의 변수, method를 중복하여 선언할 수 없다.
* 하지만, method의 경우 argument의 개수, type, 순서가 다를 경우 같은 이름의 method를 중복하여 선언 할 수 있다.