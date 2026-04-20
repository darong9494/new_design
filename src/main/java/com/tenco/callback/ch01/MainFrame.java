package com.tenco.callback.ch01;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements IButtonCallback {

    private int count = 0;
    private JLabel label;

    public MainFrame() {
        setSize(300, 200);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("현재 숫자: " + count);
        label.setFont(new Font("맑은 고딕", Font.BOLD, 25));

        add(label);
        setVisible(true);

        // 자식 객체 생성
        SubFrame subFrame = new SubFrame(this::clickPlusButton);
    }

    // 콜백 메소드 오버라이딩 : 누군가가(자식)이 메소드를 대신 호출한다.
    @Override
    public void clickPlusButton() {
        count++;
        label.setText("현재 숫자 : " + count);
    }

    // 테스트 코드
    public static void main(String[] args) {
        new MainFrame();
    }
}
