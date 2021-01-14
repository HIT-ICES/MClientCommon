package com.hitices.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.hitices.common.base.node.MServerNode;
import com.hitices.common.service.MService;
import com.hitices.common.bean.agent.MConnectionJson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author septemberhx
 * @date 2020/11/10
 **/

public class DataUtils {

    public static List<MService> readSvcFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)), new TypeToken<List<MService>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static List<MServerNode> readNodeFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)), new TypeToken<List<MServerNode>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static List<MConnectionJson> readConnFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)), new TypeToken<List<MConnectionJson>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static Map<String, Double> readPriceMapFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)), new TypeToken<Map<String, Double>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    public static Map<String, Map<String, Map<String, Double>>> readReqFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)),
                    new TypeToken<Map<String, Map<String, Map<String, Double>>>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    public static Map<String, Map<String, Map<String, Double>>> readCallCoeFromJson(String filePath) {
        Gson gson = new GsonBuilder().create();
        try {
            return gson.fromJson(new BufferedReader(new FileReader(filePath)),
                    new TypeToken<Map<String, Map<String, Map<String, Double>>>>(){}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }
}
