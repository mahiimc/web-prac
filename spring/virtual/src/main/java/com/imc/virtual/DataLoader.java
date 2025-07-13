package com.imc.virtual;

import com.imc.virtual.client.CommentsClient;
import com.imc.virtual.repo.CommentsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class DataLoader {

    private final CommentsRepository commentsRepository;
    private final CommentsClient commentsClient;

    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {

       List<Comment> existingComments =  commentsRepository.findAll();
       if(!existingComments.isEmpty()) {
           log.info("Data already exists, skipping loading data again.");
           return ;
       }
        log.info("Data does not exists.. Loading data");
        List<Comment> commentList = commentsClient.loadComments();
        commentsRepository.saveAll(commentList);
        log.info("Data load is completed.");
    }
}
