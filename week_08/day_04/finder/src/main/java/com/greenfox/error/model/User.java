package com.greenfox.error.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Created by aze on 25/10/17.
 */
@EntityScan
public class User {
    private String firstName;
    private String lastName;
}
