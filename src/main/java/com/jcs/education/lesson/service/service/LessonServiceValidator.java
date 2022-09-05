package com.jcs.education.lesson.service.service;

import com.jcs.education.lesson.service.exception.RequestValidationException;
import com.jcs.education.lesson.service.proto.v1.GetLessonsRequest;
import org.springframework.util.CollectionUtils;

public class LessonServiceValidator {

    private LessonServiceValidator() {
        throw new UnsupportedOperationException("LessonServiceValidator is a static utility class");
    }

    static void validateGetLessonsRequest(GetLessonsRequest request) {
        if (CollectionUtils.isEmpty(request.getLessonsIdsList())) {
            throw new RequestValidationException("lessons_ids must be specified");
        }
    }
}
