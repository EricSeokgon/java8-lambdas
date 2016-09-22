package lambda_expressions.chapter8.template_method.lambdas;

import lambda_expressions.chapter8.template_method.ApplicationDenied;

/**
 * Created by hadeslee on 2016-09-23.
 */
public class LoanApplication {
    private final Criteria identity;
    private final Criteria creditHistory;
    private final Criteria incomeHistory;

    public LoanApplication(Criteria identity,
                           Criteria creditHistory,
                           Criteria incomeHistory) {

        this.identity = identity;
        this.creditHistory = creditHistory;
        this.incomeHistory = incomeHistory;
    }

    public void checkLoanApplication() throws ApplicationDenied {
        identity.check();
        creditHistory.check();
        incomeHistory.check();
        reportFindings();
    }

    private void reportFindings() {
// END LoanApplication

    }

}

