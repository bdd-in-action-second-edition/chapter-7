package com.examplcom.manning.bddinaction.frequentflyer.services;

import com.examplcom.manning.bddinaction.frequentflyer.domain.CabinClass;
import com.examplcom.manning.bddinaction.frequentflyer.domain.FrequentFlyerMember;

public interface FrequentFlyerPointsService {
    void recordFlight(FrequentFlyerMember frequentFlyerMember,
                      String departure,
                      String destination,
                      CabinClass cabinClass);

    int pointsEarnedBy(FrequentFlyerMember frequentFlyerMember);
}
