# reconciliation

### Available Operations

* [postRecon](#postrecon) - PG Reconciliation
* [postSettlementRecon](#postsettlementrecon) - Settlement Reconciliation

## postRecon

Use this API to get the payment gateway reconciliation details with date range.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.PostReconRequest;
import Cashfree.PG_Latest.models.operations.PostReconResponse;
import Cashfree.PG_Latest.models.shared.FetchPGReconRequest;
import Cashfree.PG_Latest.models.shared.FetchPGReconRequestFilters;
import Cashfree.PG_Latest.models.shared.FetchPGReconRequestPagination;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            PostReconRequest req = new PostReconRequest("enim", "odit") {{
                fetchPGReconRequest = new FetchPGReconRequest(                new FetchPGReconRequestFilters("quo", "sequi");,                 new FetchPGReconRequestPagination(949572L) {{
                                    cursor = "ipsam";
                                }};);;
                xApiVersion = "id";
            }};            

            PostReconResponse res = sdk.reconciliation.postRecon(req);

            if (res.fetchPGRecon != null) {
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
| `request`                                                                                            | [Cashfree.PG_Latest.models.operations.PostReconRequest](../../models/operations/PostReconRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Cashfree.PG_Latest.models.operations.PostReconResponse](../../models/operations/PostReconResponse.md)**


## postSettlementRecon

Use this API to get settlement reconciliation details using Settlement ID, settlement UTR or date range.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.PostSettlementReconRequest;
import Cashfree.PG_Latest.models.operations.PostSettlementReconResponse;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequest;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequestFilters;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequestPagination;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            PostSettlementReconRequest req = new PostSettlementReconRequest("possimus", "aut") {{
                fetchSettlementReconRequest = new FetchSettlementReconRequest(                new FetchSettlementReconRequestFilters() {{
                                    cfSettlementIds = new Long[]{{
                                        add(622846L),
                                    }};
                                    endDate = "temporibus";
                                    settlementUtrs = new String[]{{
                                        add("quasi"),
                                        add("reiciendis"),
                                        add("voluptatibus"),
                                    }};
                                    startDate = "vero";
                                }};,                 new FetchSettlementReconRequestPagination(468651L) {{
                                    cursor = "praesentium";
                                }};);;
                xApiVersion = "voluptatibus";
            }};            

            PostSettlementReconResponse res = sdk.reconciliation.postSettlementRecon(req);

            if (res.fetchSettlementRecon != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [Cashfree.PG_Latest.models.operations.PostSettlementReconRequest](../../models/operations/PostSettlementReconRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Cashfree.PG_Latest.models.operations.PostSettlementReconResponse](../../models/operations/PostSettlementReconResponse.md)**

