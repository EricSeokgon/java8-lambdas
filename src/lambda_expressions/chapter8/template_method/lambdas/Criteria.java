package lambda_expressions.chapter8.template_method.lambdas;

import lambda_expressions.chapter8.template_method.ApplicationDenied;

/**
 * Project: java8-lambdas
 * FileName: Criteria
 * Date: 2016-09-22
 * Time: 오전 9:22
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface Criteria {
    public void check() throws ApplicationDenied;
}
