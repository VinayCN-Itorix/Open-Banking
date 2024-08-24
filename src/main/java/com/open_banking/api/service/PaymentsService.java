package com.open_banking.api.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/open-payments")
public class PaymentsService {

@PostMapping("/domestic-payment-consents")
public ResponseEntity<?> createDomesticPaymentConsent(@RequestBody Map<String, Object> requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T08:34:43.275221Z",
                    "CreationDateTime", "2022-09-23T08:34:43.275221Z",
                    "ConsentId", "0d4b6692-xxxx-4938-xxxx-99e125231cf9",
                    "Initiation", Map.of(
                            "InstructionIdentification", "ID412",
                            "EndToEndIdentification", "E2E123",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            ),
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            )
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "EcommerceGoods",
                    "MerchantCategoryCode", "5967",
                    "MerchantCustomerIdentification", "1238808123123",
                    "DeliveryAddress", Map.of(
                            "AddressLine", List.of("7"),
                            "StreetName", "Apple Street",
                            "BuildingNumber", "1",
                            "PostCode", "E2 7AA",
                            "TownName", "London",
                            "Country", "UK"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-payment-consents/0d4b6692-xxxx-4938-xxxx-99e125231cf9"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.CREATED);
}

@GetMapping("/domestic-payment-consents/{consentId}")
public ResponseEntity<Map<String, Object>> getDomesticPaymentConsent(@PathVariable String consentId) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T08:34:43.275221Z",
                    "CreationDateTime", "2022-09-23T08:34:43.275221Z",
                    "ConsentId", "0d4b6692-xxxx-4938-xxxx-99e125231cf9",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructionIdentification", "ID412"
                    )
            ),
            "Risk", Map.of(
                    "DeliveryAddress", Map.of(
                            "Country", "UK",
                            "PostCode", "E2 7AA",
                            "TownName", "London",
                            "StreetName", "Apple Street",
                            "AddressLine", List.of("7"),
                            "BuildingNumber", "1"
                    ),
                    "PaymentContextCode", "EcommerceGoods",
                    "MerchantCategoryCode", "5967",
                    "MerchantCustomerIdentification", "1238808123123"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-payment-consents/0d4b6692-xxxx-4938-xxxx-99e125231cf9"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@GetMapping("/domestic-payment-consents/{consentId}/funds-confirmation")
public ResponseEntity<Map<String, Object>> getFundsConfirmation(@PathVariable String consentId) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "FundsAvailableResult", Map.of(
                            "FundsAvailableDateTime", "2022-09-23T09:08:27.508922Z",
                            "FundsAvailable", true
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-payment-consents/e3884854-be36-xxxx-xxxx-9ce807ab1335/funds-confirmation"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/domestic-payments")
public ResponseEntity<Map<String, Object>> createDomesticPayment(@RequestBody Map<String, Object> requestBody) {
    // Simulate processing the request
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "ec62477b-xxxx-41e2-xxxx-4d760c425a3e",
                    "CreationDateTime", "2022-09-23T14:57:45.899155Z",
                    "DomesticPaymentId", "632dc969-xxxx-ae29-xxxx-50cefc4ceae7",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "InstructionIdentification", "ID412",
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            )
                    ),
                    "Status", "AcceptedSettlementInProcess",
                    "StatusUpdateDateTime", "2022-09-23T14:57:45.899155Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-payments/632dc969-xxxx-ae29-xxxx-50cefc4ceae7"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.CREATED);
}

@GetMapping("/domestic-payments/{id}")
public ResponseEntity<Map<String, Object>> getDomesticPayment(@PathVariable String id) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "DomesticPaymentId", "637f57f9-4330-ad90-8692-95cc2a4f3334",
                    "Status", "AcceptedSettlementInProcess",
                    "StatusUpdateDateTime", "2022-11-24T11:39:37.841424Z",
                    "CreationDateTime", "2022-11-24T11:39:37.841424Z",
                    "ConsentId", "0cb5ccc0-5340-4c2a-8b6f-fce31148024d",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructionIdentification", "ID412"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.codes/domestic-payments/637f57f9-4330-ad90-8692-95cc2a4f3334"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/domestic-scheduled-payment-consents")
