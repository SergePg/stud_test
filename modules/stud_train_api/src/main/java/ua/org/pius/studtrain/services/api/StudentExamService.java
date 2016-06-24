package ua.org.pius.studtrain.services.api;

import ua.org.pius.studtrain.db.tables.pojos.Exam;
import ua.org.pius.studtrain.db.tables.pojos.ExaminationTicket;
import ua.org.pius.studtrain.db.tables.pojos.StudiesCourse;

import java.util.List;

/**
 * Created by SKulik on 24.06.2016.
 */
public interface StudentExamService {
    List<Exam> getAvailableExams();
    List<Exam> getExamsByCourse(StudiesCourse studiesCourse);
}