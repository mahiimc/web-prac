package com.imc.virtual;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReportUtils {

    private ReportUtils() {
        // NOOP
    }

    public static void writeCommentsToCSV(List<Comment> comments, String process) throws IOException {
        Path path = Paths.get("reports",  process + "_report.csv");
        Files.createDirectories(path.getParent());
        try (BufferedWriter writer = Files.newBufferedWriter(path);
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader("PostId", "CommentId", "Name","Email", "Body"))) {
            for (Comment comment : comments) {
                csvPrinter.printRecord(comment.getPostId(), comment.getId(), comment.getName(),comment.getEmail(), comment.getBody());
            }
        }
    }
}
