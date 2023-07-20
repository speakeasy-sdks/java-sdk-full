# settlements

### Available Operations

* [getsettlements](#getsettlements) - Get Settlements by Order ID
* [postSettlements](#postsettlements) - Get All Settlements

## getsettlements

Use this API to view all the settlements of a particular order.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetsettlementsRequest;
import Cashfree.PG_Latest.models.operations.GetsettlementsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetsettlementsRequest req = new GetsettlementsRequest("pariatur", "modi", "praesentium") {{
                xApiVersion = "rem";
            }};            

            GetsettlementsResponse res = sdk.settlements.getsettlements(req);

            if (res.settlementsEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [Cashfree.PG_Latest.models.operations.GetsettlementsRequest](../../models/operations/GetsettlementsRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[Cashfree.PG_Latest.models.operations.GetsettlementsResponse](../../models/operations/GetsettlementsResponse.md)**


## postSettlements

Use this API to get all settlement details by specifying the settlement ID, settlement UTR or date range.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.PostSettlementsRequest;
import Cashfree.PG_Latest.models.operations.PostSettlementsResponse;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequest;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequestFilters;
import Cashfree.PG_Latest.models.shared.FetchSettlementReconRequestPagination;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            PostSettlementsRequest req = new PostSettlementsRequest("voluptates", "quasi") {{
                fetchSettlementReconRequest = new FetchSettlementReconRequest(                new FetchSettlementReconRequestFilters() {{
                                    cfSettlementIds = new Long[]{{
                                        add(575947L),
                                        add(83112L),
                                        add(929297L),
                                        add(277718L),
                                    }};
                                    endDate = "enim";
                                    settlementUtrs = new String[]{{
                                        add("est"),
                                    }};
                                    startDate = "quibusdam";
                                }};,                 new FetchSettlementReconRequestPagination(131797L) {{
                                    cursor = "deserunt";
                                }};);;
                xApiVersion = "distinctio";
            }};            

            PostSettlementsResponse res = sdk.settlements.postSettlements(req);

            if (res.fetchSettlement != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Cashfree.PG_Latest.models.operations.PostSettlementsRequest](../../models/operations/PostSettlementsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Cashfree.PG_Latest.models.operations.PostSettlementsResponse](../../models/operations/PostSettlementsResponse.md)**

