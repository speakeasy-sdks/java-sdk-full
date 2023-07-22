# FetchPGReconData


## Fields

| Field                                                                                                                                             | Type                                                                                                                                              | Required                                                                                                                                          | Description                                                                                                                                       |
| ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| `adjustment`                                                                                                                                      | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Amount that is adjusted from the settlement amount because of any credit/debit event such as refund, refund_reverse etc.                          |
| `adjustmentRemarks`                                                                                                                               | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Other adjustment remarks.                                                                                                                         |
| `amountSettled`                                                                                                                                   | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Net amount that is settled after considering the adjustments, settlement charge and tax.                                                          |
| `cfPaymentId`                                                                                                                                     | *Long*                                                                                                                                            | :heavy_minus_sign:                                                                                                                                | Cashfree Payments unique ID to identify a payment.                                                                                                |
| `cfSettlementId`                                                                                                                                  | *Long*                                                                                                                                            | :heavy_minus_sign:                                                                                                                                | Unique ID to identify the settlement.                                                                                                             |
| `closedInFavorOf`                                                                                                                                 | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Specifies whether the dispute was closed in favor of the merchant or customer. /n Possible values - Merchant, Customer                            |
| `customerEmail`                                                                                                                                   | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Customer email.                                                                                                                                   |
| `customerName`                                                                                                                                    | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Customer name.                                                                                                                                    |
| `customerPhone`                                                                                                                                   | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Customer phone number.                                                                                                                            |
| `disputeCategory`                                                                                                                                 | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Category of the dispute - Dispute code and the reason for dispute is shown.                                                                       |
| `disputeNote`                                                                                                                                     | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Note regarding the dispute.                                                                                                                       |
| `disputeResolvedOn`                                                                                                                               | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Date and time when the dispute was resolved.                                                                                                      |
| `entity`                                                                                                                                          | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Recon                                                                                                                                             |
| `eventAmount`                                                                                                                                     | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Amount of the event. Example, refund amount, dispute amount, payment amount, etc.                                                                 |
| `eventCurrency`                                                                                                                                   | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Curreny type - INR.                                                                                                                               |
| `eventId`                                                                                                                                         | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Unique ID associated with the event.                                                                                                              |
| `eventSettlementAmount`                                                                                                                           | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Amount that is part of the settlement corresponding to the event.                                                                                 |
| `eventStatus`                                                                                                                                     | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Status of the event. Example - SUCCESS, FAILED, PENDING, CANCELLED.                                                                               |
| `eventTime`                                                                                                                                       | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Time associated with the event. Example, transaction time, dispute initiation time                                                                |
| `eventType`                                                                                                                                       | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | The event type can be SETTLEMENT, PAYMENT, REFUND, REFUND_REVERSAL, DISPUTE, DISPUTE_REVERSAL, CHARGEBACK, CHARGEBACK_REVERSAL, OTHER_ADJUSTMENT. |
| `orderAmount`                                                                                                                                     | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | The amount which was passed at the order creation time.                                                                                           |
| `orderId`                                                                                                                                         | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Unique order ID. Alphanumeric and only '-' and '_' allowed.                                                                                       |
| `paymentAmount`                                                                                                                                   | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Payment amount captured.                                                                                                                          |
| `paymentFrom`                                                                                                                                     | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | The start time of the time range of the payments considered for the settlement.                                                                   |
| `paymentServiceCharge`                                                                                                                            | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service charge applicable for the payment.                                                                                                        |
| `paymentServiceTax`                                                                                                                               | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service tax applicable on the payment.                                                                                                            |
| `paymentTill`                                                                                                                                     | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | The end time of time range of the payments considered for the settlement.                                                                         |
| `paymentTime`                                                                                                                                     | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Date and time when the payment was initiated.                                                                                                     |
| `paymentUtr`                                                                                                                                      | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Unique transaction reference number of the payment.                                                                                               |
| `reason`                                                                                                                                          | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Reason for settlement failure.                                                                                                                    |
| `refundArn`                                                                                                                                       | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | The bank reference number for the refund.                                                                                                         |
| `refundId`                                                                                                                                        | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | An unique ID to associate the refund with.                                                                                                        |
| `refundNote`                                                                                                                                      | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | A refund note for your reference.                                                                                                                 |
| `refundProcessedAt`                                                                                                                               | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Date and time when the refund was processed.                                                                                                      |
| `remarks`                                                                                                                                         | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Remarks on the settlement.                                                                                                                        |
| `saleType`                                                                                                                                        | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Indicates if it is CREDIT/DEBIT sale.                                                                                                             |
| `serviceCharge`                                                                                                                                   | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service charge applicable on the settlement amount.                                                                                               |
| `serviceTax`                                                                                                                                      | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service tax applicable on the settlement amount.                                                                                                  |
| `settlementCharge`                                                                                                                                | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Settlement charges applicable on the settlement.                                                                                                  |
| `settlementDate`                                                                                                                                  | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Date and time when the settlement was processed.                                                                                                  |
| `settlementInitiatedOn`                                                                                                                           | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Date and time when the settlement was initiated.                                                                                                  |
| `settlementTax`                                                                                                                                   | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Settlement tax applicable on the settlement.                                                                                                      |
| `settlementType`                                                                                                                                  | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Type of settlement. Possible values - Standard, Instant, On demand.                                                                               |
| `settlementUtr`                                                                                                                                   | *String*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Unique transaction reference number of the settlement.                                                                                            |
| `splitServiceCharge`                                                                                                                              | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service charge that is applicable for splitting the payment.                                                                                      |
| `splitServiceTax`                                                                                                                                 | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Service tax applicable for splitting the amount to vendors.                                                                                       |
| `vendorCommission`                                                                                                                                | *Double*                                                                                                                                          | :heavy_minus_sign:                                                                                                                                | Vendor commission applicable for this transaction.                                                                                                |