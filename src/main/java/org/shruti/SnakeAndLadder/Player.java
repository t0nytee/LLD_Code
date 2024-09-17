package org.shruti.SnakeAndLadder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class Player {

    int id;
    String name;
    int pos;

}
