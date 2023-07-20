# offers

### Available Operations

* [createOffer](#createoffer) - Create Offer
* [getOffer](#getoffer) - Get Offer by ID

## createOffer

Use this API to create offers with Cashfree from your backend

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.CreateOfferRequest;
import Cashfree.PG_Latest.models.operations.CreateOfferResponse;
import Cashfree.PG_Latest.models.shared.All;
import Cashfree.PG_Latest.models.shared.CardOffer;
import Cashfree.PG_Latest.models.shared.CashbackDetails;
import Cashfree.PG_Latest.models.shared.CashbackDetailsCashbackType;
import Cashfree.PG_Latest.models.shared.CreateOfferBackendRequest;
import Cashfree.PG_Latest.models.shared.DiscountDetails;
import Cashfree.PG_Latest.models.shared.DiscountDetailsDiscountType;
import Cashfree.PG_Latest.models.shared.EMIOffer;
import Cashfree.PG_Latest.models.shared.NBOffer;
import Cashfree.PG_Latest.models.shared.OfferAll;
import Cashfree.PG_Latest.models.shared.OfferCard;
import Cashfree.PG_Latest.models.shared.OfferDetails;
import Cashfree.PG_Latest.models.shared.OfferDetailsOfferType;
import Cashfree.PG_Latest.models.shared.OfferEMI;
import Cashfree.PG_Latest.models.shared.OfferMeta;
import Cashfree.PG_Latest.models.shared.OfferNB;
import Cashfree.PG_Latest.models.shared.OfferPaylater;
import Cashfree.PG_Latest.models.shared.OfferTnc;
import Cashfree.PG_Latest.models.shared.OfferTncOfferTncType;
import Cashfree.PG_Latest.models.shared.OfferUPI;
import Cashfree.PG_Latest.models.shared.OfferValidations;
import Cashfree.PG_Latest.models.shared.OfferWallet;
import Cashfree.PG_Latest.models.shared.PaylaterOffer;
import Cashfree.PG_Latest.models.shared.UPIOffer;
import Cashfree.PG_Latest.models.shared.WalletOffer;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CreateOfferRequest req = new CreateOfferRequest("minus", "placeat") {{
                createOfferBackendRequest = new CreateOfferBackendRequest(                new OfferDetails(OfferDetailsOfferType.DISCOUNT_AND_CASHBACK) {{
                                    cashbackDetails = new CashbackDetails("voluptatum") {{
                                        cashbackType = CashbackDetailsCashbackType.FLAT;
                                        cashbackValue = "excepturi";
                                    }};;
                                    discountDetails = new DiscountDetails(DiscountDetailsDiscountType.FLAT, "recusandae", "temporibus");;
                                }};,                 new OfferMeta("CFTESTOFFER", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "2023-03-29T08:09:51Z", "2023-03-21T08:09:51Z", "Test Offer");,                 new OfferTnc(OfferTncOfferTncType.LINK, "Lorem ipsum dolor sit amet, consectetur adipiscing elit");,                 new OfferValidations("10",                 new OfferNB() {{
                                                    netbanking = new NBOffer("all") {{
                                                        bankName = "all";
                                                    }};
                                                }}) {{
                                    minAmount = "1";
                                }};);;
                xApiVersion = "veritatis";
            }};            

            CreateOfferResponse res = sdk.offers.createOffer(req);

            if (res.offerEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [Cashfree.PG_Latest.models.operations.CreateOfferRequest](../../models/operations/CreateOfferRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Cashfree.PG_Latest.models.operations.CreateOfferResponse](../../models/operations/CreateOfferResponse.md)**


## getOffer

Use this API to get offer by offer_id

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetOfferRequest;
import Cashfree.PG_Latest.models.operations.GetOfferResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetOfferRequest req = new GetOfferRequest("deserunt", "perferendis", "ipsam") {{
                xApiVersion = "repellendus";
            }};            

            GetOfferResponse res = sdk.offers.getOffer(req);

            if (res.offerEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `request`                                                                                          | [Cashfree.PG_Latest.models.operations.GetOfferRequest](../../models/operations/GetOfferRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.GetOfferResponse](../../models/operations/GetOfferResponse.md)**

