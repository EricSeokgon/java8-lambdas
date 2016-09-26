package lambda_expressions.chapter8.template_method.traditional;

import lambda_expressions.chapter8.template_method.ApplicationDenied;

/**
 * Project: java8-lambdas
 * FileName: LoanApplication
 * Date: 2016-09-26
 * Time: 오전 9:02
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public abstract class LoanApplication {

    public void checkLoanApplication() throws ApplicationDenied {
        checkIdentity();
        checkCreditHistory();
        checkIncomeHistory();
        reportFindings();
    }

    protected abstract void checkIdentity() throws ApplicationDenied;

    protected abstract void checkIncomeHistory() throws ApplicationDenied;

    protected abstract void checkCreditHistory() throws ApplicationDenied;

    private void reportFindings() {
// END LoanApplication

    }

}
