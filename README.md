# bounceScrollView

## 介绍 ##

本项目实现了 ScrollView 头部和底部拉动的回弹效果，如下图所示：

嵌套子 View 超过 ScrollVeiw 高度

![嵌套子 View 超过 ScrollVeiw 高度](http://i.imgur.com/CTxcB5L.gif)

嵌套子 View 未超过 ScrollVeiw 高度

![嵌套子 View 未超过 ScrollVeiw 高度](http://i.imgur.com/Sz8o6cu.gif)

## 使用方法 ##

**在build.gradle中添加：**

	compile 'com.dalu9527:bounceScrollView:0.0.1'


**在布局中使用：**

	<com.lib.bounceScrollView
        android:id="@+id/bs_test"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:focusable="true"
        android:focusableInTouchMode="true">
		<!-- 你的布局 -->
        <android.support.v7.widget.RecyclerView
            android:id="@+id/rc_test"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        </android.support.v7.widget.RecyclerView>

    </com.lib.bounceScrollView>

其中 ScrollView 的原有属性没有变化，照常使用即可

## Introduce ##

This project make the ScrollView bounce when move to top and bottom. As shown in the figure below:

the inner view's height is higher than the scrollView's height

![](http://i.imgur.com/CTxcB5L.gif)

the inner view's height is not higher than the scrollView's height

![](http://i.imgur.com/Sz8o6cu.gif)

## Usage ##

**In build.gradle add：**

	compile 'com.dalu9527:bounceScrollView:0.0.1'

**In Your Layout：**

	<com.lib.bounceScrollView
        android:id="@+id/bs_test"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:focusable="true"
        android:focusableInTouchMode="true">
		<!-- your layout -->
        <android.support.v7.widget.RecyclerView
            android:id="@+id/rc_test"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        </android.support.v7.widget.RecyclerView>

    </com.lib.bounceScrollView>

the scrollView's attr is not change, just use as normal.