public ResponseEntity<Map<String, Object>> createDomesticScheduledPaymentConsent(@RequestBody Map<String, Object> requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T16:24:44.538265Z",
                    "CreationDateTime", "2022-09-23T16:24:44.538265Z",
                    "Permission", "Create",
                    "ConsentId", "334fxxxx-e6e8-xxxx-a823-acaf8c93a6af",
                    "Initiation", Map.of(
                            "InstructionIdentification", "ID412",
                            "EndToEndIdentification", "E2E123",
                            "RequestedExecutionDateTime", "2023-08-24T14:15:22Z",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            ),
                            "RemittanceInformation", Map.of(
                                    "Unstructured", "Shipment fee",
                                    "Reference", "ReceiverRef"
                            )
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-scheduled-payment-consents/334fxxxx-e6e8-xxxx-a823-acaf8c93a6af"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
    
}

@GetMapping("/domestic-scheduled-payment-consents/{consentId}")
public ResponseEntity<Map<String, Object>> getDomesticScheduledPaymentConsent(@PathVariable String consentId) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T16:30:48.724988Z",
                    "CreationDateTime", "2022-09-23T16:30:48.724988Z",
                    "Permission", "Create",
                    "ConsentId", "9709f508-xxxx-44bd-xxxx-94cb8d574d2f",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructionIdentification", "ID412",
                            "RequestedExecutionDateTime", "2023-08-24T14:15:22Z"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-scheduled-payment-consents/9709f508-xxxx-44bd-xxxx-94cb8d574d2f"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
    
}

@PostMapping("/domestic-scheduled-payments")
public ResponseEntity<Map<String, Object>> createDomesticScheduledPayment(@RequestBody Map<String, Object> requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "163cefc8-830b-xxxx-xxxx-34022a19a556",
                    "CreationDateTime", "2022-09-23T16:36:48.416214Z",
                    "DomesticScheduledPaymentId", "12345678-xxxx-422b-9270-482770c42379",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "InstructionIdentification", "ID412",
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            ),
                            "RequestedExecutionDateTime", "2023-08-24T14:15:22Z"
                    ),
                    "Permission", "Create",
                    "Status", "InitiationPending",
                    "StatusUpdateDateTime", "2022-09-23T16:36:48.416214Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-scheduled-payments/12345678-xxxx-422b-9270-482770c42379"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}

@GetMapping("/domestic-scheduled-payments/{id}")
public ResponseEntity<Map<String, Object>> getDomesticScheduledPayment(@PathVariable String id) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationPending",
                    "StatusUpdateDateTime", "2022-09-23T16:36:48.416214Z",
                    "CreationDateTime", "2022-09-23T16:36:48.416214Z",
                    "Permission", "Create",
                    "DomesticScheduledPaymentId", "12345678-xxxx-422b-9270-482770c42379",
                    "ConsentId", "163cefc8-830b-xxxx-xxxx-34022a19a556",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "RemittanceInformation", Map.of(
                                    "Reference", "ReceiverRef",
                                    "Unstructured", "Shipment fee"
                            ),
                            "EndToEndIdentification", "E2E123",
                            "InstructionIdentification", "ID412",
                            "RequestedExecutionDateTime", "2023-08-24T14:15:22Z"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-scheduled-payments/12345678-xxxx-422b-9270-482770c42379"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/domestic-standing-order-consents")
