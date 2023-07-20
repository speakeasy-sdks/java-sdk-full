# OTPRequest


## Fields

| Field                                                                  | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `action`                                                               | [OTPRequestAction](../../models/shared/OTPRequestAction.md)            | :heavy_check_mark:                                                     | The action for this workflow. Could be either SUBMIT_OTP or RESEND_OTP |
| `otp`                                                                  | *String*                                                               | :heavy_check_mark:                                                     | OTP to be submitted                                                    |