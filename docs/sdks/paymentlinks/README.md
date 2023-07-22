# paymentLinks

### Available Operations

* [cancelPaymentLink](#cancelpaymentlink) - Cancel Payment Link
* [createPaymentLink](#createpaymentlink) - Create Payment Link
* [getPaymentLinkDetails](#getpaymentlinkdetails) - Fetch Payment Link Details
* [getPaymentLinkOrders](#getpaymentlinkorders) - Get Orders for a Payment Link

## cancelPaymentLink

Use this API to cancel a payment link. No further payments can be done against a cancelled link. Only a link in ACTIVE status can be cancelled.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.CancelPaymentLinkRequest;
import Cashfree.PG_Latest.models.operations.CancelPaymentLinkResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CancelPaymentLinkRequest req = new CancelPaymentLinkRequest("iure", "saepe", "quidem") {{
                xApiVersion = "architecto";
            }};            

            CancelPaymentLinkResponse res = sdk.paymentLinks.cancelPaymentLink(req);

            if (res.linkCancelledResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Cashfree.PG_Latest.models.operations.CancelPaymentLinkRequest](../../models/operations/CancelPaymentLinkRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Cashfree.PG_Latest.models.operations.CancelPaymentLinkResponse](../../models/operations/CancelPaymentLinkResponse.md)**


## createPaymentLink

Use this API to create a new payment link. The created payment link url will be available in the API response parameter link_url.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.CreatePaymentLinkRequest;
import Cashfree.PG_Latest.models.operations.CreatePaymentLinkResponse;
import Cashfree.PG_Latest.models.shared.CreateLinkRequest;
import Cashfree.PG_Latest.models.shared.LinkCustomerDetailsEntity;
import Cashfree.PG_Latest.models.shared.LinkMetaEntity;
import Cashfree.PG_Latest.models.shared.LinkNotifyEntity;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CreatePaymentLinkRequest req = new CreatePaymentLinkRequest("ipsa", "reiciendis") {{
                createLinkRequest = new CreateLinkRequest(                new LinkCustomerDetailsEntity("est") {{
                                    customerEmail = "mollitia";
                                    customerName = "laborum";
                                }};, 1709.09d, "dolorem", "corporis", "explicabo") {{
                    linkAutoReminders = false;
                    linkExpiryTime = "nobis";
                    linkMeta = new LinkMetaEntity() {{
                        notifyUrl = "enim";
                        paymentMethods = "omnis";
                        returnUrl = "nemo";
                        upiIntent = false;
                    }};;
                    linkMinimumPartialAmount = 3250.47d;
                    linkNotes = new java.util.HashMap<String, String>() {{
                        put("accusantium", "iure");
                        put("culpa", "doloribus");
                        put("sapiente", "architecto");
                    }};
                    linkNotify = new LinkNotifyEntity() {{
                        sendEmail = false;
                        sendSms = false;
                    }};;
                    linkPartialPayments = false;
                }};;
                xApiVersion = "mollitia";
            }};            

            CreatePaymentLinkResponse res = sdk.paymentLinks.createPaymentLink(req);

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Cashfree.PG_Latest.models.operations.CreatePaymentLinkRequest](../../models/operations/CreatePaymentLinkRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Cashfree.PG_Latest.models.operations.CreatePaymentLinkResponse](../../models/operations/CreatePaymentLinkResponse.md)**


## getPaymentLinkDetails

Use this API to view all details and status of a payment link.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetPaymentLinkDetailsRequest;
import Cashfree.PG_Latest.models.operations.GetPaymentLinkDetailsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetPaymentLinkDetailsRequest req = new GetPaymentLinkDetailsRequest("dolorem", "culpa", "consequuntur") {{
                xApiVersion = "repellat";
            }};            

            GetPaymentLinkDetailsResponse res = sdk.paymentLinks.getPaymentLinkDetails(req);

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [Cashfree.PG_Latest.models.operations.GetPaymentLinkDetailsRequest](../../models/operations/GetPaymentLinkDetailsRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Cashfree.PG_Latest.models.operations.GetPaymentLinkDetailsResponse](../../models/operations/GetPaymentLinkDetailsResponse.md)**


## getPaymentLinkOrders

Use this API to view all order details for a payment link.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetPaymentLinkOrdersRequest;
import Cashfree.PG_Latest.models.operations.GetPaymentLinkOrdersResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetPaymentLinkOrdersRequest req = new GetPaymentLinkOrdersRequest("mollitia", "occaecati", "numquam") {{
                xApiVersion = "commodi";
            }};            

            GetPaymentLinkOrdersResponse res = sdk.paymentLinks.getPaymentLinkOrders(req);

            if (res.linkOrdersResponses != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [Cashfree.PG_Latest.models.operations.GetPaymentLinkOrdersRequest](../../models/operations/GetPaymentLinkOrdersRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Cashfree.PG_Latest.models.operations.GetPaymentLinkOrdersResponse](../../models/operations/GetPaymentLinkOrdersResponse.md)**

