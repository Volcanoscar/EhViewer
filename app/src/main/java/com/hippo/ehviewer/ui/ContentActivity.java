/*
 * Copyright (C) 2015 Hippo Seven
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hippo.ehviewer.ui;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.hippo.ehviewer.R;
import com.hippo.ehviewer.ui.scene.GalleryListScene;
import com.hippo.scene.StageActivity;

public class ContentActivity extends StageActivity {

    private FrameLayout mStage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        mStage = (FrameLayout) findViewById(R.id.stage);

        startFirstScene(GalleryListScene.class);
    }

    @Override
    public FrameLayout getStageView() {
        return mStage;
    }
}