package com.jcs.education.lesson.service.service;

import com.jcs.education.lesson.service.exception.RequestValidationException;
import com.jcs.education.lesson.service.proto.v1.GetLessonsRequest;

public class LessonServiceValidator {

    private LessonServiceValidator() {
        throw new UnsupportedOperationException("LessonServiceValidator is a static utility class");
    }

    static void validateGetLessonsRequest(GetLessonsRequest request) {
        if (request.getCourseUnitId() == 0) {
            throw new RequestValidationException("course_unit_id must be specified");
        }
    }
}
