package com.weather.testtinker;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class MainApplication extends TinkerApplication {
    public MainApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.weather.testtinker.MainApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
