// Generated by view binder compiler. Do not edit!
package com.example.ajaibmusicstudio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ajaibmusicstudio.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBookingRoomCustomerBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button BookingBtn;

  @NonNull
  public final LinearLayout LinearLayoutBooking;

  @NonNull
  public final TextView TextBooking;

  @NonNull
  public final Button datePickerBtn;

  @NonNull
  public final Spinner hoursPickerBtn;

  @NonNull
  public final Button timePickerBtn;

  private ActivityBookingRoomCustomerBinding(@NonNull RelativeLayout rootView,
      @NonNull Button BookingBtn, @NonNull LinearLayout LinearLayoutBooking,
      @NonNull TextView TextBooking, @NonNull Button datePickerBtn, @NonNull Spinner hoursPickerBtn,
      @NonNull Button timePickerBtn) {
    this.rootView = rootView;
    this.BookingBtn = BookingBtn;
    this.LinearLayoutBooking = LinearLayoutBooking;
    this.TextBooking = TextBooking;
    this.datePickerBtn = datePickerBtn;
    this.hoursPickerBtn = hoursPickerBtn;
    this.timePickerBtn = timePickerBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBookingRoomCustomerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBookingRoomCustomerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_booking_room_customer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBookingRoomCustomerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.BookingBtn;
      Button BookingBtn = ViewBindings.findChildViewById(rootView, id);
      if (BookingBtn == null) {
        break missingId;
      }

      id = R.id.LinearLayoutBooking;
      LinearLayout LinearLayoutBooking = ViewBindings.findChildViewById(rootView, id);
      if (LinearLayoutBooking == null) {
        break missingId;
      }

      id = R.id.TextBooking;
      TextView TextBooking = ViewBindings.findChildViewById(rootView, id);
      if (TextBooking == null) {
        break missingId;
      }

      id = R.id.datePickerBtn;
      Button datePickerBtn = ViewBindings.findChildViewById(rootView, id);
      if (datePickerBtn == null) {
        break missingId;
      }

      id = R.id.hoursPickerBtn;
      Spinner hoursPickerBtn = ViewBindings.findChildViewById(rootView, id);
      if (hoursPickerBtn == null) {
        break missingId;
      }

      id = R.id.timePickerBtn;
      Button timePickerBtn = ViewBindings.findChildViewById(rootView, id);
      if (timePickerBtn == null) {
        break missingId;
      }

      return new ActivityBookingRoomCustomerBinding((RelativeLayout) rootView, BookingBtn,
          LinearLayoutBooking, TextBooking, datePickerBtn, hoursPickerBtn, timePickerBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}