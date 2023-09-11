package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScramblerTest {

    @Test
    void main() {
        Main scrambler = new Main();
        System.out.println(scrambler.Scramble("Random"));
        System.out.println(scrambler.Scramble("SoftwareDesign"));
    }
}