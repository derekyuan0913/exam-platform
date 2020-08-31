package com.yuanding.demo.examContext.infrastructure.repository;

import com.yuanding.demo.examContext.domain.Examination;
import com.yuanding.demo.examContext.domain.ExaminationId;
import com.yuanding.demo.examContext.domain.ExaminationRepository;
import com.yuanding.demo.examContext.exception.NoSuchExaminationException;

import java.util.ArrayList;
import java.util.List;

public class MemoryExaminationReposity implements ExaminationRepository {

    private List<Examination> examinationList = new ArrayList<>();

    @Override
    public Examination find(ExaminationId examinationId) {
        return examinationList.stream()
                .filter(examination -> examination.getExaminationId().equals(examinationId))
                .findFirst()
                .orElseThrow(NoSuchExaminationException::new);
    }

    @Override
    public void save(Examination examination) {
        examinationList.add(examination);
    }

    @Override
    public List<Examination> getAll() {
        return examinationList;
    }
}
