package com.tts.TransitApp.model;

import lombok.Data;
import java.util.List;

@Data
public class DistanceResponse {
    public List<Row> rows;
}
