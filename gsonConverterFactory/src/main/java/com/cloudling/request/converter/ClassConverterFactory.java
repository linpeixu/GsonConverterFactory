package com.cloudling.request.converter;

import java.lang.reflect.Type;

/**
 * 描述: 成功/失败回调参数解析类型为Class
 * 联系: 1966353889@qq.com
 * 日期: 2021/12/27
 */
public abstract class ClassConverterFactory<S, F> extends DefaultConverterFactory<S, F> {

    @Override
    public Type getSuccessType() {
        return null;
    }

    @Override
    public Type getFailType() {
        return null;
    }
}
