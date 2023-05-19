package com.global.multidb.model;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "data")
public class Analytics {

    @Id
    private String id; // auto assigned by mongo db

    private String userId;
    private Long userLogCount;
}
