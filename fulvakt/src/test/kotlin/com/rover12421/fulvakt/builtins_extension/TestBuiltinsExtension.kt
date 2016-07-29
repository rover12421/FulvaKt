package com.rover12421.fulvakt.builtins_extension

import org.junit.Assert
import org.junit.Test

/**
 * Created by rover12421 on 7/30/16.
 */
class TestBuiltinsExtension {
    @Test
    fun test_arrayOfDefaultValue() {
        val array = Array(10, {"arrayOfDefaultValue"})
        Assert.assertArrayEquals(array, arrayOfDefaultValue(10, "arrayOfDefaultValue"))
    }
}