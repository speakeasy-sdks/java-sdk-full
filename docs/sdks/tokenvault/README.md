# tokenVault

## Overview

Cashfree's token Vault helps you save cards and tokenize them in a PCI complaint manner. We support creation of network tokens which can be used across acquiring banks

### Available Operations

* [deleteSpecificSavedInstrument](#deletespecificsavedinstrument) - Delete Saved Instrument
* [fetchAllSavedInstruments](#fetchallsavedinstruments) - Fetch All Saved Instruments
* [fetchCryptogram](#fetchcryptogram) - Fetch cryptogram for saved instrument
* [fetchSpecificSavedInstrument](#fetchspecificsavedinstrument) - Fetch Single Saved Instrument

## deleteSpecificSavedInstrument

To delete a saved instrument for a customer id and instrument id

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentRequest;
import Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            DeleteSpecificSavedInstrumentRequest req = new DeleteSpecificSavedInstrumentRequest("quibusdam", "labore", "modi", "qui") {{
                xApiVersion = "aliquid";
            }};            

            DeleteSpecificSavedInstrumentResponse res = sdk.tokenVault.deleteSpecificSavedInstrument(req);

            if (res.fetchAllSavedInstruments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                    | Type                                                                                                                                         | Required                                                                                                                                     | Description                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                    | [Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentRequest](../../models/operations/DeleteSpecificSavedInstrumentRequest.md) | :heavy_check_mark:                                                                                                                           | The request object to use for the request.                                                                                                   |


### Response

**[Cashfree.PG_Latest.models.operations.DeleteSpecificSavedInstrumentResponse](../../models/operations/DeleteSpecificSavedInstrumentResponse.md)**


## fetchAllSavedInstruments

To get all saved instruments for a customer id

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsInstrumentType;
import Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsRequest;
import Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            FetchAllSavedInstrumentsRequest req = new FetchAllSavedInstrumentsRequest("cupiditate", FetchAllSavedInstrumentsInstrumentType.CARD, "quos", "perferendis") {{
                xApiVersion = "magni";
            }};            

            FetchAllSavedInstrumentsResponse res = sdk.tokenVault.fetchAllSavedInstruments(req);

            if (res.fetchAllSavedInstruments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                          | [Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsRequest](../../models/operations/FetchAllSavedInstrumentsRequest.md) | :heavy_check_mark:                                                                                                                 | The request object to use for the request.                                                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.FetchAllSavedInstrumentsResponse](../../models/operations/FetchAllSavedInstrumentsResponse.md)**


## fetchCryptogram

To get the card network token, token expiry and cryptogram for a saved instrument using instrument id

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.FetchCryptogramRequest;
import Cashfree.PG_Latest.models.operations.FetchCryptogramResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            FetchCryptogramRequest req = new FetchCryptogramRequest("assumenda", "ipsam", "alias", "fugit") {{
                xApiVersion = "dolorum";
            }};            

            FetchCryptogramResponse res = sdk.tokenVault.fetchCryptogram(req);

            if (res.cryptogram != null) {
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
| `request`                                                                                                        | [Cashfree.PG_Latest.models.operations.FetchCryptogramRequest](../../models/operations/FetchCryptogramRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Cashfree.PG_Latest.models.operations.FetchCryptogramResponse](../../models/operations/FetchCryptogramResponse.md)**


## fetchSpecificSavedInstrument

To get specific saved instrument for a customer id and instrument id

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentRequest;
import Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            FetchSpecificSavedInstrumentRequest req = new FetchSpecificSavedInstrumentRequest("excepturi", "tempora", "facilis", "tempore") {{
                xApiVersion = "labore";
            }};            

            FetchSpecificSavedInstrumentResponse res = sdk.tokenVault.fetchSpecificSavedInstrument(req);

            if (res.fetchAllSavedInstruments != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                                  | [Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentRequest](../../models/operations/FetchSpecificSavedInstrumentRequest.md) | :heavy_check_mark:                                                                                                                         | The request object to use for the request.                                                                                                 |


### Response

**[Cashfree.PG_Latest.models.operations.FetchSpecificSavedInstrumentResponse](../../models/operations/FetchSpecificSavedInstrumentResponse.md)**

