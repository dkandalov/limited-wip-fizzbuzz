import kotlincommon.test.shouldEqual
import org.junit.jupiter.api.Test

class FizzBuzzWoofTests {
    @Test fun `convert number to FizzBuzzWoof string`() {
        fizzBuzzWoof(1) shouldEqual "1"
        fizzBuzzWoof(2) shouldEqual "2"
        fizzBuzzWoof(3) shouldEqual "Fizz"
        fizzBuzzWoof(4) shouldEqual "4"
        fizzBuzzWoof(5) shouldEqual "Buzz"
        fizzBuzzWoof(6) shouldEqual "Fizz"
        fizzBuzzWoof(7) shouldEqual "Woof"
        fizzBuzzWoof(8) shouldEqual "8"
        fizzBuzzWoof(9) shouldEqual "Fizz"
        fizzBuzzWoof(10) shouldEqual "Buzz"
        fizzBuzzWoof(3 * 5) shouldEqual "FizzBuzz"
        fizzBuzzWoof(3 * 7) shouldEqual "FizzWoof"
        fizzBuzzWoof(5 * 7) shouldEqual "BuzzWoof"
        fizzBuzzWoof(3 * 5 * 7) shouldEqual "FizzBuzzWoof"
    }
}

fun fizzBuzzWoof(n: Int): String {
    if (n.rem(3) == 0 && n.rem(5) == 0 && n.rem(7) == 0) return "FizzBuzzWoof"
    else if (n.rem(3) == 0 && n.rem(7) == 0) return "FizzWoof"
    else if (n.rem(5) == 0 && n.rem(7) == 0) return "BuzzWoof"
    else if (n.rem(3) == 0 && n.rem(5) == 0) return "FizzBuzz"
    else if (n.rem(3) == 0) return "Fizz"
    else if (n.rem(5) == 0) return "Buzz"
    else if (n.rem(7) == 0) return "Woof"
    else return n.toString()
}
