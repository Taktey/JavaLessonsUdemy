package com.javalessons.oop.gettersetterconstructorusinglombok;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Dog {
    private String name;
    private int age;
    private boolean agressive;
}
