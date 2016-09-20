package lambda_expressions.chapter8.template_method;

/**
 * Created by hadeslee on 2016-09-21.
 */
public interface Company {
    // BEGIN checkSignatures
    public void checkIdentity() throws ApplicationDenied;

    public void checkProfitAndLoss() throws ApplicationDenied;

    public void checkHistoricalDebt() throws ApplicationDenied;
    // END checkSignatures

}
