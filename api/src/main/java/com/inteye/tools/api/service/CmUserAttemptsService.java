package com.inteye.tools.api.service;

import com.inteye.tools.model.CmUserAttempts;

/**
 * User Attempts Service
 * Created by inteye on 2/20/19.
 */
public interface CmUserAttemptsService {

    void updateFailAttempts(String username);
    CmUserAttempts getUserAttempts(String username);
    void resetFailAttempts(String username);

}
