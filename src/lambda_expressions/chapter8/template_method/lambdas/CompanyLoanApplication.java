package lambda_expressions.chapter8.template_method.lambdas;

import lambda_expressions.chapter8.template_method.Company;

/**
 * Created by hadeslee on 2016-09-24.
 */
public class CompanyLoanApplication extends LoanApplication {
    public CompanyLoanApplication(Company company) {
        super(company::checkIdentity,
                company::checkHistoricalDebt,
                company::checkProfitAndLoss);
    }
}
