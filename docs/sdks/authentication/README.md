# authentication

## Overview

The Authentication API allows merchants to show a native screen and capture OTP on their own page and submit to Cashfree. This feature is only available on request.

### Available Operations

* [otpRequest](#otprequest) - Submit or Resend OTP

## otpRequest

If you accept OTP on your own page, you can use the below API to send OTP to Cashfree.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.OTPRequestRequest;
import Cashfree.PG_Latest.models.operations.OTPRequestResponse;
import Cashfree.PG_Latest.models.shared.OTPRequest;
import Cashfree.PG_Latest.models.shared.OTPRequestAction;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            OTPRequestRequest req = new OTPRequestRequest("unde") {{
                otpRequest = new OTPRequest(OTPRequestAction.RESEND_OTP, "corrupti");;
                xApiVersion = "illum";
            }};            

            OTPRequestResponse res = sdk.authentication.otpRequest(req);

            if (res.otpResponseEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [Cashfree.PG_Latest.models.operations.OTPRequestRequest](../../models/operations/OTPRequestRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[Cashfree.PG_Latest.models.operations.OTPRequestResponse](../../models/operations/OTPRequestResponse.md)**

