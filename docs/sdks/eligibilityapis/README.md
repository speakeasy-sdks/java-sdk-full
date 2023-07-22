# eligibilityAPIs

### Available Operations

* [eligibilityCardlessEMI](#eligibilitycardlessemi) - Get eligible Cardless EMI
* [eligibilityOffer](#eligibilityoffer) - Get eligible Offers
* [eligibilityPaylater](#eligibilitypaylater) - Get eligible Paylater

## eligibilityCardlessEMI

Use this API to get eligible Cardless EMI Payment Methods for a customer on an order.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.EligibilityCardlessEMIRequest;
import Cashfree.PG_Latest.models.operations.EligibilityCardlessEMIResponse;
import Cashfree.PG_Latest.models.shared.CardlessEMIQueries;
import Cashfree.PG_Latest.models.shared.CustomerDetailsCardlessEMI;
import Cashfree.PG_Latest.models.shared.EligibilityCardlessEMIRequest;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            EligibilityCardlessEMIRequest req = new EligibilityCardlessEMIRequest("vel", "error") {{
                eligibilityCardlessEMIRequest = new EligibilityCardlessEMIRequest(                new CardlessEMIQueries() {{
                                    amount = 100d;
                                    customerDetails = new CustomerDetailsCardlessEMI("9898989898");;
                                    orderId = "order_413462PK1RI1IwYB1X69LgzUQWiSxYDF";
                                }};);;
                xApiVersion = "deserunt";
            }};            

            EligibilityCardlessEMIResponse res = sdk.eligibilityAPIs.eligibilityCardlessEMI(req);

            if (res.eligibleCardlessEMIEntities != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [Cashfree.PG_Latest.models.operations.EligibilityCardlessEMIRequest](../../models/operations/EligibilityCardlessEMIRequest.md) | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |


### Response

**[Cashfree.PG_Latest.models.operations.EligibilityCardlessEMIResponse](../../models/operations/EligibilityCardlessEMIResponse.md)**


## eligibilityOffer

Use this API to get eligible offers for an order or amount.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.EligibilityOfferRequest;
import Cashfree.PG_Latest.models.operations.EligibilityOfferResponse;
import Cashfree.PG_Latest.models.shared.EligibilityOffersRequest;
import Cashfree.PG_Latest.models.shared.OfferFilters;
import Cashfree.PG_Latest.models.shared.OfferQueries;
import Cashfree.PG_Latest.models.shared.OfferType;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            EligibilityOfferRequest req = new EligibilityOfferRequest("suscipit", "iure") {{
                eligibilityOffersRequest = new EligibilityOffersRequest(                new OfferQueries() {{
                                    amount = 100d;
                                    orderId = "order_413462PK1RI1IwYB1X69LgzUQWiSxYDF";
                                }};) {{
                    filters = new OfferFilters() {{
                        offerType = new Cashfree.PG_Latest.models.shared.OfferType[]{{
                            add(OfferType.NO_COST_EMI),
                            add(OfferType.DISCOUNT),
                        }};
                    }};;
                }};;
                xApiVersion = "delectus";
            }};            

            EligibilityOfferResponse res = sdk.eligibilityAPIs.eligibilityOffer(req);

            if (res.eligibleOffersEntities != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [Cashfree.PG_Latest.models.operations.EligibilityOfferRequest](../../models/operations/EligibilityOfferRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.EligibilityOfferResponse](../../models/operations/EligibilityOfferResponse.md)**


## eligibilityPaylater

Use this API to get eligible Paylater Payment Methods for a customer on an order.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.EligibilityPaylaterRequest;
import Cashfree.PG_Latest.models.operations.EligibilityPaylaterResponse;
import Cashfree.PG_Latest.models.shared.CardlessEMIQueries;
import Cashfree.PG_Latest.models.shared.CustomerDetailsCardlessEMI;
import Cashfree.PG_Latest.models.shared.EligibilityCardlessEMIRequest;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            EligibilityPaylaterRequest req = new EligibilityPaylaterRequest("tempora", "suscipit") {{
                eligibilityCardlessEMIRequest = new EligibilityCardlessEMIRequest(                new CardlessEMIQueries() {{
                                    amount = 100d;
                                    customerDetails = new CustomerDetailsCardlessEMI("9898989898");;
                                    orderId = "order_413462PK1RI1IwYB1X69LgzUQWiSxYDF";
                                }};);;
                xApiVersion = "molestiae";
            }};            

            EligibilityPaylaterResponse res = sdk.eligibilityAPIs.eligibilityPaylater(req);

            if (res.eligiblePaylaters != null) {
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
| `request`                                                                                                                | [Cashfree.PG_Latest.models.operations.EligibilityPaylaterRequest](../../models/operations/EligibilityPaylaterRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[Cashfree.PG_Latest.models.operations.EligibilityPaylaterResponse](../../models/operations/EligibilityPaylaterResponse.md)**

