# FetchPGRecon

OK


## Fields

| Field                                                                      | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `cursor`                                                                   | *String*                                                                   | :heavy_minus_sign:                                                         | Specifies from where the next set of settlement details should be fetched. |
| `data`                                                                     | List<[FetchPGReconData](../../models/shared/FetchPGReconData.md)>          | :heavy_minus_sign:                                                         | N/A                                                                        |
| `limit`                                                                    | *Long*                                                                     | :heavy_minus_sign:                                                         | Number of settlements you want to fetch in the next iteration.             |