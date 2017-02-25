package com.github.terma.jenkins.githubcoverageupdater;

import com.jayway.jsonpath.JsonPath;

public class JsonUtils {
    public static <T> T findInJson(String json, String jsonPath) {
        return JsonPath.read(json, jsonPath);
    }
}
