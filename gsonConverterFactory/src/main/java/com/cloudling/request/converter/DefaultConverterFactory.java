package com.cloudling.request.converter;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * 描述: 默认json转换工厂
 * 联系: 1966353889@qq.com
 * 日期: 2021/12/27
 */
public abstract class DefaultConverterFactory<S, F> extends BaseConverterFactory<S, F> {
    public abstract Class<S> getSuccessClassType();

    public abstract Class<F> getFailClassType();

    public abstract Type getSuccessType();

    public abstract Type getFailType();

    public S converterSuccess(String json) {
        return fromJsonS(json);
    }

    public F converterFail(String json) {
        return fromJsonF(json);
    }

    private S fromJsonS(String json) {
        Type type = getSuccessType();
        if (type != null) {
            return new Gson().fromJson(json, type);
        }
        Class<S> classType = getSuccessClassType();
        if (classType != null) {
            if (classType == String.class) {
                return (S) json;
            }
            return new Gson().fromJson(json, classType);
        }
        return null;
    }

    private F fromJsonF(String json) {
        Type type = getFailType();
        if (type != null) {
            return new Gson().fromJson(json, type);
        }
        Class<F> classType = getFailClassType();
        if (classType != null) {
            if (classType == String.class) {
                return (F) json;
            }
            return new Gson().fromJson(json, classType);
        }
        return null;
    }
}
