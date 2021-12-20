// Generated code from Butter Knife. Do not modify!
package com.example.administrator.yilan000.ui.pictures;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.administrator.yilan000.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PictureDescribeActivity_ViewBinding implements Unbinder {
  private PictureDescribeActivity target;

  @UiThread
  public PictureDescribeActivity_ViewBinding(PictureDescribeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PictureDescribeActivity_ViewBinding(PictureDescribeActivity target, View source) {
    this.target = target;

    target.imgPicture = Utils.findRequiredViewAsType(source, R.id.image, "field 'imgPicture'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PictureDescribeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgPicture = null;
  }
}
