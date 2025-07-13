package com.imc.virtual.blocking;

import com.imc.virtual.Comment;
import com.imc.virtual.ReportUtils;
import com.imc.virtual.repo.CommentsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class BlockingReportService {

    private final CommentsRepository commentsRepository;


    public void loadComments() {
       List<Comment> commentList =  commentsRepository.findAll();
       try {
           log.info("generating report for blocking process: {}", Thread.currentThread());
           ReportUtils.writeCommentsToCSV(commentList, "blocking");
       }
       catch (Exception ex) {
           log.error("Error occurred : ", ex);
       }
    }

}
