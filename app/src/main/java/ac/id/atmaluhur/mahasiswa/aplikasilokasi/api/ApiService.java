package ac.id.atmaluhur.mahasiswa.aplikasilokasi.api;

import ac.id.atmaluhur.mahasiswa.aplikasilokasi.model.ListLocationModel;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("JsonDisplayMarker.php")
    Call<ListLocationModel> getAllLocation();
}
