package io.dataease.api.free;

import io.dataease.api.free.dto.FreeBatchDelRequest;
import io.dataease.api.free.dto.FreeBatchSyncRequest;
import io.dataease.api.free.dto.FreeQueryRequest;
import io.dataease.api.free.dto.FreeSyncRequest;
import io.dataease.api.free.vo.FreeVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FreeApi {

    @PostMapping("/query")
    List<FreeVO> query(@RequestBody FreeQueryRequest request);

    @PostMapping("/syncAll")
    void syncAll(@RequestBody FreeSyncRequest request);

    @PostMapping("/deleteAll")
    void deleteAll();

    @PostMapping("/syncBatch")
    void syncBatch(@RequestBody FreeBatchSyncRequest request);

    @PostMapping("/deleteBatch")
    void deleteBatch(@RequestBody FreeBatchDelRequest request);
}
