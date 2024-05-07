package com.example.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class HelloLombok {
    private final String hello; // final : 뒤에 따라오는 자료형과 변수 등을 변경할 수 없게 만드는 키워드 => setter x
    private final int lombok;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("hello", 5);


        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}