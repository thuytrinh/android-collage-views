android-collage-views
==================

Introduction
------------

"A video is worth a million words"
[Watch the demo here](http://youtu.be/yHmA-bMqBRI)

*(Note: Work only with API 11+)*

Usage
-----

1. Create a parent view having `splitMotionEvents` enabled, and having child views as below:

    ```xml
    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:splitMotionEvents="true">
    
        <ImageView
            android:id="@+id/collageBgView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:background="#FFD4B081" />
    
        <com.thuytrinh.android.collageviewsdemo.CollageView
            android:id="@+id/collageView1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:src="@drawable/daffodils" />
    
        <com.thuytrinh.android.collageviewsdemo.CollageView
            android:id="@+id/collageView2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:src="@drawable/green" />
    
        <com.thuytrinh.android.collageviewsdemo.CollageView
            android:id="@+id/collageView3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:src="@drawable/hawaii" />
    
        <com.thuytrinh.android.collageviewsdemo.CollageView
            android:id="@+id/collageView4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:src="@drawable/sunset" />
    
    </RelativeLayout>
    ```

2. Find the child views and assign `MultiTouchListener`:

    ```java
    findViewById(R.id.collageView1).setOnTouchListener(new MultiTouchListener());
    findViewById(R.id.collageView2).setOnTouchListener(new MultiTouchListener());
    ```

3. By default, translating, scaling, and rotating are enabled. However, if you want a child view not to be scaled but translated or rotated only, toggling `isScaleEnabled`, `isTranslateEnabled`, `isRotateEnabled` appropriately will do the trick.
