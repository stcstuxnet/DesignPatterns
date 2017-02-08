/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessDelegatePattern;

/**
 *
 * @author Ali-PC
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }

    public void doTask() {
        businessService.doTask();
    }

}
