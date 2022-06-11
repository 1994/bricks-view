package com.github.onenine.amis;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class InputText {
    private String label;
    private String name;
}
