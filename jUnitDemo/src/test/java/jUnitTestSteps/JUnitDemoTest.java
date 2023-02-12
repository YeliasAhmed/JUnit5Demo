package jUnitTestSteps;

import jUnitPractice.JUnitDemo;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;


public class JUnitDemoTest {

    JUnitDemo jUnitDemo;

    @BeforeEach
    void init(){
        jUnitDemo = new JUnitDemo();
    }

    class AddClass{
        @Test
        @DisplayName("Add")
        void test() {
            assertEquals(1, jUnitDemo.add(0, 1) , "This test should be passed");
        }

    }


    @Test
    @DisplayName("Sub")
    void subtraction(){

        assertEquals(1, jUnitDemo.sub(2,1), "return correct answer");
    }

    @Test
    @DisplayName("divide by zero")
    void divideTest(){
        assertThrows(ArithmeticException.class,()-> jUnitDemo.divide(1, 0), "divide by zero should throw" );

    }
    @Test
    void areaOfCircle() {
        assertEquals(28.27433388230813, jUnitDemo.computeArea(3),"return correct result area of a circle");

    }
    @Test
    @DisplayName("Using assertAll annotation")
    void multiply(){
        assertAll(
                ()-> assertEquals(4, jUnitDemo.mul(2,2), "Correct"),
                ()-> assertEquals(2, jUnitDemo.mul(2, 1), "correct"),
                ()-> assertEquals(5, jUnitDemo.mul(1, 5), "incorrect")
        );
    }

}

