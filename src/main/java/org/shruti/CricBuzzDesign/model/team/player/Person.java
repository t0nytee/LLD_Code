package org.shruti.CricBuzzDesign.model.team.player;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {

    private String name;
    private int age;
    private String address;
}
