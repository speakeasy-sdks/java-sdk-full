# orders

### Available Operations

* [createOrder](#createorder) - Create Order
* [getOrder](#getorder) - Get Order
* [orderPay](#orderpay) - Order Pay
* [preauthorization](#preauthorization) - Preauthorization

## createOrder

Use this API to create orders with Cashfree from your backend and get the payment link. To use this API S2S flag needs to be enabled from the backend. In case you want to use the cards payment option the PCI DSS flag is required, for more information email us at "care@cashfree.com".

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.callbacks.CreateOrderPaymentWebhookResponse;
import Cashfree.PG_Latest.models.operations.CreateOrderRequest;
import Cashfree.PG_Latest.models.operations.CreateOrderResponse;
import Cashfree.PG_Latest.models.shared.CreateOrderBackendRequest;
import Cashfree.PG_Latest.models.shared.CustomerDetails;
import Cashfree.PG_Latest.models.shared.OrderMeta;
import Cashfree.PG_Latest.models.shared.PaymentSuccessWebhook;
import Cashfree.PG_Latest.models.shared.TerminalDetails;
import Cashfree.PG_Latest.models.shared.VendorSplit;
import Cashfree.PG_Latest.models.shared.WHcard;
import Cashfree.PG_Latest.models.shared.WHcustomerDetails;
import Cashfree.PG_Latest.models.shared.WHdata;
import Cashfree.PG_Latest.models.shared.WHorder;
import Cashfree.PG_Latest.models.shared.WHpayment;
import Cashfree.PG_Latest.models.shared.WHpaymentMethod;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            CreateOrderRequest req = new CreateOrderRequest("sapiente", "quo") {{
                createOrderBackendRequest = new CreateOrderBackendRequest(                new CustomerDetails("odit", "at") {{
                                    customerBankAccountNumber = "at";
                                    customerBankCode = "maiores";
                                    customerBankIfsc = "molestiae";
                                    customerEmail = "quod";
                                }};, 10.15d, "INR") {{
                    orderExpiryTime = "2021-07-29T00:00:00Z";
                    orderId = "quod";
                    orderMeta = new OrderMeta() {{
                        notifyUrl = "esse";
                        paymentMethods = "totam";
                        returnUrl = "porro";
                    }};;
                    orderNote = "Test order";
                    orderSplits = new Cashfree.PG_Latest.models.shared.VendorSplit[]{{
                        add(new VendorSplit() {{
                            amount = 1182.74d;
                            percentage = 7206.33d;
                            vendorId = "officia";
                        }}),
                        add(new VendorSplit() {{
                            amount = 5820.2d;
                            percentage = 1433.53d;
                            vendorId = "deleniti";
                        }}),
                        add(new VendorSplit() {{
                            amount = 9446.69d;
                            percentage = 7586.16d;
                            vendorId = "totam";
                        }}),
                    }};
                    orderTags = new java.util.HashMap<String, String>() {{
                        put("commodi", "molestiae");
                    }};
                    terminal = new TerminalDetails("modi", "qui", "impedit");;
                }};;
                xApiVersion = "cum";
            }};            

            CreateOrderResponse res = sdk.orders.createOrder(req);

            if (res.ordersEntity != null) {
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
| `request`                                                                                                | [Cashfree.PG_Latest.models.operations.CreateOrderRequest](../../models/operations/CreateOrderRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[Cashfree.PG_Latest.models.operations.CreateOrderResponse](../../models/operations/CreateOrderResponse.md)**


## getOrder

Use this API to view all details of an order.

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.GetOrderRequest;
import Cashfree.PG_Latest.models.operations.GetOrderResponse;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            GetOrderRequest req = new GetOrderRequest("esse", "ipsum", "excepturi") {{
                xApiVersion = "aspernatur";
            }};            

            GetOrderResponse res = sdk.orders.getOrder(req);

            if (res.ordersEntity != null) {
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
| `request`                                                                                          | [Cashfree.PG_Latest.models.operations.GetOrderRequest](../../models/operations/GetOrderRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.GetOrderResponse](../../models/operations/GetOrderResponse.md)**


## orderPay

Use this API when you have already created the orders and want Cashfree to process the payment. To use this API S2S flag needs to be enabled from the backend. In case you want to use the cards payment option the PCI DSS flag is required, for more information send an email to "care@cashfree.com".

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.OrderPayRequest;
import Cashfree.PG_Latest.models.operations.OrderPayResponse;
import Cashfree.PG_Latest.models.shared.App;
import Cashfree.PG_Latest.models.shared.AppPaymentMethod;
import Cashfree.PG_Latest.models.shared.AppProvider;
import Cashfree.PG_Latest.models.shared.Card;
import Cashfree.PG_Latest.models.shared.CardCardBankName;
import Cashfree.PG_Latest.models.shared.CardChannel;
import Cashfree.PG_Latest.models.shared.CardEMI;
import Cashfree.PG_Latest.models.shared.CardEMICardBankName;
import Cashfree.PG_Latest.models.shared.CardEMIPaymentMethod;
import Cashfree.PG_Latest.models.shared.CardPaymentMethod;
import Cashfree.PG_Latest.models.shared.CardlessEMI;
import Cashfree.PG_Latest.models.shared.CardlessEMIPaymentMethod;
import Cashfree.PG_Latest.models.shared.CardlessEMIProvider;
import Cashfree.PG_Latest.models.shared.NetBankingPaymentMethod;
import Cashfree.PG_Latest.models.shared.Netbanking;
import Cashfree.PG_Latest.models.shared.OrderPayRequest;
import Cashfree.PG_Latest.models.shared.Paylater;
import Cashfree.PG_Latest.models.shared.PaylaterPaymentMethod;
import Cashfree.PG_Latest.models.shared.PaylaterProvider;
import Cashfree.PG_Latest.models.shared.UPIAuthorizeDetails;
import Cashfree.PG_Latest.models.shared.UPIPaymentMethod;
import Cashfree.PG_Latest.models.shared.Upi;
import Cashfree.PG_Latest.models.shared.UpiChannel;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            OrderPayRequest req = new OrderPayRequest("perferendis") {{
                orderPayRequest = new OrderPayRequest(                new NetBankingPaymentMethod(                new Netbanking("natus", 386489);) {{
                                    netbanking = new Netbanking("iste", 222321) {{
                                        channel = "natus";
                                        netbankingBankCode = 149675;
                                    }};
                                }}, "session__CvcEmNKDkmERQrxnx39ibhJ3Ii034pjc8ZVxf3qcgEXCWlgDDlHRgz2XYZCqpajDQSXMMtCusPgOIxYP2LZx0-05p39gC2Vgmq1RAj--gcn") {{
                    offerId = "faa6cc05-d1e2-401c-b0cf-0c9db3ff0f0b";
                    saveInstrument = false;
                }};;
            }};            

            OrderPayResponse res = sdk.orders.orderPay(req);

            if (res.orderPayResponse != null) {
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
| `request`                                                                                          | [Cashfree.PG_Latest.models.operations.OrderPayRequest](../../models/operations/OrderPayRequest.md) | :heavy_check_mark:                                                                                 | The request object to use for the request.                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.OrderPayResponse](../../models/operations/OrderPayResponse.md)**


## preauthorization

Use this API to capture or void a preauthorized payment

### Example Usage

```java
package hello.world;

import Cashfree.PG_Latest.PGLatest;
import Cashfree.PG_Latest.models.operations.PreauthorizationRequest;
import Cashfree.PG_Latest.models.operations.PreauthorizationResponse;
import Cashfree.PG_Latest.models.shared.AuthorizationRequest;
import Cashfree.PG_Latest.models.shared.AuthorizationRequestAction;

public class Application {
    public static void main(String[] args) {
        try {
            PGLatest sdk = PGLatest.builder()
                .build();

            PreauthorizationRequest req = new PreauthorizationRequest("hic", "saepe", "fuga") {{
                authorizationRequest = new AuthorizationRequest() {{
                    action = AuthorizationRequestAction.CAPTURE;
                    amount = 3595.08d;
                }};;
                xApiVersion = "iste";
            }};            

            PreauthorizationResponse res = sdk.orders.preauthorization(req);

            if (res.paymentsEntity != null) {
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
| `request`                                                                                                          | [Cashfree.PG_Latest.models.operations.PreauthorizationRequest](../../models/operations/PreauthorizationRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[Cashfree.PG_Latest.models.operations.PreauthorizationResponse](../../models/operations/PreauthorizationResponse.md)**

