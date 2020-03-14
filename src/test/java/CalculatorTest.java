import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup(){
        System.out.println("Initial method...");
        this.calculator = new Calculator();
    }

    @Test
    public void shouldReturn11(){
        int i = 10;

        if(i == 10){
            i++;
        }else if(i > 0){
            i++;
        }

        Assert.assertEquals(i, 11);
    }


    @Test
    public void shouldSumTwoNumbers(){

        int a = 4, b = 4;

        int sum = calculator.sum(a, b);

        Assert.assertEquals(sum, a + b);
    }

    @Test
    public void shouldSubtractTwoNumbers(){

        int a = 4, b = 4;

        int sum = calculator.subtract(a, b);

        Assert.assertEquals(sum, a - b);
    }


    @Test
    public void shouldMultiplyTwoNumbers(){

        int a = 4, b = 4;

        int sum = calculator.multiply(a, b);
        Assert.assertEquals(sum, a * b);
    }


    @Test
    public void shouldDivideTwoNumbers(){

        int a = 4, b = 4;

        int sum = calculator.divide(a, b);

        Assert.assertEquals(sum, a / b);
    }


    @Test(expected = ArithmeticException.class)
    public void shouldNotDivideBy0(){

        int a = 4, b = 0;

        int sum = calculator.divide(a, b);

        Assert.assertEquals(sum, a / b);
    }
}