public ResponseEntity<Map<String, Object>> createDomesticStandingOrderConsent(@RequestBody Map<String, Object> requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T17:29:11.18491Z",
                    "CreationDateTime", "2022-09-23T17:29:11.18491Z",
                    "Permission", "Create",
                    "ConsentId", "a8987204-xxxx-4c26-xxxx-f7a3effea6f3",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "FirstPaymentDateTime", "2022-09-24T14:15:22Z",
                            "FirstPaymentAmount", Map.of(
                                    "Amount", "1.00",
                                    "Currency", "GBP"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            )
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-standing-order-consents/a8987204-xxxx-4c26-xxxx-f7a3effea6f3"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
    
}

@GetMapping("/domestic-standing-order-consents/{consentId}")
public ResponseEntity<Map<String, Object>> getDomesticStandingOrderConsent(@PathVariable String consentId) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-23T17:29:11.18491Z",
                    "CreationDateTime", "2022-09-23T17:29:11.18491Z",
                    "Permission", "Create",
                    "ConsentId", "a8987204-xxxx-4c26-xxxx-f7a3effea6f3",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "FirstPaymentAmount", Map.of(
                                    "Amount", "1.00",
                                    "Currency", "GBP"
                            ),
                            "FirstPaymentDateTime", "2022-09-24T14:15:22Z"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-standing-order-consents/a8987204-xxxx-4c26-xxxx-f7a3effea6f3"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
    
}

@PostMapping("/domestic-standing-orders")
public ResponseEntity<Map<String, Object>> createDomesticStandingOrder(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "a8987204-xxxx-4c26-xxxx-f7a3effea6f3",
                    "CreationDateTime", "2022-09-23T17:37:46.190063Z",
                    "DomesticStandingOrderId", "4c31965f-3de0-xxxx-8946-2f4f0e50dcda",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber"
                            ),
                            "FirstPaymentAmount", Map.of(
                                    "Amount", "1.00",
                                    "Currency", "GBP"
                            ),
                            "FirstPaymentDateTime", "2022-09-24T14:15:22Z",
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234"
                    ),
                    "Permission", "Create",
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-09-23T17:37:46.190063Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-standing-orders/4c31965f-3de0-xxxx-8946-2f4f0e50dcda"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}

@GetMapping("/domestic-standing-orders/{id}")
public ResponseEntity<Map<String, Object>> getDomesticStandingOrderById(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-09-23T17:37:46.190063Z",
                    "CreationDateTime", "2022-09-23T17:37:46.190063Z",
                    "Permission", "Create",
                    "DomesticStandingOrderId", "4c31965f-3de0-xxxx-8946-2f4f0e50dcda",
                    "ConsentId", "a8987204-xxxx-4c26-xxxx-f7a3effea6f3",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "NumberOfPayments", "1",
                            "FirstPaymentAmount", Map.of(
                                    "Amount", "1.00",
                                    "Currency", "GBP"
                            ),
                            "FirstPaymentDateTime", "2022-09-24T14:15:22Z",
                            "RecurringPaymentAmount", Map.of(
                                    "Amount", "1.00",
                                    "Currency", "GBP"
                            )
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/domestic-standing-orders/4c31965f-3de0-xxxx-8946-2f4f0e50dcda"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
    
}

// International Payment Consents
@PostMapping("/international-payment-consents")
public ResponseEntity<Map<String, Object>> createInternationalPaymentConsent(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-26T09:07:30.952882Z",
                    "CreationDateTime", "2022-09-26T09:07:30.952882Z",
                    "ConsentId", "3446d4b6-xxxx-4e4f-xxxx-6605eeff5d1f",
                    "Initiation", Map.of(
                            "InstructionIdentification", "Reference1234",
                            "EndToEndIdentification", "E2E1234",
                            "CurrencyOfTransfer", "EUR",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "EUR"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            )
                    ),
                    "ExchangeRateInformation", Map.of(
                            "UnitCurrency", "EUR",
                            "RateType", "Indicative",
                            "ExchangeRate", "1.0000"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-payment-consents/3446d4b6-xxxx-4e4f-xxxx-6605eeff5d1f"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
    
}

