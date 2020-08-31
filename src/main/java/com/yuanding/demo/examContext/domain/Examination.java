package com.yuanding.demo.examContext.domain;

import com.yuanding.demo.shared.Entity;

import java.time.LocalDateTime;

public class Examination implements Entity<Examination> {

    private ExaminationId examinationId;
    private String teacherId;
    private String examinationName;
    private PaperVO paper;
    private LocalDateTime createTime;
    private LocalDateTime startTime;
    private LocalDateTime dueTime;

    private Examination(String teacherId, String examinationName, PaperVO paper,
                        LocalDateTime createTime, LocalDateTime startTime, LocalDateTime dueTime) {
        this.teacherId = teacherId;
        this.examinationName = examinationName;
        this.paper = paper;
        this.createTime = createTime;
        this.startTime = startTime;
        this.dueTime = dueTime;
    }

    public static Examination create(String teacherId, String examinationName, PaperVO paperVO,
                        LocalDateTime startTime, LocalDateTime dueTime) {

        return new Examination(teacherId, examinationName, paperVO,
                LocalDateTime.now(),startTime, dueTime);
    }


    public PaperVO getPaper() {
        return paper;
    }

    @Override
    public boolean sameIdentityAs(Examination other) {
        return this.getExaminationId().equals(other.getExaminationId());
    }

    public ExaminationId getExaminationId() {
        return examinationId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getExaminationName() {
        return examinationName;
    }

}
