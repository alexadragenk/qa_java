package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;
    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }
    @Test
    public void getFamilyShouldReturnCorrectValue() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }
    @Test
    public void getKittensShouldReturn1() {
        int expectedCount = 1;
        Mockito.when(feline.getKittens(expectedCount)).thenReturn(expectedCount);
        int actualCount = feline.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }
    @Test
    public void getKittensShouldReturnCorrectValue() {
        int expectedCount = 1;
        int actualCount = feline.getKittens(expectedCount);
        Assert.assertEquals(expectedCount, actualCount);
    }
}