@GetMapping("/international-payment-consents/{consentId}")
public ResponseEntity<Map<String, Object>> getInternationalPaymentConsentById(@PathVariable String consentId, @RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-26T09:07:30.952882Z",
                    "CreationDateTime", "2022-09-26T09:07:30.952882Z",
                    "ConsentId", "3446d4b6-xxxx-4e4f-xxxx-6605eeff5d1f",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "EUR"
                            ),
                            "CurrencyOfTransfer", "EUR",
                            "EndToEndIdentification", "E2E1234",
                            "InstructionIdentification", "Reference1234"
                    ),
                    "ExchangeRateInformation", Map.of(
                            "UnitCurrency", "EUR",
                            "RateType", "Indicative",
                            "ExchangeRate", "1.0000"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-payment-consents/3446d4b6-xxxx-4e4f-xxxx-6605eeff5d1f"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

// International Payments
@PostMapping("/international-payments")
public ResponseEntity<Map<String, Object>> createInternationalPayment(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "2373df19-xxxx-43a9-xxxx-b5fd14e5920f",
                    "CreationDateTime", "2022-09-26T09:29:10.152499Z",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "EndToEndIdentification", "E2E1234",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "InstructionIdentification", "Reference1234"
                    ),
                    "InternationalPaymentId", "633170e6-xxxx-xxxx-xxxx-e90e7f88abee",
                    "Status", "AcceptedSettlementInProcess",
                    "StatusUpdateDateTime", "2022-09-26T09:29:10.152499Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-payments/633170e6-xxxx-xxxx-xxxx-e90e7f88abee"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.CREATED);
}

