# FetchSettlementReconRequestFilters

Specify either the Settlement ID, Settlement UTR, or start date and end date to fetch the settlement details.


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `cfSettlementIds`                                                                 | List<*Long*>                                                                      | :heavy_minus_sign:                                                                | List of settlement IDs for which you want the settlement reconciliation details.  |
| `endDate`                                                                         | *String*                                                                          | :heavy_minus_sign:                                                                | Specify the end date till when you want the settlement reconciliation details.    |
| `settlementUtrs`                                                                  | List<*String*>                                                                    | :heavy_minus_sign:                                                                | List of settlement UTRs for which you want the settlement reconciliation details. |
| `startDate`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | Specify the start date from when you want the settlement reconciliation details.  |