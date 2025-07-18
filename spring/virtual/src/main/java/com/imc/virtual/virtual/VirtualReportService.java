package com.imc.virtual.virtual;

import com.imc.virtual.Comment;
import com.imc.virtual.ReportUtils;
import com.imc.virtual.repo.CommentsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Service
@RequiredArgsConstructor
@Slf4j
public class VirtualReportService {

    private final CommentsRepository commentsRepository;

    private final Executor executor = Executors.newVirtualThreadPerTaskExecutor();

    public void loadComments() {
        executor.execute(()-> {
            List<Comment> commentList =  commentsRepository.findAll();
            try {
                log.info("generating report for  virtual process: {}", Thread.currentThread());
                ReportUtils.writeCommentsToCSV(commentList, "virtual");
            }
            catch (Exception ex) {
                log.error("Error occurred : ", ex);
            }
        });

    }

}
