# FulvaKt

`FulvaKt` 是对 `kotlin.kotlin_builtins` 的一些扩展.主要集中在`Number`的类型提升上.

---

**Note:** *`Char`在`Kotlin`不是一个`Number`,算是比较特殊的一个东西.扩展中把`Char`当成`Number`来处理.所以大部分情况下都是`toInt`后使用.这点和`Java`中是一样的.*

使用说明:
-------


1. 引入jar包

    **Gradle**:
    ``` groovy
    dependencies {
            compile 'com.rover12421:fulvakt:0.2'
        }
    ```
    
    
    **Maven**:
    ``` xml
    <dependency>
      <groupId>com.rover12421</groupId>
      <artifactId>fulvakt</artifactId>
      <version>0.2</version>
    </dependency>
    ```

2. 在需要的类中添加导入即可

    ```java
    import com.rover12421.fulvakt.builtins_extension.*
    ```

---

其他说明:
--------

1. `closeQuietly`
    针对`Closeable?` `AutoCloseable?`(1.7+)做的扩展
    比如:`FileInputStream(file).closeQuietly()`

2. `arrayOfDefaultValue` 使用一个默认值来初始化一个指定长度的数组
    算是对`arrayOfNulls`这个用null填充的数组的补充

