package com.rover12421.fulvakt.builtins_extension

import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.io.OutputStream
import java.io.Writer

/**
 * Created by rover12421 on 7/25/16.
 *
 * 针对 Kotlin_builtins 的一些补充,可以增加方便的使用kotlin
 */

/**
 * and
 */
infix fun Char.and(other: Char): Int = this.toInt().and(other)
infix fun Char.and(other: Byte): Int = this.toInt().and(other)
infix fun Char.and(other: Short): Int = this.toInt().and(other)
infix fun Char.and(other: Int): Int = this.toInt().and(other)
infix fun Char.and(other: Long): Long = this.toLong().and(other)

infix fun Byte.and(other: Char): Int = this.toInt().and(other)
infix fun Byte.and(other: Byte): Int = this.toInt().and(other)
infix fun Byte.and(other: Short): Int = this.toInt().and(other)
infix fun Byte.and(other: Int): Int = this.toInt().and(other)
infix fun Byte.and(other: Long): Long = this.toLong().and(other)

infix fun Short.and(other: Char): Int = this.toInt().and(other)
infix fun Short.and(other: Byte): Int = this.toInt().and(other)
infix fun Short.and(other: Short): Int = this.toInt().and(other)
infix fun Short.and(other: Int): Int = this.toInt().and(other)
infix fun Short.and(other: Long): Long = this.toLong().and(other)

infix fun Int.and(other: Char): Int = this.and(other.toInt())
infix fun Int.and(other: Byte): Int = this.and(other.toInt())
infix fun Int.and(other: Short): Int = this.and(other.toInt())
infix fun Int.and(other: Long): Long = other.and(this)

infix fun Long.and(other: Char): Long = this.and(other.toLong())
infix fun Long.and(other: Byte): Long = this.and(other.toLong())
infix fun Long.and(other: Short): Long = this.and(other.toLong())
infix fun Long.and(other: Int): Long = this.and(other.toLong())

/**
 * or
 */
infix fun Char.or(other: Char): Int = this.toInt().or(other)
infix fun Char.or(other: Byte): Int = this.toInt().or(other)
infix fun Char.or(other: Short): Int = this.toInt().or(other)
infix fun Char.or(other: Int): Int = this.toInt().or(other)
infix fun Char.or(other: Long): Long = this.toLong().or(other)

infix fun Byte.or(other: Char): Int = this.toInt().or(other)
infix fun Byte.or(other: Byte): Int = this.toInt().or(other)
infix fun Byte.or(other: Short): Int = this.toInt().or(other)
infix fun Byte.or(other: Int): Int = this.toInt().or(other)
infix fun Byte.or(other: Long): Long = this.toLong().or(other)

infix fun Short.or(other: Char): Int = this.toInt().or(other)
infix fun Short.or(other: Byte): Int = this.toInt().or(other)
infix fun Short.or(other: Short): Int = this.toInt().or(other)
infix fun Short.or(other: Int): Int = this.toInt().or(other)
infix fun Short.or(other: Long): Long = this.toLong().or(other)

infix fun Int.or(other: Char): Int = this.or(other.toInt())
infix fun Int.or(other: Byte): Int = this.or(other.toInt())
infix fun Int.or(other: Short): Int = this.or(other.toInt())
infix fun Int.or(other: Long): Long = other.or(this)

infix fun Long.or(other: Char): Long = this.or(other.toLong())
infix fun Long.or(other: Byte): Long = this.or(other.toLong())
infix fun Long.or(other: Short): Long = this.or(other.toLong())
infix fun Long.or(other: Int): Long = this.or(other.toLong())

/**
 * shl
 */
infix fun Char.shl(other: Char): Int = this.toInt().shl(other)
infix fun Char.shl(other: Byte): Int = this.toInt().shl(other)
infix fun Char.shl(other: Short): Int = this.toInt().shl(other)
infix fun Char.shl(other: Int): Int = this.toInt().shl(other)
infix fun Char.shl(other: Long): Int = this.toInt().shl(other)

infix fun Byte.shl(other: Char): Int = this.toInt().shl(other)
infix fun Byte.shl(other: Byte): Int = this.toInt().shl(other)
infix fun Byte.shl(other: Short): Int = this.toInt().shl(other)
infix fun Byte.shl(other: Int): Int = this.toInt().shl(other)
infix fun Byte.shl(other: Long): Int = this.toInt().shl(other)

infix fun Short.shl(other: Char): Int = this.toInt().shl(other)
infix fun Short.shl(other: Byte): Int = this.toInt().shl(other)
infix fun Short.shl(other: Short): Int = this.toInt().shl(other)
infix fun Short.shl(other: Int): Int = this.toInt().shl(other)
infix fun Short.shl(other: Long): Int = this.toInt().shl(other)

