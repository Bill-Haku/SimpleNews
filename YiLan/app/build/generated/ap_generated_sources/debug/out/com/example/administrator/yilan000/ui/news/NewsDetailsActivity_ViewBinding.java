// Generated code from Butter Knife. Do not modify!
package com.example.administrator.yilan000.ui.news;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.administrator.yilan000.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewsDetailsActivity_ViewBinding implements Unbinder {
  private NewsDetailsActivity target;

  @UiThread
  public NewsDetailsActivity_ViewBinding(NewsDetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public NewsDetailsActivity_ViewBinding(NewsDetailsActivity target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.collapsingToolbar = Utils.findRequiredViewAsType(source, R.id.collapsing_toolbar, "field 'collapsingToolbar'", CollapsingToolbarLayout.class);
    target.webText = Utils.findRequiredViewAsType(source, R.id.web_text, "field 'webText'", WebView.class);
    target.ivImage = Utils.findRequiredViewAsType(source, R.id.ivImage, "field 'ivImage'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsDetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.collapsingToolbar = null;
    target.webText = null;
    target.ivImage = null;
  }
}
