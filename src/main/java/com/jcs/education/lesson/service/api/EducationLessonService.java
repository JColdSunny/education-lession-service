package com.jcs.education.lesson.service.api;

import com.jcs.education.lesson.service.proto.v1.EducationLessonServiceGrpc;
import com.jcs.education.lesson.service.proto.v1.GetLessonsRequest;
import com.jcs.education.lesson.service.proto.v1.GetLessonsResponse;
import com.jcs.education.lesson.service.service.LessonService;
import io.grpc.stub.StreamObserver;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EducationLessonService extends EducationLessonServiceGrpc.EducationLessonServiceImplBase {
    LessonService lessonService;

    @Override
    public void getLessons(GetLessonsRequest request, StreamObserver<GetLessonsResponse> responseObserver) {
        GetLessonsResponse response = lessonService.getCourseUnitLessons(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
