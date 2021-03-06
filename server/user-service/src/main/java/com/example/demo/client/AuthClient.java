package com.example.demo.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Accept: application/json")
public interface AuthClient {

    @RequestLine("GET /auth/me")
    @Headers("authorization: {token}")
    String me(@Param("token") String token);
}
