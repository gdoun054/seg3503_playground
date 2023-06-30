import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest{
    Fizzbuzz fizzbuzz = new Fizzbuzz();

  
  @Test
  void fizzbuzz1() {
    Fizzbuzz fb = new Fizzbuzz();
    Fizzbuzz expectedfizzbuzz = "fizz";
    assertEquals(expectedfizzbuzz, fb.fizzbuzz(3));
  }

  @Test
  void fizzbuzz2() {
    Fizzbuzz fb = new Fizzbuzz();
    Fizzbuzz expectedfizzbuzz = "buzz";
    assertEquals(expectedfizzbuzz, fb.fizzbuzz(5));
  }

  @Test
  void fizzbuzz3() {
    Fizzbuzz fb = new Fizzbuzz();
    Fizzbuzz expectedfizzbuzz = "7";
    assertEquals(expectedfizzbuzz, fb.fizzbuzz(7));
  }

  @Test
  void fizzbuzz4() {
    Fizzbuzz fb = new Fizzbuzz();
    Fizzbuzz expectedfizzbuzz = "buzz";
    assertEquals(expectedfizzbuzz, fb.fizzbuzz(10));
  }

  @Test
  void fizzbuzz5() {
    Fizzbuzz fb = new Fizzbuzz();
    Fizzbuzz expectedfizzbuzz = "fizzbuzz";
    assertEquals(expectedfizzbuzz, fb.fizzbuzz(15));
  }
}
