package com.gzd.trainingconstraintlayout;

import android.content.Context;

import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AnimHelper extends ConstraintHelper {
    public AnimHelper(Context context) {
        super(context);
    }

    @Override
    public void updatePostLayout(ConstraintLayout container) {
        super.updatePostLayout(container);
        getReferencedIds();
    }
}
