package myapp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {
  @BeforeAll
  static void beforeAll(){
    System.out.println("CalcTest 開始");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("CalcTest 終了");
  }

  @BeforeEach
  void beforeEach(){
    System.out.println("CalcTestのテストメソッドをひとつ開始");
  }

  @AfterEach
  void afterEach(){
    System.out.println("CalcTestのテストメソッドをひとつ終了");
  }

  @Test
  void testPlus(){
    System.out.println("testPlus を実行: 2 + 3 = 5");
    Calc calc = new Calc(2);

    assertEquals(5,calc.plus(3),"2 + 3 = 5 の検証");
  }

  @Test
  void testMinus(){
    System.out.println("testMinus を実行: 5 - 2 = 3");
    Calc calc = new Calc(5);

    assertEquals(3,calc.minus(2),"5 - 2 = 3 の検証");
  }
}
