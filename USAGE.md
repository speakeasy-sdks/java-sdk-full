<!-- Start SDK Example Usage -->


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

            OTPRequestRequest req = new OTPRequestRequest("corrupti") {{
                otpRequest = new OTPRequest(OTPRequestAction.RESEND_OTP, "distinctio");;
                xApiVersion = "quibusdam";
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
<!-- End SDK Example Usage -->