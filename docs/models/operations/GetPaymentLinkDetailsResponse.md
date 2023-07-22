# GetPaymentLinkDetailsResponse


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `contentType`                                                                                                            | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `headers`                                                                                                                | Map<String, List<*String*>>                                                                                              | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |
| `linkResponse`                                                                                                           | [Cashfree.PG_Latest.models.shared.LinkResponse](../../models/shared/LinkResponse.md)                                     | :heavy_minus_sign:                                                                                                       | OK                                                                                                                       |
| `statusCode`                                                                                                             | *Integer*                                                                                                                | :heavy_check_mark:                                                                                                       | N/A                                                                                                                      |
| `rawResponse`                                                                                                            | [HttpResponse<byte[]>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                       | N/A                                                                                                                      |