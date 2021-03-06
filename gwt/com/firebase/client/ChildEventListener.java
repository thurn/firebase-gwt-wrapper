package com.firebase.client;

public interface ChildEventListener {
  void onCancelled(FirebaseError error);

  void onChildAdded(DataSnapshot snapshot, String previousChildName);

  void onChildChanged(DataSnapshot snapshot, String previousChildName);

  void onChildMoved(DataSnapshot snapshot, String previousChildName);

  void onChildRemoved(DataSnapshot snapshot);
}
