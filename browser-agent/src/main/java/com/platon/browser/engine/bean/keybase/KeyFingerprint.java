
package com.platon.browser.engine.bean.keybase;

import lombok.Data;

@Data
public class KeyFingerprint extends ValueScore {
    private Integer algo;
    private Integer nbits;
}
