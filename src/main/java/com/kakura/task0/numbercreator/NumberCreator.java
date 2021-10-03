package com.kakura.task0.numbercreator;

import com.kakura.task0.customnumber.CustomNumber;

public class NumberCreator {

    public CustomNumber createNumber(Double number) {

        CustomNumber customNumber = new CustomNumber(number);

        return customNumber;
    }
}
