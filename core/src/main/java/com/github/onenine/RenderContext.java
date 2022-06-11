package com.github.onenine;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RenderContext {
    private IPage page;
}
