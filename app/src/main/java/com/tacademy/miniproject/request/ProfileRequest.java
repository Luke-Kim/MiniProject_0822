package com.tacademy.miniproject.request;

import android.content.Context;

import com.google.gson.reflect.TypeToken;
import com.tacademy.miniproject.data.NetworkResult;
import com.tacademy.miniproject.data.User;

import java.lang.reflect.Type;

import okhttp3.HttpUrl;
import okhttp3.Request;

/**
 * Created by Tacademy on 2016-08-10.
 */
public class ProfileRequest extends AbstractRequest<NetworkResult<User>>{
    Request request;
    public ProfileRequest(Context context) {
        HttpUrl url = getBaseUrlBuilder()
                .addPathSegment("profile")
                .build();
        request = new Request.Builder()
                .url(url)
                .tag(context)
                .build();
    }
    @Override
    protected Type getType() {
        return new TypeToken<NetworkResult<User>>(){}.getType();
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
