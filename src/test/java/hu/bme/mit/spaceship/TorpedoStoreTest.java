package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_InvalidAmount_ThrowsException() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act & Assert
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> store.fire(2));
    }

    @Test
    void fire_EmptyStore_ThrowsException() {
        // Arrange
        TorpedoStore store = new TorpedoStore(0);
    
        // Act & Assert
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> store.fire(1));
    }
}
