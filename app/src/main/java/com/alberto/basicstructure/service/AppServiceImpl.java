package com.alberto.basicstructure.service;

public class AppServiceImpl implements AppService {
    private final ApiClient apiClient;

    public AppServiceImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
}
