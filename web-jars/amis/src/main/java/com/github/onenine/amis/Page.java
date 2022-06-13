package com.github.onenine.amis;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Page {
    protected String title;
}
