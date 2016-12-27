package criminalintent.android.bignerdranch.com.criminalintent;

import java.util.UUID;

/**
 * Created by zling on 2016/12/27.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
        mId = UUID.randomUUID();
    }
    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
}
