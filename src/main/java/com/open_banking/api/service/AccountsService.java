package com.open_banking.api.service;


import io.apiwiz.compliance.config.EnableCompliance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Map;

@RestController
@EnableCompliance
@RequestMapping("/merchant-accounts")
public class AccountsService {


@PostMapping(value = "token", consumes = "application/x-www-form-urlencoded")
public ResponseEntity<Map<String, Object>> getAccessToken(@RequestParam Map<String, String> authTokenReq) {
        Map<String, Object> tokenResponse = Map.of(
                "access_token", "eyJraWQi...REDACTED_JWT...DvTWUSVpivBpYwH6r9gw",
                "token_type", "Bearer",
                "expires_in", 2399
        );
        return new ResponseEntity<>(tokenResponse, HttpStatus.CREATED);
    }
    
    @PostMapping("/account-access-consents")
    public ResponseEntity<Map<String, Object>> createAccountAccessConsent(@RequestBody Map<String, Object> request) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Status", "Authorized",
                        "StatusUpdateDateTime", "2022-09-22T11:47:10.366163Z",
                        "CreationDateTime", "2022-09-22T11:47:10.366163Z",
                        "TransactionToDateTime", "2022-12-03T00:00:00+00:00",
                        "ExpirationDateTime", "2022-12-02T00:00:00+00:00",
                        "Permissions", List.of(
                                "ReadAccountsBasic",
                                "ReadAccountsDetail"
                        ),
                        "ConsentId", "e0bdfd78-2388-xxxx-xxxx-acc0b84c9210",
                        "TransactionFromDateTime", "2022-09-03T00:00:00+00:00"
                ),
                "Risk", Map.of(),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/account-access-consents"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse,HttpStatus.CREATED);
    }
    
    @GetMapping("/accounts/account-access-consents/{consentId}")
    public ResponseEntity<Map<String, Object>> getAccountAccessConsentById(@PathVariable String consentId) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Status", "AwaitingAuthorisation",
                        "StatusUpdateDateTime", "2022-09-22T11:47:10.366163Z",
                        "CreationDateTime", "2022-09-22T11:47:10.366163Z",
                        "TransactionToDateTime", "2022-12-03T00:00:00+00:00",
                        "ExpirationDateTime", "2022-12-02T00:00:00+00:00",
                        "Permissions", List.of(
                                "ReadAccountsBasic",
                                "ReadAccountsDetail"
                        ),
                        "ConsentId", "e0bdfd78-2388-xxxx-xxxx-acc0b84c9210",
                        "TransactionFromDateTime", "2022-09-03T00:00:00+00:00"
                ),
                "Risk", Map.of(),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/account-access-consents/e0bdfd78-2388-xxxx-xxxx-acc0b84c9210"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse,HttpStatus.OK);
    }
    
    @DeleteMapping("/account-access-consents/{consentId}")
    public ResponseEntity<Void> deleteAccountAccessConsentById(@PathVariable String consentId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/accounts")
    public ResponseEntity<?> getAllAccounts(@RequestHeader (value = "x-fapi-financial-id", required = false) String xfapId,
                                            @RequestHeader (value= "Authorization") String Authorization ) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Account", List.of(
                                Map.of(
                                        "AccountId", "d3779729-c3r5-b5dd-bb43-fb5159b7c166",
                                        "Currency", "GBP",
                                        "AccountType", "Personal",
                                        "AccountSubType", "CurrentAccount",
                                        "Account", List.of(
                                                Map.of(
                                                        "SchemeName", "UK.OBIE.IBAN",
                                                        "Identification", "GB95REVO00997053872360",
                                                        "Name", "John Smith"
                                                ),
                                                Map.of(
                                                        "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                                        "Identification", "00000001611667",
                                                        "Name", "John Smith"
                                                )
                                        )
                                )
                        )
                ),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/accounts"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse ,HttpStatus.OK);
    }
    
    @GetMapping("/accounts/accounts/{id}")
    public ResponseEntity<Map<String, Object>> getAccountById(@PathVariable String id) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Account", List.of(
                                Map.of(
                                        "AccountId", "d3779729-xxxx-xxxx-bb43-fb5159b7c166",
                                        "Currency", "GBP",
                                        "AccountType", "Personal",
                                        "AccountSubType", "CurrentAccount",
                                        "Account", List.of(
                                                Map.of(
                                                        "SchemeName", "UK.OBIE.IBAN",
                                                        "Identification", "GB95REVO00997053872360",
                                                        "Name", "John Smith"
                                                ),
                                                Map.of(
                                                        "SchemeName", "UK.OBIE.SortCodeAccountNumber",
                                                        "Identification", "00000001611667",
                                                        "Name", "John Smith"
                                                )
                                        )
                                )
                        )
                ),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/accounts/d3779729-xxxx-xxxx-bb43-fb5159b7c166"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
    
    @GetMapping("/accounts/{id}/balances")
    public ResponseEntity<Map<String, Object>> getAccountBalanceById(@PathVariable String id) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Balance", List.of(
                                Map.of(
                                        "AccountId", "d3779729-xxxx-xxxx-bb43-fb5159b7c166",
                                        "Amount", Map.of(
                                                "Amount", "970.49",
                                                "Currency", "GBP"
                                        ),
                                        "CreditDebitIndicator", "Credit",
                                        "Type", "InterimAvailable",
                                        "DateTime", "2022-09-22T08:32:02.775972Z"
                                )
                        )
                ),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/accounts/d3779729-xxxx-xxxx-bb43-fb5159b7c166/balances"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
    
    @GetMapping("/accounts/{id}/beneficiaries")
    public ResponseEntity<?> getAccountBeneficiariesById(@PathVariable String id) {
        Map<String, Object> jsonResponse = Map.of(
                "Data", Map.of(
                        "Beneficiary", List.of(
                                Map.of(
                                        "AccountId", "d3779729-xxxx-xxxx-bb43-fb5159b7c166",
                                        "BeneficiaryId", "619e270c-989f-44ca-1234-a161be65d5f4"
                                )
                        )
                ),
                "Links", Map.of(
                        "Self", "https://oba.revolut.com/accounts/d3779729-xxxx-xxxx-bb43-fb5159b7c166/beneficiaries"
                ),
                "Meta", Map.of(
                        "TotalPages", 1
                )
        );
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
    
    @GetMapping("/accounts/{id}/direct-debits")
    public ResponseEntity<?> getAccountDirectDebitsById(@PathVariable String id) {
        Map<String, Object> directDebitData = Map.ofEntries(
                Map.entry("Data", Map.ofEntries(
                        Map.entry("DirectDebit", List.of(Map.ofEntries(
                                Map.entry("AccountId", "d48e9496-xxxx-4af1-xxxx-8b20fc362bd3"),
                                Map.entry("DirectDebitId", "631b8ea1-5678-48d1-1234-25ccba25eb40"),
                                Map.entry("MandateIdentification", "a028-45ee"),
                                Map.entry("DirectDebitStatusCode", "Active"),
                                Map.entry("Name", "DirectDebit name"),
                                Map.entry("PreviousPaymentAmount", Map.ofEntries(
                                        Map.entry("Amount", "50.00"),
                                        Map.entry("Currency", "EUR")
                                ))
                        )))
                )),
                Map.entry("Links", Map.ofEntries(
                        Map.entry("Self", "https://oba.revolut.com/accounts/d48e9496-xxxx-4af1-xxxx-8b20fc362bd3/direct-debits")
                )),
                Map.entry("Meta", Map.ofEntries(
                        Map.entry("TotalPages", 1)
                ))
        );
        return new ResponseEntity<>(directDebitData,HttpStatus.OK);
    }
    
    @GetMapping("/accounts/{id}/standing-orders")
    public ResponseEntity<?> getAccountStandingOrdersById(@PathVariable String id) {
        Map<String, Object> standingOrderData = Map.ofEntries(
                Map.entry("Data", Map.ofEntries(
                        Map.entry("StandingOrder", List.of(Map.ofEntries(
                                Map.entry("AccountId", "d48e9496-xxxx-4af1-xxxx-8b20fc362bd3"),
                                Map.entry("StandingOrderId", "fb02306c-1234-4260-5678-371ea6dc6ea3"),
                                Map.entry("Frequency", "EvryDay"),
                                Map.entry("Reference", "Reference1234"),
                                Map.entry("FirstPaymentDateTime", "2023-09-24T00:00"),
                                Map.entry("StandingOrderStatusCode", "Active"),
                                Map.entry("CreditorAccount", Map.ofEntries(
                                        Map.entry("SchemeName", "UK.OBIE.SortCodeAccountNumber"),
                                        Map.entry("Identification", "11223321325698"),
                                        Map.entry("Name", "Receiver Co.")
                                ))
                        )))
                )),
                Map.entry("Links", Map.ofEntries(
                        Map.entry("Self", "https://oba.revolut.com/accounts/d48e9496-xxxx-4af1-xxxx-8b20fc362bd3/standing-orders")
                )),
                Map.entry("Meta", Map.ofEntries(
                        Map.entry("TotalPages", 1)
                ))
        );
        return new ResponseEntity<>(standingOrderData,HttpStatus.OK);
    }
    
    
    @GetMapping("/accounts/{id}/transactions")
    public ResponseEntity<?> getAccountTransactionsById(
            @PathVariable String id,
            @RequestParam(required = false) String fromBookingDateTime,
            @RequestParam(required = false) String toBookingDateTime) {
        Map<String, Object> transactionData = Map.ofEntries(
                Map.entry("Data", Map.ofEntries(
                        Map.entry("Transaction", List.of(
                                Map.ofEntries(
                                        Map.entry("AccountId", "c362263a-xxxx-xxxx-xxxx-70ee3d4fede9"),
                                        Map.entry("Amount", Map.ofEntries(
                                                Map.entry("Amount", "2.21"),
                                                Map.entry("Currency", "EUR")
                                        )),
                                        Map.entry("Balance", Map.ofEntries(
                                                Map.entry("Amount", Map.ofEntries(
                                                        Map.entry("Amount", "24.48"),
                                                        Map.entry("Currency", "EUR")
                                                )),
                                                Map.entry("CreditDebitIndicator", "Credit"),
                                                Map.entry("Type", "InterimBooked")
                                        )),
                                        Map.entry("BookingDateTime", "2022-07-07T12:56:38.015220Z"),
                                        Map.entry("ValueDateTime", "2022-07-07T12:56:38.015693Z"),
                                        Map.entry("CreditDebitIndicator", "Credit"),
                                        Map.entry("CurrencyExchange", Map.ofEntries(
                                                Map.entry("InstructedAmount", Map.ofEntries(
                                                        Map.entry("Amount", "2.21"),
                                                        Map.entry("Currency", "EUR")
                                                )),
                                                Map.entry("SourceCurrency", "GBP"),
                                                Map.entry("TargetCurrency", "EUR"),
                                                Map.entry("UnitCurrency", "GBP"),
                                                Map.entry("ExchangeRate", "1.1072646654")
                                        )),
                                        Map.entry("ProprietaryBankTransactionCode", Map.ofEntries(
                                                Map.entry("Code", "EXCHANGE"),
                                                Map.entry("Issuer", "Revolut")
                                        )),
                                        Map.entry("Status", "Booked"),
                                        Map.entry("TransactionId", "12345678-af30-a241-xxxx-ad09076be3b1"),
                                        Map.entry("TransactionInformation", "To EUR")
                                ),
                                Map.ofEntries(
                                        Map.entry("AccountId", "c362263a-xxxx-xxxx-xxxx-70ee3d4fede9"),
                                        Map.entry("Amount", Map.ofEntries(
                                                Map.entry("Amount", "1.44"),
                                                Map.entry("Currency", "EUR")
                                        )),
                                        Map.entry("Balance", Map.ofEntries(
                                                Map.entry("Amount", Map.ofEntries(
                                                        Map.entry("Amount", "22.27"),
                                                        Map.entry("Currency", "EUR")
                                                )),
                                                Map.entry("CreditDebitIndicator", "Credit"),
                                                Map.entry("Type", "InterimBooked")
                                        )),
                                        Map.entry("BookingDateTime", "2022-03-15T16:50:45.699284Z"),
                                        Map.entry("ValueDateTime", "2022-03-15T16:50:45.699801Z"),
                                        Map.entry("CreditDebitIndicator", "Debit"),
                                        Map.entry("ProprietaryBankTransactionCode", Map.ofEntries(
                                                Map.entry("Code", "FEE"),
                                                Map.entry("Issuer", "Revolut")
                                        )),
                                        Map.entry("Status", "Booked"),
                                        Map.entry("TransactionId", "12345678-e395-aa34-xxxx-6fdcaebecade"),
                                        Map.entry("TransactionInformation", "Revolut Reader Purchase")
                                ),
                                Map.ofEntries(
                                        Map.entry("AccountId", "c362263a-xxxx-xxxx-xxxx-70ee3d4fede9"),
                                        Map.entry("Amount", Map.ofEntries(
                                                Map.entry("Amount", "50.00"),
                                                Map.entry("Currency", "EUR")
                                        )),
                                        Map.entry("BookingDateTime", "2022-03-02T14:59:47.858147Z"),
                                        Map.entry("CreditDebitIndicator", "Credit"),
                                        Map.entry("ProprietaryBankTransactionCode", Map.ofEntries(
                                                Map.entry("Code", "MERCHANT_PAYMENT"),
                                                Map.entry("Issuer", "Revolut")
                                        )),
                                        Map.entry("Status", "Pending"),
                                        Map.entry("TransactionId", "12345678-73d3-adfc-xxxx-df68e72b786d"),
                                        Map.entry("TransactionInformation", "Merchant payment")
                                )
                        ))
                )),
                Map.entry("Links", Map.ofEntries(
                        Map.entry("Self", "https://oba.revolut.com/accounts/c362263a-xxxx-xxxx-xxxx-70ee3d4fede9/transactions"),
                        Map.entry("Next", "https://oba.revolut.com/accounts/c362263a-xxxx-xxxx-xxxx-70ee3d4fede9/transactions?fromBookingDateTime=2021-10-07T23:08:52.504313&toBookingDateTime=2022-03-02T14:59:47.858147")
                )),
                Map.entry("Meta", Map.ofEntries())
        );
        return new ResponseEntity<>(transactionData, HttpStatus.OK);
    }
}
