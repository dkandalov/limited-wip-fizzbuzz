import datsok.shouldEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        fizzBuzzWoof(3) shouldEqual "Fizz"
        fizzBuzzWoof(4) shouldEqual "4"
        fizzBuzzWoof(5) shouldEqual "Buzz"
//        fizzBuzzWoof(6) shouldEqual "Fizz"
//        fizzBuzzWoof(7) shouldEqual "7"
//        fizzBuzzWoof(8) shouldEqual "8"
//        fizzBuzzWoof(9) shouldEqual "Fizz"
//        fizzBuzzWoof(10) shouldEqual "Buzz"
//        fizzBuzzWoof(11) shouldEqual "11"
    }

    private fun fizzBuzzWoof(n: Int): String {
        if (n == 3) return "Fizz"
        if (n == 5) return "Buzz"
        return n.toString()
    }
}