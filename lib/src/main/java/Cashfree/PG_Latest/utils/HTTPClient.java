/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG_Latest.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public interface HTTPClient {
    public HttpResponse<byte[]> send(HTTPRequest request)
            throws IOException, InterruptedException, URISyntaxException;
}
