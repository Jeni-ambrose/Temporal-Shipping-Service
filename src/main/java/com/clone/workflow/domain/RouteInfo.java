package com.clone.workflow.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RouteInfo {

    private String routeId;

    private String source;

    private String destination;

    private List<RouteDTO> routeList;


}
