package se.zavann.gasellmvvm;

import retrofit.RestAdapter;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Tom on 2015-05-24.
 */
public class GasellRest implements AndroidRest {
    public static final String API_URL = "Insert Gasell URL";

    public GasellRest() {

    }

    public interface Login {
        @GET("/customerLoginInformation")
        void createDtoLoginInformation(@Body DtoLoginInformation dtoLoginInformation, callback<DtoLoginInformation> cb);
    }

    @Override
    public int login(DtoLoginInformation dtoLoginInformation) {
        RestAdapter REST = new RestAdapter.Builder()
                .setEndpoint("http://insert.Gasell.URL.here/")
                .build();
        Login loginrequest = REST.create(Login.class);

        return sucess;
    }

    @Override
    public DtoCustomerInfo getCustomerInfo(String customerId) {
        return null;
    }

    @Override
    public DtoSiteInfo getSiteInfo(String siteId, String customerId) {
        return null;
    }

    @Override
    public DtoContractInfo getContractInfo(String ContractId, String customerId, String siteId) {
        return null;
    }
}
