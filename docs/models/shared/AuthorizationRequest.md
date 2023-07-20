# AuthorizationRequest


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `action`                                                                        | [AuthorizationRequestAction](../../models/shared/AuthorizationRequestAction.md) | :heavy_minus_sign:                                                              | Type of authorization to run. Can be one of 'CAPTURE' , 'VOID'                  |
| `amount`                                                                        | *Double*                                                                        | :heavy_minus_sign:                                                              | The amount if you are running a 'CAPTURE'                                       |