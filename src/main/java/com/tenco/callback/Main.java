package com.tenco.callback;

public class Main {
    public static void main(String[] args) {
        // 버튼 생성
        Button button = new Button("버튼");

        // 버튼 클래스 안에는 콜백 메소드가 설계 되어있다.
        // 콜백 메소드에 동작 정의를 외부에서 설계할 수 있다.
        // 익명 클래스 - 인터페이스를 클래스로 따로 확장하지 않고
        // 바로 클래스로 정의해서 사용할 수 있다.
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                // 구현 클래스로 만든거임
                // 다시 돌아와서 호출 되었다.(콜백 메소드 설계)
                System.out.println(">>> 내 맘대로 콜백 메소드 정의 <<<");
                System.out.println(event);
            }
        });

        // 버튼 객체의 click() 메소드가 호출됨
        button.click("메시지 전달 : click1");
        button.click("또 콜백 메소드 호출");

    } // end of class
}

// 1. 어떠한 클래스에 콜백 메소드를 구현하고 싶다면
// 2. 먼저 자식의 휴대폰을 만든다. () << 인터페이스 설계(전화, 메세지 기능만들기)
// 3. 부모 클래스가 있어야 자식 클래스를 태어나게 할수있다.(main 클래스로 설계함 main 에서 main() 사용)
// 4, 부모가 자식을 생성할 때 휴대폰도 가질 수 있게 설계하기
// 5. 자식의 기능이 click() 메소드가 일어난다면 자동으로 부모에게 메세지를 갈수 있도록 콜백 메소드를 button에서 정의함.