infix fun Int.shl(other: Char): Int = this.shl(other.toInt())
infix fun Int.shl(other: Byte): Int = this.shl(other.toInt())
infix fun Int.shl(other: Short): Int = this.shl(other.toInt())
infix fun Int.shl(other: Long): Int = this.shl(other.toInt())

infix fun Long.shl(other: Char): Long = this.shl(other.toInt())
infix fun Long.shl(other: Byte): Long = this.shl(other.toInt())
infix fun Long.shl(other: Short): Long = this.shl(other.toInt())
infix fun Long.shl(other: Int): Long = this.shl(other.toInt())

/**
 * shr
 */
infix fun Char.shr(other: Char): Int = this.toInt().shr(other)
infix fun Char.shr(other: Byte): Int = this.toInt().shr(other)
infix fun Char.shr(other: Short): Int = this.toInt().shr(other)
infix fun Char.shr(other: Int): Int = this.toInt().shr(other)
infix fun Char.shr(other: Long): Int = this.toInt().shr(other)

infix fun Byte.shr(other: Char): Int = this.toInt().shr(other)
infix fun Byte.shr(other: Byte): Int = this.toInt().shr(other)
infix fun Byte.shr(other: Short): Int = this.toInt().shr(other)
infix fun Byte.shr(other: Int): Int = this.toInt().shr(other)
infix fun Byte.shr(other: Long): Int = this.toInt().shr(other)

infix fun Short.shr(other: Char): Int = this.toInt().shr(other)
infix fun Short.shr(other: Byte): Int = this.toInt().shr(other)
infix fun Short.shr(other: Short): Int = this.toInt().shr(other)
infix fun Short.shr(other: Int): Int = this.toInt().shr(other)
infix fun Short.shr(other: Long): Int = this.toInt().shr(other)

infix fun Int.shr(other: Char): Int = this.shr(other.toInt())
infix fun Int.shr(other: Byte): Int = this.shr(other.toInt())
infix fun Int.shr(other: Short): Int = this.shr(other.toInt())
infix fun Int.shr(other: Long): Int = this.shr(other.toInt())

infix fun Long.shr(other: Char): Long = this.shr(other.toInt())
infix fun Long.shr(other: Byte): Long = this.shr(other.toInt())
infix fun Long.shr(other: Short): Long = this.shr(other.toInt())
infix fun Long.shr(other: Int): Long = this.shr(other.toInt())

/**
 * ushr
 */
infix fun Char.ushr(other: Char): Int = this.toInt().ushr(other)
infix fun Char.ushr(other: Byte): Int = this.toInt().ushr(other)
infix fun Char.ushr(other: Short): Int = this.toInt().ushr(other)
infix fun Char.ushr(other: Int): Int = this.toInt().ushr(other)
infix fun Char.ushr(other: Long): Int = this.toInt().ushr(other)

infix fun Byte.ushr(other: Char): Int = this.toInt().ushr(other)
infix fun Byte.ushr(other: Byte): Int = this.toInt().ushr(other)
infix fun Byte.ushr(other: Short): Int = this.toInt().ushr(other)
infix fun Byte.ushr(other: Int): Int = this.toInt().ushr(other)
infix fun Byte.ushr(other: Long): Int = this.toInt().ushr(other)

infix fun Short.ushr(other: Char): Int = this.toInt().ushr(other)
infix fun Short.ushr(other: Byte): Int = this.toInt().ushr(other)
infix fun Short.ushr(other: Short): Int = this.toInt().ushr(other)
infix fun Short.ushr(other: Int): Int = this.toInt().ushr(other)
infix fun Short.ushr(other: Long): Int = this.toInt().ushr(other)

infix fun Int.ushr(other: Char): Int = this.ushr(other.toInt())
infix fun Int.ushr(other: Byte): Int = this.ushr(other.toInt())
infix fun Int.ushr(other: Short): Int = this.ushr(other.toInt())
infix fun Int.ushr(other: Long): Int = this.ushr(other.toInt())

infix fun Long.ushr(other: Char): Long = this.ushr(other.toInt())
infix fun Long.ushr(other: Byte): Long = this.ushr(other.toInt())
infix fun Long.ushr(other: Short): Long = this.ushr(other.toInt())
infix fun Long.ushr(other: Int): Long = this.ushr(other.toInt())

/**
 * xor
 */
infix fun Char.xor(other: Char): Int = this.toInt().xor(other)
infix fun Char.xor(other: Byte): Int = this.toInt().xor(other)
infix fun Char.xor(other: Short): Int = this.toInt().xor(other)
infix fun Char.xor(other: Int): Int = this.toInt().xor(other)
infix fun Char.xor(other: Long): Long = this.toLong().xor(other)

