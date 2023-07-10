package com.nimisha.learn.config;

import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {"classpath:properties/database-det.properties"}, ignoreResourceNotFound = true)
public class PropertyConfig {
}
