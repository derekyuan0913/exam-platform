package com.yuanding.demo.examContext.domain;

import com.yuanding.demo.shared.ValueObject;

import java.util.Objects;

public class ExaminationId implements ValueObject<ExaminationId> {

    private String examinationId;

    @Override
    public boolean sameValueAs(ExaminationId other) {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        ExaminationId that = (ExaminationId) o;
        return Objects.equals(examinationId, that.examinationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examinationId);
    }
}
