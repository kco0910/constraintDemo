package com.fly.constraint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 *activity_test_1 对constraintLayout的大部分属性进行了测试
 * 横向的相当于组成了一个链(Chains)。在这个链的最左侧的元素成为链头，我们可以在其身上设置一些属性，来决定这个链的展示效果：
 * activity_test_2、activity_test_3、activity_test_4、activity_test_5是对Chains(链)(水平、垂直)的一些配置属性的使用
 * 当未指定layout_constraintHorizontal_chainStyle属性时，默认设置的值是spread
 * activity_test_2 spread + 宽度为0
 * activity_test_3 spread + 宽度非0
 * activity_test_4 spread_inside + 宽度非0
 * activity_test_5 packed + 宽度非0
 * 在这些属性的设置上可以通过layout_constraintHorizontal_bias属性来设置链头的偏移位置(0-1)
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_1)
    }
}
