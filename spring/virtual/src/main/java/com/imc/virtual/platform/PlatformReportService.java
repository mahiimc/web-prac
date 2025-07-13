package com.imc.virtual.platform;

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
public class PlatformReportService {

    private final CommentsRepository commentsRepository;

    private final Executor executor = Executors.newFixedThreadPool(5);

    public void loadComments() {
        executor.execute(()-> {
            List<Comment> commentList =  commentsRepository.findAll();
            try {
                log.info("generating report for platform thread process: {}", Thread.currentThread());
                ReportUtils.writeCommentsToCSV(commentList, "platform");
            }
            catch (Exception ex) {
                log.error("Error occurred : ", ex);
            }
        });

    }

}