@GetMapping("/international-payments/{id}")
public ResponseEntity<Map<String, Object>> getInternationalPaymentById(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AcceptedSettlementCompleted",
                    "StatusUpdateDateTime", "2022-09-26T14:28:04.342276Z",
                    "CreationDateTime", "2022-09-26T14:28:00.178343Z",
                    "InternationalPaymentId", "12345678-6992-a81e-xxxx-01f9c376f047",
                    "ConsentId", "dd8b3bc7-xxxx-498e-xxxx-72d31ca13970",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "EndToEndIdentification", "E2E1234",
                            "InstructionIdentification", "Reference1234"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-payments/12345678-6992-a81e-xxxx-01f9c376f047"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

// International Payment Consents - Funds Confirmation
@GetMapping("/international-payment-consents/{consentId}/funds-confirmation")
public ResponseEntity<Map<String, Object>> getInternationalPaymentFundsConfirmation(@PathVariable String consentId, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "FundsAvailableResult", Map.of(
                            "FundsAvailableDateTime", "2022-09-26T14:13:46.585307Z",
                            "FundsAvailable", true
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-payment-consents/323673db-babc-xxxx-xxxx-148cd24c390e/funds-confirmation"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

// File Payment Consents
@PostMapping("/file-payment-consents")
public ResponseEntity<Map<String, Object>> createFilePaymentConsent(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingUpload",
                    "StatusUpdateDateTime", "2022-10-11T13:17:08.140705Z",
                    "CreationDateTime", "2022-10-11T13:17:08.140705Z",
                    "ConsentId", "d2ca7407-1234-466e-xxxx-00010770a4ff",
                    "Initiation", Map.of(
                            "FileType", "text/csv",
                            "FileHash", "7YuW8NQJ78/cHthltcqeJd1234BlATBS92IzoBXqQz0=",
                            "FileReference", "reference1234"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/file-payment-consents/d2ca7407-1234-466e-xxxx-00010770a4ff"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.CREATED);
}

@GetMapping("/file-payment-consents/{consentId}")
public ResponseEntity<Map<String, Object>> getFilePaymentConsentById(@PathVariable String consentId, @RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingUpload",
                    "StatusUpdateDateTime", "2022-11-22T17:16:28.350197Z",
                    "CreationDateTime", "2022-11-22T17:16:28.350197Z",
                    "ConsentId", "6fb10dd9-xxxx-yyyy-zzzz-430e37f8cea0",
                    "Initiation", Map.of(
                            "FileHash", "7YuW8NQJ78/cHthltcqeJd1234BlATBS92IzoBXqQz0=",
                            "FileType", "text/csv",
                            "FileReference", "reference1234"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.codes/file-payment-consents/6fb10dd9-xxxx-yyyy-zzzz-430e37f8cea0"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

// File Payments
@PostMapping("/file-payments")
public ResponseEntity<Map<String, Object>> createFilePayment(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "7ffe4969-1234-1234-acab-d24e89855fdd",
                    "CreationDateTime", "2022-10-12T14:06:27.883606Z",
                    "FilePaymentId", "6036c4d7-b311-xxxx-xxxx-b37a0a1395e0",
                    "Initiation", Map.of(
                            "FileHash", "7YuW8NQJ78/cHthltcqeJd1234BlATBS92IzoBXqQz0=",
                            "FileReference", "reference1234",
                            "FileType", "text/csv"
                    ),
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-10-12T14:06:27.883606Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/file-payments/6036c4d7-b311-xxxx-xxxx-b37a0a1395e0"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}

@PostMapping("/file-payment-consents/{consentId}/file")
public ResponseEntity<Map<String, Object>> uploadFilePayment(@PathVariable String consentId, @RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody Map<String, Object> request) {
    return new ResponseEntity<>(HttpStatus.OK);
}

@GetMapping("/file-payment-consents/{consentId}/file")
public ResponseEntity<String> getFilePaymentByConsentId(@PathVariable String consentId, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    String res = "Name,Recipient type,Account number,Sort code or Routing number,IBAN,BIC,Recipient bank country,Currency,Amount,Payment reference,Recipient country,State or province,Address line 1,Address line 2,City,Postal code\n" +
            "John Smith,INDIVIDUAL,40513598,207409,,,GB,GBP,10,User comment,GB,,Revolutest LTD,Somewhere in London,London,E14 5AB";
    return new ResponseEntity<>(res,HttpStatus.OK);
}

@GetMapping("/file-payments/{id}")
public ResponseEntity<?> getFilePayment(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-10-12T14:06:28.48358Z",
                    "CreationDateTime", "2022-10-12T14:06:27.883606Z",
                    "FilePaymentId", "6036c4d7-b311-xxxx-xxxx-b37a0a1395e0",
                    "ConsentId", "7ffe4969-1234-1234-acab-d24e89855fdd",
                    "Initiation", Map.of(
                            "FileHash", "7YuW8NQJ78/cHthltcqeJd1234BlATBS92IzoBXqQz0=",
                            "FileType", "text/csv",
                            "FileReference", "reference1234"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/file-payments/6036c4d7-b311-xxxx-xxxx-b37a0a1395e0"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

@GetMapping("/file-payments/{id}/report-file")
public ResponseEntity<?> getFilePaymentReport(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id") String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Payments", List.of(
                    Map.of(
                            "Amount", Map.of(
                                    "Amount", "10.00",
                                    "Currency", "GBP"
                            ),
                            "Reference", "User comment",
                            "Status", "Created"
                    )
            )
    );
    return new ResponseEntity<>(jsonMap,HttpStatus.OK);
}

@PostMapping("/international-scheduled-payment-consents")
public ResponseEntity<?> createInternationalScheduledPaymentConsent(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody String requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-27T07:21:28.523356Z",
                    "CreationDateTime", "2022-09-27T07:21:28.523356Z",
                    "Permission", "Create",
                    "ConsentId", "4c31ba68-aea8-xxxx-xxxx-12349fa9a975",
                    "Initiation", Map.of(
                            "InstructionIdentification", "Reference1234",
                            "EndToEndIdentification", "E2E1234",
                            "RequestedExecutionDateTime", "2022-10-01T14:15:22Z",
                            "CurrencyOfTransfer", "GBP",
                            "InstructedAmount", Map.of(
                                    "Amount", "12.0",
                                    "Currency", "GBP"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            )
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-scheduled-payment-consents/4c31ba68-aea8-xxxx-xxxx-12349fa9a975"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap , HttpStatus.CREATED);
}

@GetMapping("/international-scheduled-payment-consents/{consentId}")
public ResponseEntity<?> getInternationalScheduledPaymentConsent(@PathVariable String consentId, @RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-27T07:21:28.523356Z",
                    "CreationDateTime", "2022-09-27T07:21:28.523356Z",
                    "Permission", "Create",
                    "ConsentId", "4c31ba68-aea8-xxxx-xxxx-12349fa9a975",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "12.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "EndToEndIdentification", "E2E1234",
                            "InstructionIdentification", "Reference1234",
                            "RequestedExecutionDateTime", "2022-10-01T14:15:22Z"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-scheduled-payment-consents/4c31ba68-aea8-xxxx-xxxx-12349fa9a975"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/international-scheduled-payments")
public ResponseEntity<?> createInternationalScheduledPayment(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody String requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationPending",
                    "StatusUpdateDateTime", "2022-09-27T07:35:53.474112Z",
                    "CreationDateTime", "2022-09-27T07:35:53.474112Z",
                    "InternationalScheduledPaymentId", "12345678-a0de-466a-1234-e9fc413d0916",
                    "Permission", "Create",
                    "ConsentId", "14aee295-xxxx-4147-xxxx-a397c3e5ff9d",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "12.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "EndToEndIdentification", "E2E1234",
                            "InstructionIdentification", "Reference1234",
                            "RequestedExecutionDateTime", "2022-10-01T14:15:22Z"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-scheduled-payments/12345678-a0de-466a-1234-e9fc413d0916"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}
@GetMapping("/international-scheduled-payment-consents/{consentId}/funds-confirmation")
public ResponseEntity<?> getSchduledFundsConfirmation(@PathVariable String consentId, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "FundsAvailableResult", Map.of(
                            "FundsAvailableDateTime", "2022-09-27T07:45:59.760463Z",
                            "FundsAvailable", true
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-scheduled-payment-consents/0e3c0734-fb1c-4d9d-a275-123412341111/funds-confirmation"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@GetMapping("/international-scheduled-payments/{id}")
public ResponseEntity<?> getInternationalScheduledPayment(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationPending",
                    "StatusUpdateDateTime", "2022-09-27T07:35:53.474112Z",
                    "CreationDateTime", "2022-09-27T07:35:53.474112Z",
                    "InternationalScheduledPaymentId", "12345678-a0de-466a-1234-e9fc413d0916",
                    "Permission", "Create",
                    "ConsentId", "14aee295-xxxx-4147-xxxx-a397c3e5ff9d",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "12.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "EndToEndIdentification", "E2E1234",
                            "InstructionIdentification", "Reference1234",
                            "RequestedExecutionDateTime", "2022-10-01T14:15:22Z"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-scheduled-payments/12345678-a0de-466a-1234-e9fc413d0916"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/international-standing-order-consents")
public ResponseEntity<?> createInternationalStandingOrderConsent(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody String requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-27T08:20:12.498289Z",
                    "CreationDateTime", "2022-09-27T08:20:12.498289Z",
                    "Permission", "Create",
                    "ConsentId", "b918fd8a-xxx-xxx-xxx-27a984683bd1",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "FirstPaymentDateTime", "2022-10-01T14:15:22Z",
                            "CurrencyOfTransfer", "GBP",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CreditorAccount", Map.of(
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co."
                            )
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-standing-order-consents/b918fd8a-xxx-xxx-xxx-27a984683bd1"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}

@GetMapping("/international-standing-order-consents/{consentId}")
public ResponseEntity<?> getInternationalStandingOrderConsent(@PathVariable String consentId, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "AwaitingAuthorisation",
                    "StatusUpdateDateTime", "2022-09-27T08:20:12.498289Z",
                    "CreationDateTime", "2022-09-27T08:20:12.498289Z",
                    "Permission", "Create",
                    "ConsentId", "b918fd8a-xxx-xxx-xxx-27a984683bd1",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "FirstPaymentDateTime", "2022-10-01T14:15:22Z"
                    )
            ),
            "Risk", Map.of(
                    "PaymentContextCode", "BillPayment"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-standing-order-consents/b918fd8a-xxx-xxx-xxx-27a984683bd1"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);}

@PostMapping("/international-standing-orders")
public ResponseEntity<?> createInternationalStandingOrder(@RequestHeader("x-fapi-financial-id") String financialId, @RequestHeader("Authorization") String authorization, @RequestHeader(value = "x-jws-signature", required = false) String jwsSignature, @RequestHeader(value = "x-idempotency-key", required = false) String idempotencyKey, @RequestHeader(value = "Content-Type", required = false) String contentType, @RequestBody String requestBody) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "ConsentId", "b918fd8a-xxx-xxx-xxx-27a984683bd1",
                    "CreationDateTime", "2022-09-27T08:42:10.249638Z",
                    "Initiation", Map.of(
                            "CreditorAccount", Map.of(
                                    "Identification", "11223321325698",
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "FirstPaymentDateTime", "2022-10-01T14:15:22Z",
                            "Frequency", "EvryDay",
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "Reference", "Reference1234"
                    ),
                    "InternationalStandingOrderId", "b3096891-1234-1234-ae1e-1c8a6fbc5874",
                    "Permission", "Create",
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-09-27T08:42:10.249638Z"
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-standing-orders/b3096891-1234-1234-ae1e-1c8a6fbc5874"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.CREATED);
}

@GetMapping("/international-standing-orders/{id}")
public ResponseEntity<?> getInternationalStandingOrder(@PathVariable String id, @RequestHeader(value = "x-fapi-financial-id", required = false) String financialId, @RequestHeader(value = "Authorization", required = false) String authorization) {
    Map<String, Object> jsonMap = Map.of(
            "Data", Map.of(
                    "Status", "InitiationCompleted",
                    "StatusUpdateDateTime", "2022-09-27T08:42:10.249638Z",
                    "CreationDateTime", "2022-09-27T08:42:10.249638Z",
                    "Permission", "Create",
                    "InternationalStandingOrderId", "12345678-54c1-45ff-xxxx-1c8a6fbc5874",
                    "ConsentId", "b918fd8a-xxx-xxx-xxx-27a984683bd1",
                    "Initiation", Map.of(
                            "Frequency", "EvryDay",
                            "Reference", "Reference1234",
                            "CreditorAccount", Map.of(
                                    "Name", "Receiver Co.",
                                    "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                    "Identification", "11223321325698"
                            ),
                            "InstructedAmount", Map.of(
                                    "Amount", "10.0",
                                    "Currency", "GBP"
                            ),
                            "CurrencyOfTransfer", "GBP",
                            "FirstPaymentDateTime", "2022-10-01T14:15:22Z"
                    )
            ),
            "Links", Map.of(
                    "Self", "https://oba.revolut.com/international-standing-orders/12345678-54c1-45ff-xxxx-1c8a6fbc5874"
            ),
            "Meta", Map.of(
                    "TotalPages", 1
            )
    );
    return new ResponseEntity<>(jsonMap, HttpStatus.OK);
}

@PostMapping("/token")
public ResponseEntity<?> getAccessToken(@RequestBody String requestBody) {
    Map<String, Object> tokenMap = Map.of(
            "access_token", "eyJraWQi...REDACTED_JWT...DvTWUSVpivBpYwH6r9gw",
            "token_type", "Bearer",
            "expires_in", 2399
    );
    return new ResponseEntity<>(tokenMap, HttpStatus.OK);
}
}
