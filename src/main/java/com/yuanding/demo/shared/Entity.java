package com.yuanding.demo.shared;

public interface Entity<T> {
    boolean sameIdentityAs(T other);
}
