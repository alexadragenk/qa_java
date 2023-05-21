package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test(expected = Exception.class)
    public void doesHaveManeReturnException() throws Exception {
        new Lion("Небинарный лев");
    }
    @Test
    public void getKittensShouldReturnCorrectValue() {
        Lion lion = new Lion(feline);
        int expectedCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedCount);
        int actualCount = lion.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }
    @Test
    public void getFoodShouldReturnPredatorFood() throws Exception {
        Lion lion = new Lion(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

}
