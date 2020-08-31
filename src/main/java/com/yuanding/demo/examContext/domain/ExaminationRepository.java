package com.yuanding.demo.examContext.domain;

import java.util.List;

public interface ExaminationRepository {

    Examination find(ExaminationId examinationId);

    void save(Examination examination);

    List<Examination> getAll();
}
