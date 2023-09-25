// Generated by view binder compiler. Do not edit!
package com.example.ajaibmusicstudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ajaibmusicstudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterPageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout LayoutRegisterPage;

  @NonNull
  public final LinearLayout LayoutType1;

  @NonNull
  public final TextView TextRegister;

  @NonNull
  public final EditText emailC;

  @NonNull
  public final EditText firstnameC;

  @NonNull
  public final EditText lastnameC;

  @NonNull
  public final EditText passwordC;

  @NonNull
  public final Button registerbutton;

  @NonNull
  public final EditText usernameC;

  private ActivityRegisterPageBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout LayoutRegisterPage, @NonNull LinearLayout LayoutType1,
      @NonNull TextView TextRegister, @NonNull EditText emailC, @NonNull EditText firstnameC,
      @NonNull EditText lastnameC, @NonNull EditText passwordC, @NonNull Button registerbutton,
      @NonNull EditText usernameC) {
    this.rootView = rootView;
    this.LayoutRegisterPage = LayoutRegisterPage;
    this.LayoutType1 = LayoutType1;
    this.TextRegister = TextRegister;
    this.emailC = emailC;
    this.firstnameC = firstnameC;
    this.lastnameC = lastnameC;
    this.passwordC = passwordC;
    this.registerbutton = registerbutton;
    this.usernameC = usernameC;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LayoutRegisterPage;
      LinearLayout LayoutRegisterPage = ViewBindings.findChildViewById(rootView, id);
      if (LayoutRegisterPage == null) {
        break missingId;
      }

      id = R.id.LayoutType1;
      LinearLayout LayoutType1 = ViewBindings.findChildViewById(rootView, id);
      if (LayoutType1 == null) {
        break missingId;
      }

      id = R.id.TextRegister;
      TextView TextRegister = ViewBindings.findChildViewById(rootView, id);
      if (TextRegister == null) {
        break missingId;
      }

      id = R.id.emailC;
      EditText emailC = ViewBindings.findChildViewById(rootView, id);
      if (emailC == null) {
        break missingId;
      }

      id = R.id.firstnameC;
      EditText firstnameC = ViewBindings.findChildViewById(rootView, id);
      if (firstnameC == null) {
        break missingId;
      }

      id = R.id.lastnameC;
      EditText lastnameC = ViewBindings.findChildViewById(rootView, id);
      if (lastnameC == null) {
        break missingId;
      }

      id = R.id.passwordC;
      EditText passwordC = ViewBindings.findChildViewById(rootView, id);
      if (passwordC == null) {
        break missingId;
      }

      id = R.id.registerbutton;
      Button registerbutton = ViewBindings.findChildViewById(rootView, id);
      if (registerbutton == null) {
        break missingId;
      }

      id = R.id.usernameC;
      EditText usernameC = ViewBindings.findChildViewById(rootView, id);
      if (usernameC == null) {
        break missingId;
      }

      return new ActivityRegisterPageBinding((RelativeLayout) rootView, LayoutRegisterPage,
          LayoutType1, TextRegister, emailC, firstnameC, lastnameC, passwordC, registerbutton,
          usernameC);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
