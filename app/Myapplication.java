import android.app.VoiceInteractor;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.volley.DefaultRetryPolicy;
public class Myapplication {

    public static void addRequest(VoiceInteractor.Request  request, Object tar) {
        request.setTag(tar);
        request.setRetryPolicy(new DefaultRetryPolicy(10000,DefultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        mQueue.add(request);
    }


}
