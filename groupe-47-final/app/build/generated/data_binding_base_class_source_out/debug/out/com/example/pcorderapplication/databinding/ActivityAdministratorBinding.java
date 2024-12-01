// Generated by view binder compiler. Do not edit!
package com.example.pcorderapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.pcorderapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdministratorBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout buttons;

  @NonNull
  public final CardView cardEmail;

  @NonNull
  public final CardView cardFirstName;

  @NonNull
  public final CardView cardLastName;

  @NonNull
  public final Button createRequesterButton;

  @NonNull
  public final Button deleteRequesterButton;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final EditText firstNameEditText;

  @NonNull
  public final ImageView goBackArrow;

  @NonNull
  public final Guideline guideline1;

  @NonNull
  public final EditText lastNameEditText;

  @NonNull
  public final Button modifyRequesterButton;

  @NonNull
  public final ListView requestersListView;

  @NonNull
  public final TextView textView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final View view2;

  private ActivityAdministratorBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout buttons, @NonNull CardView cardEmail, @NonNull CardView cardFirstName,
      @NonNull CardView cardLastName, @NonNull Button createRequesterButton,
      @NonNull Button deleteRequesterButton, @NonNull EditText emailEditText,
      @NonNull EditText firstNameEditText, @NonNull ImageView goBackArrow,
      @NonNull Guideline guideline1, @NonNull EditText lastNameEditText,
      @NonNull Button modifyRequesterButton, @NonNull ListView requestersListView,
      @NonNull TextView textView, @NonNull Toolbar toolbar, @NonNull View view2) {
    this.rootView = rootView;
    this.buttons = buttons;
    this.cardEmail = cardEmail;
    this.cardFirstName = cardFirstName;
    this.cardLastName = cardLastName;
    this.createRequesterButton = createRequesterButton;
    this.deleteRequesterButton = deleteRequesterButton;
    this.emailEditText = emailEditText;
    this.firstNameEditText = firstNameEditText;
    this.goBackArrow = goBackArrow;
    this.guideline1 = guideline1;
    this.lastNameEditText = lastNameEditText;
    this.modifyRequesterButton = modifyRequesterButton;
    this.requestersListView = requestersListView;
    this.textView = textView;
    this.toolbar = toolbar;
    this.view2 = view2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdministratorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdministratorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_administrator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdministratorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttons;
      LinearLayout buttons = ViewBindings.findChildViewById(rootView, id);
      if (buttons == null) {
        break missingId;
      }

      id = R.id.cardEmail;
      CardView cardEmail = ViewBindings.findChildViewById(rootView, id);
      if (cardEmail == null) {
        break missingId;
      }

      id = R.id.cardFirstName;
      CardView cardFirstName = ViewBindings.findChildViewById(rootView, id);
      if (cardFirstName == null) {
        break missingId;
      }

      id = R.id.cardLastName;
      CardView cardLastName = ViewBindings.findChildViewById(rootView, id);
      if (cardLastName == null) {
        break missingId;
      }

      id = R.id.createRequesterButton;
      Button createRequesterButton = ViewBindings.findChildViewById(rootView, id);
      if (createRequesterButton == null) {
        break missingId;
      }

      id = R.id.deleteRequesterButton;
      Button deleteRequesterButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteRequesterButton == null) {
        break missingId;
      }

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.firstNameEditText;
      EditText firstNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (firstNameEditText == null) {
        break missingId;
      }

      id = R.id.goBackArrow;
      ImageView goBackArrow = ViewBindings.findChildViewById(rootView, id);
      if (goBackArrow == null) {
        break missingId;
      }

      id = R.id.guideline1;
      Guideline guideline1 = ViewBindings.findChildViewById(rootView, id);
      if (guideline1 == null) {
        break missingId;
      }

      id = R.id.lastNameEditText;
      EditText lastNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (lastNameEditText == null) {
        break missingId;
      }

      id = R.id.modifyRequesterButton;
      Button modifyRequesterButton = ViewBindings.findChildViewById(rootView, id);
      if (modifyRequesterButton == null) {
        break missingId;
      }

      id = R.id.requestersListView;
      ListView requestersListView = ViewBindings.findChildViewById(rootView, id);
      if (requestersListView == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      return new ActivityAdministratorBinding((ConstraintLayout) rootView, buttons, cardEmail,
          cardFirstName, cardLastName, createRequesterButton, deleteRequesterButton, emailEditText,
          firstNameEditText, goBackArrow, guideline1, lastNameEditText, modifyRequesterButton,
          requestersListView, textView, toolbar, view2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}