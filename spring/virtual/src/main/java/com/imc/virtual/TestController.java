package com.imc.virtual;


import com.imc.virtual.blocking.BlockingReportService;
import com.imc.virtual.platform.PlatformReportService;
import com.imc.virtual.virtual.VirtualReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/report/")
@RequiredArgsConstructor
public class TestController {

    private final BlockingReportService blockingReportService;
    private final PlatformReportService platformReportService;
    private final VirtualReportService virtualReportService;

    private static final String MESSAGE = "Successfully generated report";

    @PostMapping("/blocking")
    public ResponseEntity<String> blockingWay() {
        blockingReportService.loadComments();
        return ResponseEntity.ok(MESSAGE);
    }

    @PostMapping("/platform")
    public ResponseEntity<String> platformThreadWay() {
        platformReportService.loadComments();
        return ResponseEntity.ok(MESSAGE);
    }

    @PostMapping("/virtual")
    public ResponseEntity<String> virtualThreadWay() {
        virtualReportService.loadComments();
        return ResponseEntity.ok(MESSAGE);
    }
}