infix fun Byte.xor(other: Char): Int = this.toInt().xor(other)
infix fun Byte.xor(other: Byte): Int = this.toInt().xor(other)
infix fun Byte.xor(other: Short): Int = this.toInt().xor(other)
infix fun Byte.xor(other: Int): Int = this.toInt().xor(other)
infix fun Byte.xor(other: Long): Long = this.toLong().xor(other)

infix fun Short.xor(other: Char): Int = this.toInt().xor(other)
infix fun Short.xor(other: Byte): Int = this.toInt().xor(other)
infix fun Short.xor(other: Short): Int = this.toInt().xor(other)
infix fun Short.xor(other: Int): Int = this.toInt().xor(other)
infix fun Short.xor(other: Long): Long = this.toLong().xor(other)

infix fun Int.xor(other: Char): Int = this.xor(other.toInt())
infix fun Int.xor(other: Byte): Int = this.xor(other.toInt())
infix fun Int.xor(other: Short): Int = this.xor(other.toInt())
infix fun Int.xor(other: Long): Long = other.xor(this)

infix fun Long.xor(other: Char): Long = this.xor(other.toLong())
infix fun Long.xor(other: Byte): Long = this.xor(other.toLong())
infix fun Long.xor(other: Short): Long = this.xor(other.toLong())
infix fun Long.xor(other: Int): Long = this.xor(other.toLong())

/**
 * plus
 */
infix fun Char.plus(other: Char): Int = this.toInt().plus(other)
infix fun Char.plus(other: Byte): Int = this.toInt().plus(other)
infix fun Char.plus(other: Short): Int = this.toInt().plus(other)
infix fun Char.plus(other: Int): Int = this.toInt().plus(other)
infix fun Char.plus(other: Long): Long = this.toLong().plus(other)

infix fun Int.plus(other: Char): Int = this.plus(other.toInt())
infix fun Byte.plus(other: Char): Int = this.plus(other.toInt())
infix fun Short.plus(other: Char): Int = this.plus(other.toInt())
infix fun Long.plus(other: Char): Long = this.plus(other.toInt())
infix fun Double.plus(other: Char): Double = this.plus(other.toInt())
infix fun Float.plus(other: Char): Float = this.plus(other.toInt())

operator fun Any?.plus(other: Any?): String = (this?.toString()?:"null") + other?.toString()

/**
 * Array.get(index)
 */
operator fun <T> Array<T>.get(index: Number): T = get(index.toInt())
operator fun <T> Array<T>.get(index: Char): T = get(index.toInt())

operator fun ByteArray.get(index: Number): Byte = get(index.toInt())
operator fun ByteArray.get(index: Char): Byte = get(index.toInt())

operator fun CharArray.get(index: Number): Char = get(index.toInt())
operator fun CharArray.get(index: Char): Char = get(index.toInt())

operator fun BooleanArray.get(index: Number): Boolean = get(index.toInt())
operator fun BooleanArray.get(index: Char): Boolean = get(index.toInt())

operator fun ShortArray.get(index: Number): Short = get(index.toInt())
operator fun ShortArray.get(index: Char): Short = get(index.toInt())

operator fun IntArray.get(index: Number): Int = get(index.toInt())
operator fun IntArray.get(index: Char): Int = get(index.toInt())

operator fun LongArray.get(index: Number): Long = get(index.toInt())
operator fun LongArray.get(index: Char): Long = get(index.toInt())

operator fun DoubleArray.get(index: Number): Double = get(index.toInt())
operator fun DoubleArray.get(index: Char): Double = get(index.toInt())

operator fun FloatArray.get(index: Number): Float = get(index.toInt())
operator fun FloatArray.get(index: Char): Float = get(index.toInt())

/**
 * 构建一个使用默认值填充的数组
 */
public inline fun <reified T> arrayOfDefaultValue(size: kotlin.Int, defaultValue: T): Array<T> {
    return Array(size, {defaultValue})
}

/**
 * Write.write()
 */
fun Writer.write(char: Char) = this.write(char.toInt())

/**
 * Output.write
 */
fun OutputStream.write(char: Char) = this.write(char.toInt())


/**
 * closeQuietly
 */

/**
 * @since 1.7
 */
fun AutoCloseable?.closeQuietly() {
    try {
        this?.close()
    } catch (e: Throwable) {
        // ignore
    }
}

/**
 * @since 1.5
 */
fun Closeable?.closeQuietly() {
    try {
        this?.close()
    } catch (e: Throwable) {
        // ignore
    }
}