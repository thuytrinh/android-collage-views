MultiTouchListener
==================

Introduction
------------

The `MultiTouchListener` is an extension of the `OnTouchListener` class written to facilitate the development of multi-touch applications for Android. Basically, it resolves multi-touch input on a single `View` into translation, isotropic scaling, and two-finger rotation. The `View` will also be transformed accordingly if it is enabled. This means that you can make a combined drag-pinch-rotate gesture which allows you to physically twist, scale, and move the `View` using two touch points on the screen. It is noticed that both scaling and rotating are relative to the centre of the pinch operation. So the movement of the `View` looks more naturally.

![MultiTouchListener](https://dl.dropbox.com/u/50349401/images/multitouchlistener.png)

One of its cool features is that it is possible to flawlessly perform simultaneous manipulations on separate `View`s. Specifically, if you touch fingers on one `View`, and other fingers on another `View` to do drag/pinch/rotate operation (or the combination of them) on each, those will constitute two independent manipulations, and thus, both `View`s will be transformed separately and simultaneously. This results in great advantages for the case you intend to develop some sorts of app/game, such as jigsaw puzzle or collage app, whereby multiple users can simultaneously interact with elements on the screen.

However, the `MultiTouchListener` has its own limitation that it cannot operate on Android versions prior to Honeycomb due to the utilization of APIs 11. For instance, applying 2D transformations to `View`s was done by a bunch of new APIs including `setPivotX()`, `setPivotY()`, `setRotation()`, `setScaleX()`, `setScaleY()`, and others. Moreover, the feature of simultaneous manipulations mentioned above will not work without the existence of the `splitMotionEvents` property.

Usage
-----

1. Copy the whole `com.thuytrinh.multitouchlistener` package to your `src` folder.
2. Create a parent `View` having `splitMotionEvents` enabled for all the child `View`s you want to apply the `MultiTouchListener`.

        <RelativeLayout
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:tools="http://schemas.android.com/tools"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:splitMotionEvents="true"
            tools:context=".MainActivity" >

            <ImageView
                android:id="@+id/imageview_background"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_centerHorizontal="true"
                android:layout_centerVertical="true"
                android:background="#FFD4B081" />

            <com.thuytrinh.multitouchdemo.TouchView
                android:id="@+id/touchview_1"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerHorizontal="true"
                android:layout_centerVertical="true"
                android:src="@drawable/daffodils" />

            <com.thuytrinh.multitouchdemo.TouchView
                android:id="@+id/touchview_2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerHorizontal="true"
                android:layout_centerVertical="true"
                android:src="@drawable/green" />
    
        </RelativeLayout>

3. Instantiate a new `MultiTouchListener` for the `OnTouchListener` of the `View`.

    ```java
    findViewById(R.id.touchview_1).setOnTouchListener(new MultiTouchListener());
    findViewById(R.id.touchview_2).setOnTouchListener(new MultiTouchListener());
    ```

4. By default, translating, scaling, and rotating are enabled. However, if you want a `View` not to be scaled but translated or rotated only, toggling `isScaleEnabled`, `isTranslateEnabled`, `isRotateEnabled` appropriately will do the trick.

Developed By
------------

* Thuy Trinh - thuy.ngtrinh@gmail.com

License
-------

    Copyright 2012 Thuy Trinh

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.