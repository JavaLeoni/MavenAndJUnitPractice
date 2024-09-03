package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    public BonusService bonusService;

    @BeforeEach
    void setUp() {
        bonusService = new BonusService();
    }

    @Test
    @DisplayName("Test expected message on negative value sales")
    void testExpectedMessageOnValueSales() {
        assertEquals("Incorrect value!", bonusService.getRes(-1.0));
    }

    @Test
    @DisplayName("Test unexpected message on negative value sales")
    void testNotExpectedMessageOnValueSales() {
        assertNotEquals("", bonusService.getRes(-2.0));
    }

    @Test
    @DisplayName("Test expected bonus on zero value sales")
    void testExpectedBonusOnZeroValueSales() {
        assertEquals("Incorrect value!", bonusService.getRes(0.0));
    }

    @Test
    @DisplayName("Test expected bonus on positive value sales")
    void testExpectedBonusOnPositiveValueSales() {
        assertEquals("150,00", bonusService.getRes(1500.0));
    }

    @Test
    @DisplayName("Test unexpected bonus on positive value sales")
    void testNotExpectedBonusOnPositiveValueSales() {
        assertNotEquals("150,0", bonusService.getRes(1500.0));
    }

    @AfterEach
    void tearDown() {
        bonusService = null;
    }
}