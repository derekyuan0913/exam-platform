package com.yuanding.demo.examContext.domain;

import com.yuanding.demo.shared.ValueObject;

import java.util.Collections;
import java.util.List;

public class PaperVO implements ValueObject<PaperVO> {

    private List<BlankQuizVO> blankQuizzes;

    @Override
    public boolean sameValueAs(PaperVO other) {
        return false;
    }

    public List<BlankQuizVO> getBlankQuizzes() {
        return Collections.unmodifiableList(blankQuizzes);
    }
}
