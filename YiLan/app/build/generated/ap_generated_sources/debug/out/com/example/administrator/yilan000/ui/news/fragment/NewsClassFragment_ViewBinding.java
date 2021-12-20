// Generated code from Butter Knife. Do not modify!
package com.example.administrator.yilan000.ui.news.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.administrator.yilan000.R;
import com.jude.easyrecyclerview.EasyRecyclerView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NewsClassFragment_ViewBinding implements Unbinder {
  private NewsClassFragment target;

  @UiThread
  public NewsClassFragment_ViewBinding(NewsClassFragment target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'recyclerView'", EasyRecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NewsClassFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
  }
}
