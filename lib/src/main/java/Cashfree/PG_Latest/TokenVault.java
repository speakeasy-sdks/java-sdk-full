/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest;

import Cashfree.PG_Latest.utils.HTTPClient;
import Cashfree.PG_Latest.utils.HTTPRequest;
import Cashfree.PG_Latest.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.http.NameValuePair;

/**
 * Cashfree's token Vault helps you save cards and tokenize them in a PCI complaint manner. We support creation of network tokens which can be used across acquiring banks
 */
public class TokenVault {
	
	private SDKConfiguration sdkConfiguration;

	public TokenVault(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete Saved Instrument
     * To delete a saved instrument for a customer id and instrument id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentResponse deleteSpecificSavedInstrument(Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Cashfree.PG_Latest.utils.Utils.generateURL(Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentRequest.class, baseUrl, "/customers/{customer_id}/instruments/{instrument_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = Cashfree.PG_Latest.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentResponse res = new Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentResponse(contentType, httpRes.statusCode()) {{
            fetchAllSavedInstruments = null;
            errorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments.class);
                res.fetchAllSavedInstruments = out;
            }
        }
        else {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }

    /**
     * Fetch All Saved Instruments
     * To get all saved instruments for a customer id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsResponse fetchAllSavedInstruments(Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Cashfree.PG_Latest.utils.Utils.generateURL(Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsRequest.class, baseUrl, "/customers/{customer_id}/instruments", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = Cashfree.PG_Latest.utils.Utils.getQueryParams(Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = Cashfree.PG_Latest.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsResponse res = new Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsResponse(contentType, httpRes.statusCode()) {{
            fetchAllSavedInstruments = null;
            errorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments[].class);
                res.fetchAllSavedInstruments = out;
            }
        }
        else {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }

    /**
     * Fetch cryptogram for saved instrument
     * To get the card network token, token expiry and cryptogram for a saved instrument using instrument id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Cashfree.PG_Latest.models.operations.FetchCryptogramResponse fetchCryptogram(Cashfree.PG_Latest.models.operations.FetchCryptogramRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Cashfree.PG_Latest.utils.Utils.generateURL(Cashfree.PG_Latest.models.operations.FetchCryptogramRequest.class, baseUrl, "/customers/{customer_id}/instruments/{instrument_id}/cryptogram", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = Cashfree.PG_Latest.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Cashfree.PG_Latest.models.operations.FetchCryptogramResponse res = new Cashfree.PG_Latest.models.operations.FetchCryptogramResponse(contentType, httpRes.statusCode()) {{
            cryptogram = null;
            errorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.Cryptogram out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.Cryptogram.class);
                res.cryptogram = out;
            }
        }
        else {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }

    /**
     * Fetch Single Saved Instrument
     * To get specific saved instrument for a customer id and instrument id
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentResponse fetchSpecificSavedInstrument(Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Cashfree.PG_Latest.utils.Utils.generateURL(Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentRequest.class, baseUrl, "/customers/{customer_id}/instruments/{instrument_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = Cashfree.PG_Latest.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentResponse res = new Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentResponse(contentType, httpRes.statusCode()) {{
            fetchAllSavedInstruments = null;
            errorResponse = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.FetchAllSavedInstruments.class);
                res.fetchAllSavedInstruments = out;
            }
        }
        else {
            res.headers = httpRes.headers().map().keySet().stream().collect(Collectors.toMap(Function.identity(), k -> httpRes.headers().allValues(k).toArray(new String[0])));
            
            if (Cashfree.PG_Latest.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Cashfree.PG_Latest.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Cashfree.PG_Latest.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}