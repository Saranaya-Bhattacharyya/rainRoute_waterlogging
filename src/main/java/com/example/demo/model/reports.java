package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
@Entity
@Table(name = "reports")
public class reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "submitted_by")
    private int submittedBy;
    @Column(name = "location_name")
    private String locationName;
    private double latitude;
    private double longitude;
    private String description;
    private String severity;
    private String status;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
