package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void isPasswordEqual() {

        boolean respuesta=UserUtils.isPasswordEqual("jaider","jaider");
        assertTrue(respuesta);
    }

}
