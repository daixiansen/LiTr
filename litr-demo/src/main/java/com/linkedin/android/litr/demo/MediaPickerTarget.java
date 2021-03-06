/*
 * Copyright 2019 LinkedIn Corporation
 * All Rights Reserved.
 *
 * Licensed under the BSD 2-Clause License (the "License").  See License in the project root for
 * license information.
 */
package com.linkedin.android.litr.demo;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.linkedin.android.litr.demo.data.SourceMedia;

public interface MediaPickerTarget {

    void onMediaPicked(@NonNull SourceMedia sourceMedia);

    void onOverlayPicked(@NonNull Uri uri, long size);
}
