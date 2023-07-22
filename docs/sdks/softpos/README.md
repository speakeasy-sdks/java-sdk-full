# softPOS

## Overview

softPOS' agent and order management system now supported by APIs

### Available Operations

* [createTerminals](#createterminals) - Create Terminal
* [getTerminalByMobileNumber](#getterminalbymobilenumber) - Get terminal status using phone number

## createTerminals

Use this API to create new terminals to use softPOS.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.CreateTerminalsRequest;
import Cashfree.PG_Latest.models.operations.CreateTerminalsResponse;
import Cashfree.PG_Latest.models.shared.CreateTerminalRequest;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CreateTerminalsRequest req = new CreateTerminalsRequest("delectus", "eum") {{
                createTerminalRequest = new CreateTerminalRequest("non", "eligendi") {{
                    terminalId = "sint";
                }};;
                xApiVersion = "aliquid";
            }};            

            CreateTerminalsResponse res = sdk.softPOS.createTerminals(req);

            if (res.terminalResponse != null) {
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
| `request`                                                                                                        | [Cashfree.PG_Latest.models.operations.CreateTerminalsRequest](../../models/operations/CreateTerminalsRequest.md) | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |


### Response

**[Cashfree.PG_Latest.models.operations.CreateTerminalsResponse](../../models/operations/CreateTerminalsResponse.md)**


## getTerminalByMobileNumber

Use this API to view all details of a terminal.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetTerminalByMobileNumberRequest;
import Cashfree.PG_Latest.models.operations.GetTerminalByMobileNumberResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetTerminalByMobileNumberRequest req = new GetTerminalByMobileNumberRequest("provident", "necessitatibus", "sint") {{
                xApiVersion = "officia";
            }};            

            GetTerminalByMobileNumberResponse res = sdk.softPOS.getTerminalByMobileNumber(req);

            if (res.terminalDetails != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                            | [Cashfree.PG_Latest.models.operations.GetTerminalByMobileNumberRequest](../../models/operations/GetTerminalByMobileNumberRequest.md) | :heavy_check_mark:                                                                                                                   | The request object to use for the request.                                                                                           |


### Response

**[Cashfree.PG_Latest.models.operations.GetTerminalByMobileNumberResponse](../../models/operations/GetTerminalByMobileNumberResponse.md)**

