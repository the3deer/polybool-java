
package org.the3deers.util.android;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import org.jetbrains.annotations.NotNull;
import org.the3deers.polybool.PolyBool;
import org.the3deers.util.javascript.JSList;
import org.the3deers.util.javascript.JSListDeserializer;
import org.the3deers.util.javascript.JSMap;
import org.the3deers.util.javascript.JSMapDeserializer;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

public final class WebAppInterface {
    private Context mContext;

    public WebAppInterface(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public void log(String txt) {
        AndroidUtils.logd(txt);
    }

    @JavascriptInterface
    public void logd(String txt) {
        AndroidUtils.logd(txt);
    }

    @JavascriptInterface
    public void toast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_LONG).show();
    }
}

