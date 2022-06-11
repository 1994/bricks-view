package com.github.onenine;

public interface IPage {

    default ITemplate template() {
        return new BlankTemplate();
    }

    IData data();
}
