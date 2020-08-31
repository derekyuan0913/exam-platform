package com.yuanding.demo.shared;

public interface ValueObject<T> {
    boolean sameValueAs(T other);
}