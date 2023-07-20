# refunds

### Available Operations

* [createrefund](#createrefund) - Create Refund
* [getRefund](#getrefund) - Get Refund
* [getallrefundsfororder](#getallrefundsfororder) - Get All Refunds for an Order

## createrefund

Use this API to initiate refunds.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.CreaterefundRequest;
import Cashfree.PG_Latest.models.operations.CreaterefundResponse;
import Cashfree.PG_Latest.models.shared.CreateRefundRequest;
import Cashfree.PG_Latest.models.shared.CreateRefundRequestRefundSpeed;
import Cashfree.PG_Latest.models.shared.VendorSplit;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CreaterefundRequest req = new CreaterefundRequest("ipsa", "omnis", "voluptate") {{
                createRefundRequest = new CreateRefundRequest(7392.64d, "perferendis") {{
                    refundNote = "doloremque";
                    refundSpeed = CreateRefundRequestRefundSpeed.STANDARD;
                    refundSplits = new Cashfree.PG_Latest.models.shared.VendorSplit[]{{
                        add(new VendorSplit() {{
                            amount = 9795.87d;
                            percentage = 1201.96d;
                            vendorId = "corporis";
                        }}),
                        add(new VendorSplit() {{
                            amount = 2961.4d;
                            percentage = 4808.94d;
                            vendorId = "dicta";
                        }}),
                    }};
                }};;
                xApiVersion = "harum";
            }};            

            CreaterefundResponse res = sdk.refunds.createrefund(req);

            if (res.refundsEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [Cashfree.PG_Latest.models.operations.CreaterefundRequest](../../models/operations/CreaterefundRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[Cashfree.PG_Latest.models.operations.CreaterefundResponse](../../models/operations/CreaterefundResponse.md)**


## getRefund

Use this API to fetch a specific refund processed on your Cashfree Account.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetRefundRequest;
import Cashfree.PG_Latest.models.operations.GetRefundResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetRefundRequest req = new GetRefundRequest("enim", "accusamus", "commodi", "repudiandae") {{
                xApiVersion = "quae";
            }};            

            GetRefundResponse res = sdk.refunds.getRefund(req);

            if (res.refundsEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [Cashfree.PG_Latest.models.operations.GetRefundRequest](../../models/operations/GetRefundRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Cashfree.PG_Latest.models.operations.GetRefundResponse](../../models/operations/GetRefundResponse.md)**


## getallrefundsfororder

Use this API to fetch all refunds processed against an order.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetallrefundsfororderRequest;
import Cashfree.PG_Latest.models.operations.GetallrefundsfororderResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetallrefundsfororderRequest req = new GetallrefundsfororderRequest("ipsum", "quidem", "molestias") {{
                xApiVersion = "excepturi";
            }};            

            GetallrefundsfororderResponse res = sdk.refunds.getallrefundsfororder(req);

            if (res.refundsEntities != null) {
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
| `request`                                                                                                                    | [Cashfree.PG_Latest.models.operations.GetallrefundsfororderRequest](../../models/operations/GetallrefundsfororderRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[Cashfree.PG_Latest.models.operations.GetallrefundsfororderResponse](../../models/operations/GetallrefundsfororderResponse.md)**

