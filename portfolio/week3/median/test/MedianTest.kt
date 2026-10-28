// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of 1 element list" {
        median(listOf(5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median of 2 element list" {
        median(listOf(2.0f, 8.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median of 3 element unsorted list" {
        median(listOf(9.0f, 1.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median of 4 element list" {
        median(listOf(1.0f, 4.0f, 7.0f, 10.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }
})
