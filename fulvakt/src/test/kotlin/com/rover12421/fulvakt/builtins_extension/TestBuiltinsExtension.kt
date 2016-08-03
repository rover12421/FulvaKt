package com.rover12421.fulvakt.builtins_extension

import org.junit.Assert
import org.junit.Test
import java.io.File

/**
 * Created by rover12421 on 7/30/16.
 */
class TestBuiltinsExtension {
    @Test
    fun test_arrayOfDefaultValue() {
        val array = Array(10, {"arrayOfDefaultValue"})
        Assert.assertArrayEquals(array, arrayOfDefaultValue(10, "arrayOfDefaultValue"))
    }

    @Test
    fun test_null_plus() {
        val str:String? = null
        val roots = File.listRoots()
        Assert.assertEquals("nullnull", str + str)
        Assert.assertEquals("null123", str + "123")
        Assert.assertEquals("123null", "123" + str)
        Assert.assertEquals("/null", roots[0] + str)
    }
}